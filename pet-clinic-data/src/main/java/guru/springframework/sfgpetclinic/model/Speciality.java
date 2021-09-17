package guru.springframework.sfgpetclinic.model;

/**
 * Created by HashmatN at 10:52 AM on Sep 17, 2021
 */
public class Speciality extends BaseEntity {
  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
