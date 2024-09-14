package ph.maya.devsecops.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerAccount {
    private AccountInfo account;
    private CustomerInfo customer;
}
