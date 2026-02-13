package com.nit;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.ControllerEmployee;
import com.nit.model.Employee;

@SpringBootApplication
public class SpringBootProject01LayeredAppApplication {

    public static void main(String[] args) {
    	
        // 1. Initialize Spring Context
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootProject01LayeredAppApplication.class, args);
        ControllerEmployee controller1 = ctx.getBean("econtroller", ControllerEmployee.class);

        // 2. Open ONE Scanner for the entire execution
        Scanner sc = new Scanner(System.in);

        try {
            // --- Part 1: Fetching Employees ---
            System.out.println("Enter the Desg1:");
            String d1 = sc.nextLine();
            System.out.println("Enter the Desg2:");
            String d2 = sc.nextLine();
            System.out.println("Enter the Desg3:");
            String d3 = sc.nextLine();

            List<Employee> list = controller1.showAllEmployeeByDesgs(d1, d2, d3);
            list.forEach(System.out::println);

            System.out.println("------------------------------------");

            //  Part 2: Registering a New Employee 
            Employee emp1 = new Employee();

            System.out.println("Enter Name: ");
            String name = sc.nextLine().toUpperCase();
            
            System.out.println("Enter Job/Desg: ");
            String job = sc.nextLine().toUpperCase();

            System.out.println("Enter Salary: ");
            double salary = sc.nextDouble();

            System.out.println("Enter Dept No: ");
            int deptno = sc.nextInt();

            // Set collected values to the object
            emp1.setEname(name);
            emp1.setJob(job);
            emp1.setSalary(salary);
            emp1.setDetpno(deptno);

            // Process the employee
            String resultmsg = controller1.processEmployee(emp1);
            System.out.println("Result: " + resultmsg);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            sc.close();
            ctx.close();
        }
    }
}