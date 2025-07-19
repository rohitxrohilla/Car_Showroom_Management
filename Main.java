package carmanagement;

import java.util.Scanner;

interface Utility{
    void get_Details();
    void set_Details();
}

class Showroom implements Utility{
    String showroom_name;
    String showroom_address;
    String manager_name;
    int total_employees;
    int total_cars=0;

    @Override
    public void get_Details(){
        System.out.println("Showroom Name : " + showroom_name);
        System.out.println("Showroom Address : " + showroom_address);
        System.out.println("Manager Name : " + manager_name);
        System.out.println("Total number of employees : " + total_employees);
        System.out.println("Total number of cars : " + total_cars);
    }
    @Override
    public void set_Details(){
        Scanner input = new Scanner(System.in);
        System.out.println("================= ENTER SHOWROOM DETAILS ===============");
        System.out.println();
        System.out.print("Showroom Name : ");
        showroom_name = input.nextLine();
        System.out.print("Showroom Address : ");
        showroom_address = input.nextLine();
        System.out.print("Manager Name : ");
        manager_name = input.nextLine();
        System.out.print("Total number of employees : ");
        total_employees = input.nextInt();
        System.out.print("Total number of cars : ");
        total_cars = input.nextInt();
    }
}

class Employees extends Showroom implements Utility{
    String employee_name;
    String employee_id;
    int employee_age;
    String employee_dept;

    @Override
    public void get_Details(){
        System.out.println("Employee id : " + employee_id);
        System.out.println("Employee name : " + employee_name);
        System.out.println("Employee age : " + employee_age);
        System.out.println("Employee department : " + employee_dept);
        System.out.println("Showroom Name : " + showroom_name);
    }
    @Override
    public void set_Details(){
        Scanner input = new Scanner(System.in);
        System.out.println("================= ENTER EMPLOYEE DETAILS ===============");
        System.out.println();
        System.out.print("Employee Name : ");
        employee_name = input.nextLine();
        System.out.print("Employee Id : ");
        employee_id = input.nextLine();
        System.out.print("Employee Age : ");
        employee_age = input.nextInt();
        System.out.print("Employee Department : ");
        employee_dept = input.nextLine();
        System.out.print("Showroom Name : ");
        showroom_name = input.nextLine();
    }
}

class Car extends Showroom implements Utility{
    String car_name;
    String car_color;
    String fuel_type;
    int car_price;
    String car_type;

    @Override
    public void get_Details(){
        System.out.println("Name : "+ car_name);
        System.out.println("Color : "+car_color);
        System.out.println("Fuel : "+fuel_type);
        System.out.println("Price : "+car_price);
        System.out.println("Type : "+car_type);
    }

    @Override
    public void set_Details(){
        Scanner input = new Scanner(System.in);
        System.out.println("================= ENTER CAR DETAILS ===============");
        System.out.println();
        System.out.print("Name : ");
        car_name = input.nextLine();
        System.out.print("Color : ");
        car_color = input.nextLine();
        System.out.print("Fuel : ");
        fuel_type = input.nextLine();
        System.out.print("Price : ");
        car_price = input.nextInt();
        System.out.print("Type : ");
        car_type = input.nextLine();
        total_cars++;
    }
}




public class Main {

    static void Menu(){
        System.out.println();
        System.out.println("========== WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM ==========");
        System.out.println();
        System.out.println("=====**** ENTER YOUR CHOICE *****=====");
        System.out.println();
        System.out.println(" 1] ADD SHOWROOM \t\t\t 2] ADD EMPLOYEES \t\t\t 3] ADD CAR");
        System.out.println();
        System.out.println(" 4] GET SHOWROOMS \t\t\t 5] GET EMPLOYEES \t\t\t 6] GET CARS");
        System.out.println();
        System.out.println("========== ENTER 0 TO EXIT ==========");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Showroom[] showroom = new Showroom[5];
        Employees[] employees = new Employees[5];
        Car[] car = new Car[5];

        int showroom_counter = 0;
        int employees_counter = 0;
        int car_counter = 0;
        int choice = 100;

        while(choice!=0){
            Menu();
            choice = input.nextInt();

            while(choice!=9 && choice!=0){
                switch(choice){
                    case 1:
                      showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_Details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println(" 1] ADD NEW SHOWROOM");
                        System.out.println(" 9] GO BACK TO MAIN MENU");
                        choice = input.nextInt();
                        break;

                    case 2:
                        employees[employees_counter]=new Employees();
                        employees[employees_counter].set_Details();
                        employees_counter++;
                        System.out.println();
                        System.out.println(" 2] ADD NEW EMPLOYEE");
                        System.out.println(" 9] GO BACK TO MAIN MENU");
                        choice = input.nextInt();
                        break;

                    case 3:
                        car[car_counter] = new Car();
                        car[car_counter].set_Details();
                        car_counter++;
                        System.out.println();
                        System.out.println(" 3] ADD NEW CAR");
                        System.out.println(" 9] GO BACK TO MAIN MENU");
                        choice = input.nextInt();
                        break;

                    case 4:
                        for (int i=0;i<showroom_counter;i++){
                            showroom[i].get_Details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println(" 9] GO BACK TO MAIN MENU");
                        System.out.println(" 0] TO EXIT");
                        choice = input.nextInt();
                        break;

                    case 5:
                        for (int i=0;i<employees_counter;i++){
                            employees[i].get_Details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println(" 9] GO BACK TO MAIN MENU");
                        System.out.println(" 0] TO EXIT");
                        choice = input.nextInt();
                        break;

                    case 6:
                        for (int i=0;i<car_counter;i++){
                            car[i].get_Details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println(" 9] GO BACK TO MAIN MENU");
                        System.out.println(" 0] TO EXIT");
                        choice = input.nextInt();
                        break;

                    default:
                        System.out.println("Invalid Choice Number");

                }
            }
        }
    }
}
