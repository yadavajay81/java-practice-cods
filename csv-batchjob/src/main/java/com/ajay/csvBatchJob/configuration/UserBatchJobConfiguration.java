package com.ajay.csvBatchJob.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.ajay.csvBatchJob.model.User;

@Configuration
@EnableBatchProcessing
public class UserBatchJobConfiguration {
	
	 	@Autowired
	    private JobBuilderFactory jb;

	    @Autowired
	    private StepBuilderFactory sb;
	
	@Bean
	public FlatFileItemReader<User> reader(){
		return new FlatFileItemReaderBuilder<User>()
				.name("userItemReader")
				.resource(new ClassPathResource("users.csv"))
				.delimited()
				.names("name","email")
				.targetType(User.class)
				.build();
	}
	
	@Bean
	public ItemProcessor<User, User> processor(){
		return user -> { 
			user.setEmail(user.getEmail().toLowerCase());
			return user;
		};
	}
	
	@Bean
    public JdbcBatchItemWriter<User> writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<User>()
                .sql("INSERT INTO users (name, email) VALUES (:name, :email)")
                .dataSource(dataSource)
                .beanMapped()
                .build();
    }
	
	@Bean
    public Job importUserJob(JobCompletionNotificationListener listener, Step step1) {
        return jb.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }
	@Bean
    public Step step1(JdbcBatchItemWriter<User> writer) {
        return sb.get("step1")
                .<User, User>chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer)
                .build();
    }

}
