package com.rutuja.job_portal_backend.controller;


    public class JobNotFoundException extends RuntimeException {

        public JobNotFoundException(String message) {
            super(message);
        }
    }