package com.luv2code.springbootlibrary.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springbootlibrary.entity.Newbook;

public interface NewbookRepository extends JpaRepository<Newbook, Long> {

}
