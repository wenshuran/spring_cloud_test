package serviceConsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "provider01/provider", fallback = UserClientFailImpl.class)
public interface UserClient {
    @GetMapping("/user/{id}")
    User getUser(@PathVariable("id") long id);
}
