package ph.maya.devsecops.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountInfo {
  private String accountId;
  private String accountName;
  private Date dateCreated;
  private Boolean isActive;
}
