package com.infogalaxy.employewage;

import java.util.Random;

public class Employeewage {
    int total_working_hr = 0;
    int total_working_day = 0;
    int total_wage = 0;
    //UC-7- Use Class Method & Class Variables
    void calculation() {
        //Displaying Welcome to Employee Wage Computation
        System.out.println("welcome to Employee Wage calculation problem ");
        //UC-2 calculate daily Wage
        Random random = new Random();
        //UC-5- 20 Working Day in A Moth
        //UC-6- Adding 100 Working HRS
        while (total_working_hr <= Constants.TOTAL_WORKING_HR && total_working_day < Constants.WORKING_DAYS) {
            total_working_day++;
            System.out.println("day" + total_working_day);
            //UC-3-checking Employee Absent Or Present
            int emptype = random.nextInt() % 2;
            // UC- 1 Check Employee is Absent Ro Present
            int empAtenddence = random.nextInt() % 2;
            if (empAtenddence == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is present");
                //UC-4-Change Code if else To switch case for clarity
                switch (emptype) {
                    case Constants.IS_PRAT_TIME:
                        System.out.println("Part Time Employee");
                        total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.PART_TIME_HR);
                        total_working_hr = total_working_hr + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Full Time Employee");
                        total_wage = total_wage + (Constants.WAGE_PER_HR * Constants.FULL_TIME_HR);
                        total_working_hr = total_working_hr + Constants.FULL_TIME_HR;
                        break;
                }
            }
        }
    }
    void displyawage() {
            System.out.println("Employee  Wage=" + total_wage);
            System.out.println("Total working HRS=" + total_working_hr);
        }
    public static void main(String[] args) {
            Employeewage sc =new Employeewage();
            sc.calculation();
            sc.displyawage();
        }
    }

