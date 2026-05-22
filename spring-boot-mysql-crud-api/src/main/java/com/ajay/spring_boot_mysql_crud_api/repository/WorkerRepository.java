package com.ajay.spring_boot_mysql_crud_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajay.spring_boot_mysql_crud_api.entity.Worker;

@Repository
public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
