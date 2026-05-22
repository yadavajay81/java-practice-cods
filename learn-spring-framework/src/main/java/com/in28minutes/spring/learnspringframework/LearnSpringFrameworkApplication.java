package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
//@ComponentScan("com.in28minutes.spring.learnspringframework") //default scan current package
//@ComponentScan({"com.package1","com.package2","com.package3"})  //scan multiple package
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//PacmanGame game = new PacmanGame();
		//GamingConsole game = new MarioGame();
		//GameRunner runner = new GameRunner(game);
		
		ConfigurableApplicationContext context 
				= SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
