package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HashmatN at 5:02 PM on Sep 20, 2021
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
