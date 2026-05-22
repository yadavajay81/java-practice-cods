package com.ajay.taskman.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Table(name = "tasks")
@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    @Column(unique = true, length = 200, nullable = false)
    private String name;

    @Lob
    private String description;

    @Column(nullable = false, columnDefinition = "varchar(20) not null default 'PENDING'")
    @Enumerated(EnumType.STRING)
    private TaskStatusEnum status;

    @Column(name = "due_date")
    private Date dueDate;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;
    
    
    // Getter, setter and toString() methods here...
}