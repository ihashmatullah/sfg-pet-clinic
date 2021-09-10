package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by HashmatN at 4:46 PM on Sep 10, 2021
 */
public interface PetService {
  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
