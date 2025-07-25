package org.example.Constructor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JobInfoConstructor {
    String jobName;
    String companyName;
    String jobDescription;
    String startDate;
    String recruiterName;
    String emailRecruiter;
    public JobInfoConstructor(String jobName, String companyName, String jobDescription, String startDate, String recruiterName, String emailRecruiter){
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
