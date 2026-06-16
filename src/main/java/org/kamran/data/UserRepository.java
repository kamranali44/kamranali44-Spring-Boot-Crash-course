package org.kamran.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByFirstName(String firstName);
    void deleteByFirstName(String firstName);
}
