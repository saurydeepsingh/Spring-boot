package com.Spring.jpa.Spring.data.jpa.ex2;

import com.Spring.jpa.Spring.data.jpa.ex2.Model.Studentjpa;
import com.Spring.jpa.Spring.data.jpa.ex2.Model.Studentjpa;
import com.Spring.jpa.Spring.data.jpa.ex2.Repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaEx2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDataJpaEx2Application.class, args);
		Studentjpa s1=context.getBean(Studentjpa.class);
		Studentjpa s2=context.getBean(Studentjpa.class);
		Studentjpa s3=context.getBean(Studentjpa.class);

		StudentRepo Repo=context.getBean(StudentRepo.class);

		s1.setRollno(101);
		s1.setMarks(99);
		s1.setName("Saurydeep Singh");

		s2.setRollno(102);
		s2.setMarks(100);
		s2.setName("Sanjana Singh");

		s3.setRollno(103);
		s3.setMarks(97);
		s3.setName("Sani Singh");

		Repo.save(s1);
		Repo.save(s2);
		Repo.save(s3);
	}

}

