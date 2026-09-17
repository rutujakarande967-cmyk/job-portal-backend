package com.rutuja.job_portal_backend.controller;

import com.rutuja.job_portal_backend.model.Job;
import com.rutuja.job_portal_backend.repository.JobRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    // GET all jobs
    @GetMapping
    public List<Job> getJobs() {
        return jobRepository.findAll();
    }

    // GET job by ID
    @GetMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        return jobRepository.findById(id)
                .orElseThrow(() -> new JobNotFoundException("Job not found with id: " + id));
    }

    // POST a new job
    @PostMapping
    public Job addJob(@Valid @RequestBody Job job) {
        return jobRepository.save(job);
    }

    // PUT update job
    @PutMapping("/{id}")
    public Job updateJob(@PathVariable int id, @Valid @RequestBody Job job) {
        job.setId(id);
        return jobRepository.save(job);
    }

    // DELETE a job
    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable int id) {
        jobRepository.deleteById(id);
        return "Job deleted successfully";
    }

    // Search jobs by keyword
    @GetMapping("/search")
    public List<Job> searchJobs(@RequestParam String keyword) {
        return jobRepository
                .findByTitleContainingIgnoreCaseOrCompanyContainingIgnoreCaseOrSkillsContainingIgnoreCase(
                        keyword, keyword, keyword
                );
    }

    // Filter jobs by location
    @GetMapping("/location/{location}")
    public List<Job> getJobsByLocation(@PathVariable String location) {
        return jobRepository.findByLocationIgnoreCase(location);
    }

    // Filter jobs by minimum salary
    @GetMapping("/salary/{salary}")
    public List<Job> getJobsBySalary(@PathVariable double salary) {
        return jobRepository.findBySalaryGreaterThanEqual(salary);
    }

    // Filter jobs by job type
    @GetMapping("/type/{jobType}")
    public List<Job> getJobsByJobType(@PathVariable String jobType) {
        return jobRepository.findByJobTypeIgnoreCase(jobType);
    }

    // Filter jobs by experience
    @GetMapping("/experience/{experience}")
    public List<Job> getJobsByExperience(@PathVariable String experience) {
        return jobRepository.findByExperienceIgnoreCase(experience);
    }
}
