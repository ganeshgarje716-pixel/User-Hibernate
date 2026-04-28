package com.Main;

import java.util.List;
import java.util.Scanner;

import com.Cntroller.UserController;
import com.Exception.IdIsNotExistingException;
import com.Exception.UserNotFoundException;
import com.entity.User;

public class UserMain {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  
		
		
		UserController controller=new UserController();
		
		
		
		while (true) {
			
			
			System.out.println("1.Insert User");
			System.out.println("2.Get User By Id");
			System.out.println("3.Get All User");
			System.out.println("4.Update User By Id");
			System.out.println("5.Delete User By Id");
			System.out.println("6.Exit");
			
			System.out.println("Enter Your Choise = ");
			int no=sc.nextInt();
			
			
			
			if (no == 1) {
				
				System.out.println("Enter Id = ");
				int id=sc.nextInt();
				
				System.out.println("Enter Name = ");
				String username=sc.next();
				
				System.out.println("Enter Password =");
				String password=sc.next();
				
				System.out.println("Enter Email =");
				String email=sc.next();
				
				System.out.println("Enter Gender =");
				String gender=sc.next();
				
				System.out.println("Enter DOB =");
				String dob=sc.next();
				
				System.out.println("Enter Mobile No =");
				float mobileNo=sc.nextFloat();
				
				System.out.println("Enter Address =");
				String address=sc.next();
				
				System.out.println("Enter Age =");
				int age=sc.nextInt();
				
				
				try {
					
					System.out.println( controller.save(new User(id, username, password, email, gender, dob, mobileNo, address, age)));
				} 
				catch (Exception e) {
					
					e.printStackTrace();
				}
				
			break;	
			}
			
			
			
			else if (no ==2) {
				
				
				System.out.println("Enter Id = ");
				int id=sc.nextInt();
				
				try {
					
					System.out.println(controller.get(id));
				} 
				catch (UserNotFoundException e) {
					
					System.out.println(e.getMessage());
				}
				
					
			break;	
			}
			
			
			
			else if (no == 3) {
				
				
				List<User> users = controller.getAll();
				
				for (User user : users) {
					
					System.out.println(user);
					
				}
				
			break;	
			}
			
			
			
			else if (no == 4) {
				
				
				System.out.println("Enter Id = ");
				int id=sc.nextInt();
				
				System.out.println("Enter Name = ");
				String username=sc.next();
				
				System.out.println("Enter Password =");
				String password=sc.next();
				
				System.out.println("Enter Email =");
				String email=sc.next();
				
				System.out.println("Enter Gender =");
				String gender=sc.next();
				
				System.out.println("Enter DOB =");
				String dob=sc.next();
				
				System.out.println("Enter Mobile No =");
				float mobileNo=sc.nextFloat();
				
				System.out.println("Enter Address =");
				String address=sc.next();
				
				System.out.println("Enter Age =");
				int age=sc.nextInt();
				
				
				try {
					
					System.out.println(controller.update(new User(id, username, password, email, gender, dob, mobileNo, address, age)));
				} 
				catch (Exception e) {
					
					System.out.println(e.getMessage());
				}
				
			break;	
			}
			
			
			
			else if (no == 5) {
				
				

				System.out.println("Enter Id = ");
				int id=sc.nextInt();
				
				try {
					
					System.out.println(controller.delete(id));
				} 
				catch (Exception e) {
					
					e.printStackTrace();
					
				}
				
			break;	
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
