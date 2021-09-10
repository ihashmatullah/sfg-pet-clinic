package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by HashmatN at 4:41 PM on Sep 10, 2021
 */
public interface OwnerService {

  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Owner save(Owner owner);

  Set<Owner> findAll();

}