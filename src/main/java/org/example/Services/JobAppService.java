package org.example.Services;

import java.util.Scanner;

public class JobAppService {
    private Scanner scanner;

    public JobAppService(Scanner scanner){
        this.scanner = scanner;
    }

    public void menu(){
        JobTicketService service = new JobTicketService();

        boolean turnSwitch = true;
        while(turnSwitch){
            System.out.println("Menú: \n"
                    +"1) Show Status \n"
                    +"2) Enter Job Name/Number \n"
                    +"3) Add new Job ticket\n"
                    +"4) Exit");
            int option = 0;
            try{
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a number: ");
                scanner.nextLine();
                continue;
            }

            switch (option){
                case 1:
                    System.out.println("1) Show Status from jobs");
                    continue; //Show Status class call
                case 2:
                    System.out.println("2) Enter Job name/number: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    //creatingTicket.creatingTicket(service);
                    service.getJobById(id);
                    continue; //add function of menu so it get back to the menu or function of status
                case 3:
                    System.out.println("3) Add new Job ticket");
                    new creatingTicket(service);
                    continue;
                case 4:
                    System.out.println("4) Exit");
                    turnSwitch = false;
            }
        }

    }

}
