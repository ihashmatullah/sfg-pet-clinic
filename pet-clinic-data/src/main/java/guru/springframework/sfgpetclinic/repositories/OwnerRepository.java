package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 4:59 PM on Sep 20, 2021
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
  Owner findByLastName(String lastname);
}
