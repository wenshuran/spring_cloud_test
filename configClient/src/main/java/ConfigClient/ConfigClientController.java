package ConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    @Value("${test}")
    String test;

    @GetMapping(value = "/test")
    public String test(){
        return test;
    }
}
