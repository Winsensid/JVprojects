package emailApp;

import java.security.PrivateKey;
import java.util.Scanner;

public class Email {

     String FirstName;
     String LastName;
     String Course;
     String Password;
     String Email;
     int DefaulPasswordLength = 10;
     int EmailCapacity = 200;
     String AlternateEmail;
     String SchoolSuffix = "izaan.com";

    //Constructor to receive First and Last name.
    public Email (String FirstName, String LastName){
        FirstName = FirstName;
        LastName = LastName;
        System.out.println("Student name is " + FirstName + " " + LastName);

    //Call method for course + return the course name
        Course = setCourse();
        System.out.println("Course is " + Course);


    //call method to generate random password
    Password = RandomPassword(DefaulPasswordLength);
        System.out.println("your password is:  " + Password);

        //Combine element to generate email
        Email = FirstName.toLowerCase() + LastName.toLowerCase() + "@" + Course.toLowerCase().replace(" ","") +"."+ SchoolSuffix;

        System.out.println("Email is: " + Email);
    }


    //Ask for course
        private String setCourse() {
            System.out.println("Course code\n1 Devops Engineering\n2 QA Automation\n3 Data Science\n4 AWS Solution Architect\n Enter Course Code ");
            Scanner in = new Scanner(System.in);
            int CourseCode = in.nextInt();
            if (CourseCode == 1) {return "Devops Engineering";}
            else if (CourseCode == 2){ return "QA Automation";}
            else if (CourseCode == 3){return "Data Science";}
            else if (CourseCode == 4){return " AWS Solution  Architect";}
            else {return " ";}


    }

    //Generate Random Password
    private String RandomPassword (int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&()";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            //generate random numbers/ in this case, we need to cast it as INT
            int Rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(Rand);

        }
        return new String(password);




        //Set Mailbox Capacity
       // public void setMailBoxCapacity(int capacity){
          //  EmailCapacity= capacity;

        //}

        //Set Alternate Email

        //Change Password
    }

}

