package org.example.Services;

import org.example.Model.JobInfo;
import org.example.Repository.JobTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTicketService {
    @Autowired
    private JobTicketRepository repo;

    //private Map<Integer, JobInfo> jobTicket;
    private int counter = 1;

    /*public JobTicketService(){
        this.jobTicket = new HashMap<>();
    }*/

    public void addJob(JobInfo job){
        //jobTicket.put(counter++, job);
        repo.save(job);
    }

    public void listJobs(){
        /*for(Map.Entry<Integer, JobInfo> entry : jobTicket.entrySet()){
            System.out.println("No. " + entry.getKey() + ": " + entry.getValue());
        }*/
        List<JobInfo> jobs = repo.findAll();
        for(int i = 0; i < jobs.size(); i++){
            System.out.println("No. " + (i + 1) + ": " + jobs.get(i));
        }
    }

    public JobInfo getJobById(Long id){
        //return jobTicket.get(id);
        return repo.findById(id).orElse(null);
    }

    public List<JobInfo> getAllJobs(){
        return repo.findAll();
    }
}
