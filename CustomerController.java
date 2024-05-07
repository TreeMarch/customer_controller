package aptech.controller;


import java.util.ArrayList;
import java.util.Scanner;

// Làm nhiệm vụ điều hướng khách hàng
// Nhập và hiển thị thông tin
public class CustomerController {

//    1. cho phép lưu trữ -  do không trả về kiểu gì liệu nên sẽ dùng void

        ArrayList<Customer> customers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

    public void create(){
        // Để lưu thông tin khách hàng
        System.out.println("Vui lòng nhập thông tin của bạn: ");
        System.out.println("===================================");
        System.out.println("id:");
        long id =  sc.nextLong();
        sc.nextLine();
        System.out.println("First Name:");
        String firstName =  sc.nextLine();
        System.out.println("Last Name:");
        String lastName =  sc.nextLine();
        System.out.println("Address:");
        String address =  sc.nextLine();
        System.out.println("email");
        String email =  sc.nextLine();
        System.out.println("phone:");
        String phone =  sc.nextLine();
        sc.nextLine();



        System.out.println("===============================");
        // Tạo một đối tượng có thông tin nhập vào
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setAddress(address);
        customer.setEmail(email);
        customer.setPhone(phone);

        // Đưa customer vào list
        customers.add(customer);

    }

//    2. cho phép xóa
    public void delete(ArrayList<Customer> listOfCustomers,long idCanXoa){
        //duyet qua danh khach hang
        for (int i = 0; i < listOfCustomers.size(); i++) {
            if(listOfCustomers.get(i).getId() == idCanXoa){
                // Neu trung tu khop thi se xoa khach hang ra khoi danh sach va ket thuc ham
                listOfCustomers.remove(i);
                System.out.println("Delete successful got id : " + idCanXoa);
                return;
            }else {
                System.out.println("Not found customer");
            }
        }
    }



//    3. cho phép hiển thị
    public void showInforCustomer(){
        System.out.println("Thông tin của khách hàng:");
        System.out.println("==================================");
        for(int i = 0; i < customers.size(); i++){
            Customer c = customers.get(i);
            System.out.printf(" %d \n %s \n %s \n %s \n %s \n %s \n",c.getId(),c.getFirstName(),c.getLastName(),c.getAddress(),c.getEmail(),c.getPhone());

            System.out.println("Enter to go on");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        }
    }

//    4. cho phép thay đổi
public void updateCustomer(){

    System.out.println("Update Customer Information : ");
    System.out.println("------------------------------");
    for(Customer customer : customers){
        if(customer.getId() == customers.get(customers.size()-1).getId()){
            System.out.println("Update Customer ID : " + customer.getId());
            customer.setId(customer.getId());
            System.out.println("Update First Name: " + customer.getFirstName());
            customer.setFirstName(sc.nextLine());
            System.out.println("Update Last Name: " + customer.getLastName());
            customer.setLastName(sc.nextLine());
            System.out.println("Update Email: " + customer.getEmail());
            customer.setEmail(sc.nextLine());
            System.out.println("Update Phone: " + customer.getPhone());
            customer.setPhone(sc.nextLine());

            System.out.println("Update Successful ");
            System.out.println("======================================= ");


        }
    }
}
}
