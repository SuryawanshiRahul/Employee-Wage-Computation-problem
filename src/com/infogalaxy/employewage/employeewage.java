package com.infogalaxy.employewage;

import java.util.Random;

public class employeewage {
    public static void main(String[] args) {
        //Displaying Welcome to Employee Wage Computation
        System.out.println("welcome to Employee Wage calculation problem ");
        //UC-2 calculate daily Wage
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR =8;
        int total_wage = 0;
        Random random = new Random();
        // Uc- 1 Check Employee is Absent Ro Present
        int empAtenddence = random.nextInt()%2;
        System.out.println(empAtenddence);
        if(empAtenddence == 0){
            System.out.println("Employee is Absent");
            total_wage = 0;
        }else{
            System.out.println("Employee is present");
            total_wage =WAGE_PER_HR * FULL_DAY_HR;
        }
        System.out.println("Employee A Full Day Wage="+total_wage);
    }
}
