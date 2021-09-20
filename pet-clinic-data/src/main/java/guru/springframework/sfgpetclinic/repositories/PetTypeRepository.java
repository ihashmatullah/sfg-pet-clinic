package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 5:01 PM on Sep 20, 2021
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
