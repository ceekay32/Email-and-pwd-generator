package emailapp;

import java.util.*;

public class Email {
	 
//	private  String  lastName;
//	private  String  department;
	String firstName;
	String lastName;
	int department;
	private  String  altMail;
	int mailboxcapacity;
	Scanner sc=new Scanner(System.in);
	
	
	
	// first and last name
	public void Names(){
		
		
		System.out.println("Enter first name\n");
		 firstName = sc.nextLine();
		
		System.out.println("\nEnter last name\n");
		 lastName = sc.nextLine();
		System.out.println(firstName +" "+ lastName);
	}
//ask for department
	public void Department() {
		System.out.println("Enter choice for department 1. Sales 2. Development 3.Accounting 0.Skip");
		 department=sc.nextInt();
		 
		if(department==1)
		{
			System.out.println("sales");
			}
		else if(department==2) {
			System.out.println("dev");
			}
		else if(department==3) {
			System.out.println("acc");
		}
		else {
			System.out.println("");
		}
	}
		
		
	//generate random password
	public void Password() {
		int length=8;
		 String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 1; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	        
	      }
	      System.out.println("your password is "+ password);
	      String email= firstName.toLowerCase() + lastName.toLowerCase() + "@"+department + ".ck.com";
	    		  System.out.println(email);
	}
//	
	// set the mailbox capacity
	//ask for email 
	//change the password

}


