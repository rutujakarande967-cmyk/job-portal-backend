package com.rutuja.job_portal_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;



import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Job {

    @Id
    private Integer id;


    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Company is required")
    private String company;

    @NotBlank(message = "Location is required")
    private String location;

    @Positive(message = "Salary must be greater than 0")
    private double salary;


    private String jobType;
    private String experience;

    @NotBlank(message = "Skills are required")
    private String skills;

    private String description;
    private String postedDate;

    public Job() {
    }

    public Job(Integer id, String title, String company, String location,
               double salary, String jobType, String experience,
               String skills, String description, String postedDate) {

        this.id = id;
        this.title = title;
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.jobType = jobType;
        this.experience = experience;
        this.skills = skills;
        this.description = description;
        this.postedDate = postedDate;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public double getSalary() {
        return salary;
    }

    public String getJobType() {
        return jobType;
    }

    public String getExperience() {
        return experience;
    }

    public String getSkills() {
        return skills;
    }

    public String getDescription() {
        return description;
    }

    public String getPostedDate() {
        return postedDate;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }
}