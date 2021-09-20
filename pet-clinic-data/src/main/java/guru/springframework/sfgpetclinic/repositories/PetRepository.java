package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 5:00 PM on Sep 20, 2021
 */
public interface PetRepository extends CrudRepository<Pet, Long> {

}
