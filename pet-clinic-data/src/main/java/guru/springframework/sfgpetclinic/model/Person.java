package guru.springframework.sfgpetclinic.model;

/**
 * Created by HashmatN at 3:44 PM on Sep 09, 2021
 */
public class Person extends BaseEntity {

  private String firstName;
  private String lastName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
