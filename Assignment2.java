/*
Design and develop inheritance for a given case study, identify objects and relationships and
implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address,
Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project
Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the
inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff
club fund. Generate pay slips for the employees with their gross and net salary.
*/

import java.util.Scanner;

class Employee<e> {
    int emp_id;
    double da, hra, pf, club_fund, gross, net;
    String em_mob, emp_name, emp_mail, emp_type, emp_address;

    Employee(){
        emp_id = 0;
        emp_name = "Unknown";
        emp_address = " ";
        emp_mail = " unknown@gmail.com";
    }

    int checkEmpId(Employee e[], int j){
        int id;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter id: ");
            id = sc.nextInt();
            for(int i = 0; i<j; i++){
                if(e[i].emp_id == id){
                    System.out.println("Same id is not allowed");
                }
                if (i == j){
                    break;
                }
            }
            return id;
        }
    }

    String checkMob(){
        String mno;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the mobile number");
            mno = sc.nextLine();
            if(mno.length() != 10){
                System.out.println("Mobile number should be 10 Digits");
            }else{
                break;
            }

        }
        return mno;
    }

    void getData(Employee e1[], int j){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
        emp_id = sc.nextInt();
        System.out.println("Enter Name of the Employee : ");
        sc.nextLine();
        emp_name = sc.nextLine();
        System.out.println("Enter Address ");
        emp_address = sc.nextLine();
        System.out.println("Enter Mail ");
        emp_mail = sc.nextLine();
    }

    void calSalary(double basicPay){
        da = basicPay * 0.97;
        hra = basicPay * 0.1;
        pf = basicPay * 0.12;
        club_fund = basicPay * 0.001;

        gross = da + hra + basicPay;
        net = gross - pf - club_fund;
    }

    void displayEmployeeDetails(String type){
        System.out.println("Id : "+ emp_id);
        System.out.println("Name : "+ emp_name);
        System.out.println("Mobile Number : "+ em_mob);
        System.out.println("Email Id : "+ emp_mail);
        System.out.println("Adress : "+ emp_address);
        System.out.println("Employee type : "+ type);
    }

    void displaySalary(){
        System.out.println("DA of the emplyee is : " + da);
        System.out.println("HRA of the emplyee is : " + hra);
        System.out.println("PF of the emplyee is : " + pf);
        System.out.println("Club Fund of the employee is : " + club_fund);
        System.out.println("Total Gross Salary of the emplyee is : "+ gross);
        System.out.println("Total Net Salary of the emplyee is : "+ net);
    }
}

class Programmer  extends Employee{
    void bp_pgm(Employee a){
        double basic_pay;
        System.out.println("Enter the basic pay of Programmer");
        Scanner sc = new Scanner(System.in);
        basic_pay = sc.nextDouble();
        a.calSalary(basic_pay);
        emp_type = "PROGRAMMER";
        a.displayEmployeeDetails(emp_type);
        a.displaySalary();
    }
}

class Team_Lead  extends Employee{
    void bp_teamLead(Employee a){
        double basic_pay;
        System.out.println("Enter the basic pay of Team Lead");
        Scanner sc = new Scanner(System.in);
        basic_pay = sc.nextDouble();
        a.calSalary(basic_pay);
        emp_type = "Team_Lead";
        a.displayEmployeeDetails(emp_type);
        a.displaySalary();
    }
}

class Assistant_Project_Manager  extends Employee{
    void bpAsstProjMan(Employee a){
        double basic_pay;
        System.out.println("Enter the basic pay of Assistant Project Manager ");
        Scanner sc = new Scanner(System.in);
        basic_pay = sc.nextDouble();
        a.calSalary(basic_pay);
        emp_type = "Assistant_Project_Manager";
        a.displayEmployeeDetails(emp_type);
        a.displaySalary();
    }
}

class Project_Manager  extends Employee{
    void bpProjMan(Employee a){
        double basic_pay;
        System.out.println("Enter the basic pay of Project Manager ");
        Scanner sc = new Scanner(System.in);
        basic_pay = sc.nextDouble();
        a.calSalary(basic_pay);
        emp_type = "Project_Manager";
        a.displayEmployeeDetails(emp_type);
        a.displaySalary();
    }
}


public class salary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();

        Employee e1[] = new Employee[n];

        for(int i = 0; i<n; i++){
            System.out.println("Enter Employee Details of Employee "+ (i+1)+ " : ");
            e1[i] = new Employee();
            e1[i].getData(e1, i);
            int flag = 0;
            int ch = 0;
            while(flag == 0){
                System.out.println("Choose the type of Employee : ");
                System.out.println("1. Programmer");
                System.out.println("2. Team Lead");
                System.out.println("3. Assistant Project Manager");
                System.out.println("4. Project Manager");
                ch = sc.nextInt();
                switch(ch){
                    case 1:
                        Programmer p = new Programmer();
                        p.emp_type = "Programmer";
                        p.bp_pgm(e1[i]);
                        flag = 1;
                        break;

                    case 2:
                        Team_Lead t = new Team_Lead();
                        t.bp_teamLead(e1[i]);
                        flag = 1;
                        break;

                    case 3:
                        Assistant_Project_Manager apm = new Assistant_Project_Manager();
                        apm.bpAsstProjMan(e1[i]);
                        flag = 1;
                        break;

                    case 4:
                        Project_Manager pm = new Project_Manager();
                        pm.bpProjMan(e1[i]);
                        flag = 1;
                        break;
                }
            }
        }
    }
}
