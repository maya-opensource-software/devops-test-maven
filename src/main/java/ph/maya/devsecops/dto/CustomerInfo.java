package ph.maya.devsecops.dto;

@lombok.Data
public class CustomerInfo {
  private String customerId;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;
  private String address;
  private Integer zipCode;
}
