package pixel.academy.thyme.leaf_app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // metoda pentru a afisa formularul HTML initial

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }
}
