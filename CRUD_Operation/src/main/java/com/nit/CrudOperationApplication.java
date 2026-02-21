package com.nit;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.ControllerService;
import com.nit.model.EMP;

@SpringBootApplication
public class CrudOperationApplication {

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext run = SpringApplication.run(CrudOperationApplication.class, args);
		
		ControllerService bean = run.getBean(ControllerService.class);
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Insert enter 1");
			System.out.println("display enter 2");
			System.out.println("delete enter 3");
			System.out.println("Udate enter 4");
			System.out.println("exit enter 5");
			int n=sc.nextInt();
			
		
			
		
		
		switch(n)
		{
		case 1:{
			
			System.out.print("Enter ID: "); 
			long idIn = sc.nextLong();
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Dept: ");
            int dept = sc.nextInt();
            System.out.print("Enter Salary: "); 
            double salIn = sc.nextDouble();
            
            EMP newEmp = new EMP(idIn, name, dept, salIn);
            bean.insertController(newEmp);
            break;
		}
		
		
		case 2: bean.udateEmpl();
		
		break;
		case 3:{
			System.out.println("Enter the id");
			int d=sc.nextInt();
			bean.deleteEmp(d);
		break;
		}
		
		case 4:
		{
			System.out.println("Enter the id");
			long id=sc.nextLong();
			System.out.println("Enter the salary");
			double sal=sc.nextDouble();
			
			bean.updateController(id,sal);
			break;

		}
		
		case 5: return;
		}
		
		}
		
	}

}
