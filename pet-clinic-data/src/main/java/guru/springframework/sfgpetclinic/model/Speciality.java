package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by HashmatN at 10:52 AM on Sep 17, 2021
 */
@Entity
@Table(name = "specialties")
public class Speciality extends BaseEntity {

  @Column(name = "description")
  private String description;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
