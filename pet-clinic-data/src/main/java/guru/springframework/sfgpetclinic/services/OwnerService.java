package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * Created by HashmatN at 4:41 PM on Sep 10, 2021
 */
public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);
}
