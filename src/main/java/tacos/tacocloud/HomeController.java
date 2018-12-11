package tacos.tacocloud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller. Its primary purpose is to identify this class as a component for component scanning
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
}
