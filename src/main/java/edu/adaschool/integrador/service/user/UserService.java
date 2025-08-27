package edu.adaschool.integrador.service.user;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);

    Optional<User> findById(String id);

    void delete(String id);

    User update(User user, String userId);
}
