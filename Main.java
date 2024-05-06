package aptech.controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tao đối tượng cụ thể của lớp CustomerController
//        CustomerController customerController = new CustomerController();
        // gọi phương thức cần thiết
//        customerController.create();
//        customerController.showInforCustomer();
        createMenu();
    }

    private static void createMenu() {

            Scanner sc = new Scanner(System.in);
            CustomerController c = new CustomerController();

           while (true) {

               System.out.println("Welcome to the Customer Controller");
               System.out.println("===================================");
               System.out.println("1. Create Customer");
               System.out.println("2. Show Customer");
               System.out.println("3. Update Customer");
               System.out.println("4. Delete Customer");
               System.out.println("5. EXIT");
               System.out.println("===================================");
               System.out.println("Please enter your choices!!!");
               int choice = sc.nextInt();

               switch (choice) {
                   case 1:
                       c.create();
                       break;
                   case 2:
                       c.showInforCustomer();
                       break;
                   case 3:
                       System.out.println("Develop Processing");
                       break;
                   case 4:
                       System.out.println("Develop Processing");
                       break;
                   case 5:
                       System.out.println("Bye Bye See you soon!");
                       break;
                   default:
                       System.out.println("Invalid choice");
                       break;
               }
                if(choice == 5){
                    // Ket thuc chuong trinh
                    break;
                }
           }





        }



    }

