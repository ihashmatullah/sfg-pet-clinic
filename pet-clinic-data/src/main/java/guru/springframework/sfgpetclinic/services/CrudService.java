package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by HashmatN at 5:03 PM on Sep 13, 2021
 */
public interface CrudService<T, ID> {

  Set<T> findAll();
  T findById(ID id);
  T save(T object);
  void delete(T object);
  void deleteById(ID id);
}
