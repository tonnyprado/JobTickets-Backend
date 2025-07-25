package org.example.Services;

import org.example.Constructor.JobInfoConstructor;

import java.util.Scanner;

public class creatingTicket {

    public creatingTicket(JobTicketService service){
        //JobTicketService service = new JobTicketService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many job ticket you want to create? ");
        int response1 = scanner.nextInt();
        response1 = response1 - 1;
        scanner.nextLine();

        for(int i = 0; i <= response1; i++){
            System.out.println("JOB No: " + (i+1));

            System.out.print("Position: ");
            String jobName = scanner.nextLine();

            System.out.print("Company: ");
            String companyName = scanner.nextLine();

            System.out.print("Job Description: ");
            String jobDescription = scanner.nextLine();

            System.out.print("Start Date: ");
            String startDate = scanner.nextLine();

            System.out.print("Recruiter name: ");
            String recruiterName = scanner.nextLine();

            System.out.print("Email Recruiter: ");
            String emailRecruiter = scanner.nextLine();

            JobInfoConstructor jobApplication = new JobInfoConstructor(jobName, companyName, jobDescription, startDate, recruiterName, emailRecruiter);
            service.addJob(jobApplication);
        }
        System.out.println("\n Registered job tickets: ");
        service.listJobs();


    }
}
