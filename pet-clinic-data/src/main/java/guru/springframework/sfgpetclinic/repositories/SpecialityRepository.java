package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 5:01 PM on Sep 20, 2021
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
