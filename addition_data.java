package com.project;
public class addition_data extends Scan {

	public static void option() {
      
		System.out.println("1.for sinup   2.login");
		
		
			
			int op=sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("welcome to sinup page");
			
			user_detais.userDetails();
			System.out.println("suceesfully registered");
		
			User_signin.sigin();
			
			
			break;
		case 2:
		
			User_signin in=new User_signin();
			in.sigin();
			break;
		default:
			System.out.println("select valid option i.e 1  or 2");
			option();
		    	break;
		 }
	}
}
		

