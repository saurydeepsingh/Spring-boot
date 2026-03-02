package com.Spring.jpa.Spring.data.jpa.ex2.Repo;

import com.Spring.jpa.Spring.data.jpa.ex2.Model.Studentjpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Studentjpa, Integer> {
}
