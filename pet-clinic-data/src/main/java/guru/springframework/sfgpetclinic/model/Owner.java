package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by HashmatN at 3:48 PM on Sep 09, 2021, new
 */
public class Owner extends Person {
  private Set<Pet> pets;

  public Set<Pet> getPets() {
    return pets;
  }

  public void setPets(Set<Pet> pets) {
    this.pets = pets;
  }
}
