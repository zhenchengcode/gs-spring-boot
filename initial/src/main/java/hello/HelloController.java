package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

// @Controller + @ResponseBody
@RestController
public class HelloController {

    // invoked from browser/curl/postman etc.
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
