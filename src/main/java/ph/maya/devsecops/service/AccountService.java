package ph.maya.devsecops.service;

import ph.maya.devsecops.dto.AccountInfo;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public AccountInfo getAccount() {
        AccountInfo account = new AccountInfo();
        account.setAccountId("1");
        account.setAccountName("John Doe");
        return account;
    }
}