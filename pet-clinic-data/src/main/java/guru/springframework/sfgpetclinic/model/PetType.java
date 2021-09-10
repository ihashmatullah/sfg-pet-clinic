package guru.springframework.sfgpetclinic.model;

/**
 * Created by HashmatN at 3:51 PM on Sep 09, 2021
 * Closes ticket issue #2
 */
public class PetType extends BaseEntity {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
