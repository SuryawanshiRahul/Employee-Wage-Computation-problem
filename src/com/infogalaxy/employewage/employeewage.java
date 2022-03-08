package com.infogalaxy.employewage;

import java.util.Random;

public class employeewage {
    public static void main(String[] args) {
        //Displaying Welcome to Employee Wage Computation
        System.out.println("welcome to Employee Wage calculation problem ");
        Random random = new Random();
        // Uc- 1 Check Employee is Absent Ro Present
        int empAtenddence = random.nextInt()%2;
        System.out.println(empAtenddence);
        if(empAtenddence == 0){
            System.out.println("Employee is Absent");
        }else{
            System.out.println("Employee is present");
        }

    }
}
