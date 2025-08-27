package edu.adaschool.integrador.service.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private Map<String, User> users = new HashMap<>();

    @Override
    public User save(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public void delete(String id) {
        users.remove(id);
    }

    @Override
    public User update(User user, String userId) {

        User existingUser = users.get(userId);

        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setLastName(user.getLastName());
            existingUser.setEmail(user.getEmail());
            return existingUser;
        }
        return null;
    }

}
