package ph.maya.devsecops.service;

import ph.maya.devsecops.dto.AccountInfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    private final AccountService accountService = new AccountService();

    @Test
    void returnsAccountInfoWithValidData() {
        AccountInfo account = accountService.getAccount();
        assertNotNull(account);
        assertEquals("1", account.getAccountId());
        assertEquals("John Doe", account.getAccountName());
    }

    @Test
    void returnsAccountInfoWithNonNullFields() {
        AccountInfo account = accountService.getAccount();
        assertNotNull(account.getAccountId());
        assertNotNull(account.getAccountName());
    }
}