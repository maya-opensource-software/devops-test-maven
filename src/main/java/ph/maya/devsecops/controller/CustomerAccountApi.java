package ph.maya.devsecops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ph.maya.devsecops.dto.CustomerAccount;

@RestController
@RequestMapping("/api/customer-account")
public class CustomerAccountApi {

    @Autowired
    CustomerAccountApi customerAccountService;

    @GetMapping
    public CustomerAccount getCustomerAccount() {
        return customerAccountService.getCustomerAccount();
    }
}
