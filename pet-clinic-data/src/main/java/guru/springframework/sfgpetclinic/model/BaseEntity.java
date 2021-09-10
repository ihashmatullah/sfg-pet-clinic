package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by HashmatN at 5:11 PM on Sep 10, 2021
 */
public class BaseEntity implements Serializable {
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
