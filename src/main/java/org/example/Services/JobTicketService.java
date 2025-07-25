package org.example.Services;

import org.example.Controller.JobInfoConstructor;
import org.example.Repository.JobTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class JobTicketService {
    @Autowired
    private JobTicketRepository repo;

    //private Map<Integer, JobInfoConstructor> jobTicket;
    private int counter = 1;

    /*public JobTicketService(){
        this.jobTicket = new HashMap<>();
    }*/

    public void addJob(JobInfoConstructor job){
        //jobTicket.put(counter++, job);
        repo.save(job);
    }

    public void listJobs(){
        /*for(Map.Entry<Integer, JobInfoConstructor> entry : jobTicket.entrySet()){
            System.out.println("No. " + entry.getKey() + ": " + entry.getValue());
        }*/
        List<JobInfoConstructor> jobs = repo.findAll();
        for(int i = 0; i < jobs.size(); i++){
            System.out.println("No. " + (i + 1) + ": " + jobs.get(i));
        }
    }

    public JobInfoConstructor getJobById(Long id){
        //return jobTicket.get(id);
        return repo.findById(id).orElse(null);
    }

    public List<JobInfoConstructor> getAllJobs(){
        return repo.findAll();
    }
}
