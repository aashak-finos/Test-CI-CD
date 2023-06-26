package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import com.example.Pojo.Pojo;
import com.example.testRepo.TestRepo;


@Service

public class ServiceFile {
	@Autowired(required = true)
	private TestRepo repo;
//	

	public ServiceFile(TestRepo repo) { 
		this.repo = repo;
	}
	
	public void add(Pojo data) {
		repo.save(data);
	}
	
	public Pojo getdata(Long Id) {
		System.out.println("GetData"+repo.findById(Id));
		return repo.findById(Id);
	}

}
