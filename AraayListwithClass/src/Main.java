import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers=new ArrayList<>();
        Customer abdullah= new Customer(1,"abdullah","ayhan");
        customers.add(abdullah);
        customers.add(new Customer(2,"Mert","AYHAN"));
        customers.add(new Customer(3,"Elif","AYHAN"));
        customers.remove(abdullah);
        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
