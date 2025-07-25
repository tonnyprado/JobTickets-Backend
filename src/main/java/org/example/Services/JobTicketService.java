package org.example.Services;

import org.example.Constructor.JobInfoConstructor;

import java.util.HashMap;
import java.util.Map;

//Menu to add job ticket
public class JobTicketService {
    private Map<Integer, JobInfoConstructor> jobTicket;
    private int counter = 1;

    public JobTicketService(){
        this.jobTicket = new HashMap<>();
    }

    public void addJob(JobInfoConstructor job){
        jobTicket.put(counter++, job);
    }

    public void listJobs(){
        for(Map.Entry<Integer, JobInfoConstructor> entry : jobTicket.entrySet()){
            System.out.println("No. " + entry.getKey() + ": " + entry.getValue());
        }
    }

    public JobInfoConstructor getJobById(int id){
        return jobTicket.get(id);
    }
}
