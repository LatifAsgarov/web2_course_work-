package com.example.youtubePractiseProject.repisotory;

import com.example.youtubePractiseProject.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {



}
