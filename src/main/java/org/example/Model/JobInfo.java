package org.example.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class JobInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String jobName;
    String companyName;
    String jobDescription;
    String startDate;
    String recruiterName;
    String emailRecruiter;

    public JobInfo() {
    }

    public JobInfo(String jobName, String companyName, String jobDescription, String startDate, String recruiterName, String emailRecruiter){
        this.jobName = jobName;
        this.companyName = companyName;
        this.jobDescription = jobDescription;
        this.emailRecruiter = emailRecruiter;
        this.startDate = startDate;
        this.recruiterName = recruiterName;
    }
    //maybe podemos agregar status aqui para que conecte con esa clase maybe se puede guardar la llamada

    @Override
    public String toString(){ return jobName + companyName + startDate + jobDescription + recruiterName + emailRecruiter;}
}
