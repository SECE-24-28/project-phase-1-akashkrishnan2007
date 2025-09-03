import java.util.*;
import java.io.*;  

public class HotelBooking {
    public static void main(String[] args) throws IOException {   
        Scanner sc = new Scanner(System.in);

        System.out.println("Hotel Booking System ");
        System.out.println("1. Add New Customer");
        System.out.println("2. Show All Customers");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            System.out.print("Enter Room Type (Single/Double/Deluxe): ");
            String roomType = sc.nextLine();

            System.out.print("Enter Days of Stay: ");
            int days = sc.nextInt();

            
            Customer customer = new Customer(name, phone, roomType, days);

            System.out.println("\n===== Customer Details =====");
            customer.displayCustomer();

           
            FileWriter fw = new FileWriter("customers.txt", true); 
            fw.write(customer.getCustomerDetails() + "\n");
            fw.close();
            System.out.println("\n Details saved in customers.txt");
        } 
        else if (choice == 2) {
            System.out.println("\n All Customers");
            
            FileReader fr = new FileReader("customers.txt");  
            BufferedReader br = new BufferedReader(fr);        

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } 
        else {
            System.out.println(" Invalid choice.");
        }

        sc.close();
    }
}
