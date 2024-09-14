package ph.maya.devsecops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ph.maya.devsecops.dto.AccountInfo;
import ph.maya.devsecops.service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountEndpoint {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public AccountInfo getAccount() {
        return accountService.getAccount();
    }
}
