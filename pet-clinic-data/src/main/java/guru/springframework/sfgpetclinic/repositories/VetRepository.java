package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 5:02 PM on Sep 20, 2021
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
