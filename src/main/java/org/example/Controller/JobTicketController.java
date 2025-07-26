package org.example.Controller;

import org.example.Model.JobInfo;
import org.example.Services.JobTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobTicketController {

    @Autowired
    private JobTicketService service;

    @PostMapping
    public ResponseEntity<Void> createJob(@RequestBody JobInfo job){
        service.addJob(job);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<JobInfo> getAllJobs(){
        return service.getAllJobs();
    }
}
