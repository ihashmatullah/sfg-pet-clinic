package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by HashmatN at 3:51 PM on Sep 09, 2021
 * Closes ticket issue #2
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

  @Column(name = "name")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
