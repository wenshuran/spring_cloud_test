package ServiceProvider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}") //user/1
    public User getUser(@PathVariable("id") long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()){
            User user = userOptional.get();
            return user;
        }
        else
            return null;
    }

    
    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @PostMapping("/add")
    public void addUser(String name, String username, String password){
        User user = new User();
        user.setName("abc");
        user.setUsername("username");
        user.setPassword("password");
        userRepository.save(user);
    }

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }


}
