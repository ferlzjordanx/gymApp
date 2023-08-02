package com.example.gymApp.dao;

import com.example.gymApp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface user extends JpaRepository<Person, Integer> {


}
