package adapter;

import abstracts.CustomerCheckService;
import entities.Customer;
import mernis.CHCKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        CHCKPSPublicSoap client = new CHCKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstName().toUpperCase(),
                customer.getLastName().toLowerCase(),customer.getDateOfBirth().getYear());
    }
}
