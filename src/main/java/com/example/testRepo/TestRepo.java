package com.example.testRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Pojo.Pojo;

public interface  TestRepo extends JpaRepository<Pojo, Integer>{

	Pojo findById(Long id);


}
