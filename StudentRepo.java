package com.Spring.jpa.Spring.data.jpa.ex2.Repo;

import com.Spring.jpa.Spring.data.jpa.ex2.Model.Studentjpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Studentjpa, Integer> {
     List<Studentjpa> findbyname(String name);
     List<Studentjpa> findbymarks(int marks);

}
