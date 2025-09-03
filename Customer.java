
class Customer {
    
    private String name;   
    private String phone; 
    String roomType;
    int days;

    
    Customer(String name, String phone, String roomType, int days) {
        this.name = name;
        this.phone = phone;
        this.roomType = roomType;
        this.days = days;
    }


    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    
    public void setPhone(String phone) {
        this.phone = phone;
    }


    void displayCustomer() {
        System.out.println("Customer Name : " + name);
        System.out.println("Phone Number  : " + phone);
        System.out.println("Room Type     : " + roomType);
        System.out.println("Days of Stay  : " + days);
    }

    
    String getCustomerDetails() {
        return "Customer Name : " + name + "\n" +
               "Phone Number  : " + phone + "\n" +
               "Room Type     : " + roomType + "\n" +
               "Days of Stay  : " + days + "\n" ;
    }
}
