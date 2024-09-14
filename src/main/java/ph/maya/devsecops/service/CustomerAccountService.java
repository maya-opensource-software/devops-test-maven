package ph.maya.devsecops.service;

import org.springframework.stereotype.Service;
import ph.maya.devsecops.dto.AccountInfo;
import ph.maya.devsecops.dto.CustomerAccount;
import ph.maya.devsecops.dto.CustomerInfo;

@Service
public class CustomerAccountService {
    public CustomerAccount getCustomerAccount() {
        CustomerAccount customerAccount = new CustomerAccount();
        AccountInfo account = new AccountInfo();
        account.setAccountId("1");
        account.setAccountName("John Doe");
        customerAccount.setAccount(account);
        CustomerInfo customer = new CustomerInfo();
        customer.setCustomerId("1");
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setEmail("john.doe@world.com");
        return customerAccount;
    }
}
