package aptech.controller;


    //lưu trữ thông tin của khách hàng
    //phương thức liên quan đến hành vi khách hàng
public class Customer {
    private long id ;
    private String address;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;


    //nếu không có yêu cầu gì đặc biệt thì không nhất thiết phải có Constructor
    //ngược lại sẽ cần và cho tham số truyền vào
    public Customer(long id, String address, String firstName, String lastName, String email, String phone) {
        this.id = id;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
