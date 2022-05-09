package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author jasim
 */
@Controller
public class ConstructorInjectorController {

    private final GreetingService greetingService;

    public ConstructorInjectorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting ()
    {
        return greetingService.sayGreeting();

    }
}
