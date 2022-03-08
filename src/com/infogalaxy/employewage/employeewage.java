package com.infogalaxy.employewage;

import java.util.Random;

public class employeewage {
    public static void main(String[] args) {
        //Displaying Welcome to Employee Wage Computation
        System.out.println("welcome to Employee Wage calculation problem ");
        //UC-2 calculate daily Wage
        final int WAGE_PER_HR = 20;
        final int FULL_TIME_HR = 8;
        final int PART_TIME_HR = 4;
        int total_wage = 0;
        Random random = new Random();
        //UC-3-checking Employee Absent Or Present
        int emptype = random.nextInt()%2;
        // UC- 1 Check Employee is Absent Ro Present
        int empAtenddence = random.nextInt()%2;
        System.out.println(empAtenddence);
        if(empAtenddence == 0){
            System.out.println("Employee is Absent");
        }else{
            System.out.println("Employee is present");
            System.out.println(emptype);
            if(emptype == 0){
                System.out.println("Part Time Employee");
                total_wage =WAGE_PER_HR * PART_TIME_HR;
            }else {
                System.out.println("Full Time Employee");
                total_wage =WAGE_PER_HR * FULL_TIME_HR;
            }
        }
        System.out.println("Employee  Wage="+total_wage);
    }
}
