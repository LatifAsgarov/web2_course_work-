package com.example.youtubePractiseProject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "STUDENT") // Explicitly specifying the table name, though not necessary if naming conventions are followed
public class Student {
    @Id
    @Column(name = "Student_ID")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;
    @ManyToMany
            @JoinTable(name = "Student_Course", joinColumns = @JoinColumn(name= "Student_ID" ),
                    inverseJoinColumns = @JoinColumn(name = "Course_ID"))
    List<Course> courses;
    public Student() {
        // Default constructor
    }

    public Student(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // Standard getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname; // Fixed to correctly assign the surname
    }
}
