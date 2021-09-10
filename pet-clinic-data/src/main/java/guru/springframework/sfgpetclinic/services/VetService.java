package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by HashmatN at 4:48 PM on Sep 10, 2021
 */
public interface VetService {
  Vet findById(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();
}
