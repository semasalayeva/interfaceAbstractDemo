import abstracts.BaseCustomerManager;
import adapter.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        try {
            baseCustomerManager.save(new Customer(1,"Sema",
                    "Salayeva", LocalDate.of(1995, Month.MARCH,18),"1234565564"));
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
