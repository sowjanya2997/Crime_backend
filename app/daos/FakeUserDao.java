package daos;

import com.google.common.collect.ImmutableList;
import com.google.inject.Singleton;
import models.User;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

@Singleton
public class FakeUserDao implements UserDao {

    private User user;

    @Override
    public User create(User entity) {
        user = entity;
        return user;
    }

    @Override
    public Optional<User> read(Integer id) {
        return Optional.of(user);
    }

    @Override
    public User update(User entity) {
        user = entity;
        return user;
    }

    @Override
    public User delete(Integer id) {
        user = null;
        return user;
    }

    @Override
    public Collection<User> getAllUsers() {
        return Arrays.asList(user);
    }

    @Override
    public User findUserByName(String username) {
        return user;
    }

    @Override
    public User findUserByAuthToken(String authToken) {
        return user;
    }
}
