package serviceConsumer;

import org.springframework.stereotype.Component;

@Component
public class UserClientFailImpl implements UserClient{

    @Override
    public User getUser(long id) {
        System.out.println("Using Hystrix");
        User user = new User();
        user.setId((long) -1);
        user.setAge(-1);
        user.setUsername("");
        user.setPassword("");
        return user;
    }
}
