package ph.maya.devsecops.dto;

import java.util.Date;

@lombok.Getter
@lombok.Setter
public class AccountInfo {
  private String accountId;
  private String accountName;
  private Date dateCreated;
  private Boolean isActive;
}
