package com.rutuja.job_portal_backend.repository;

import com.rutuja.job_portal_backend.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Integer> {

    // Search by title, company or skills
    List<Job> findByTitleContainingIgnoreCaseOrCompanyContainingIgnoreCaseOrSkillsContainingIgnoreCase(
            String title,
            String company,
            String skills
    );

    // Filter by location
    List<Job> findByLocationIgnoreCase(String location);

    // Filter by minimum salary
    List<Job> findBySalaryGreaterThanEqual(double salary);

    // Filter by job type
    List<Job> findByJobTypeIgnoreCase(String jobType);

    // Filter by experience
    List<Job> findByExperienceIgnoreCase(String experience);
}