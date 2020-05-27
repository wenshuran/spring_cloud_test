package serviceConsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "PROVIDER01")
public interface UserClient {
    @GetMapping("/provider/user/{id}")
    User getUser(@PathVariable("id") long id);
}
