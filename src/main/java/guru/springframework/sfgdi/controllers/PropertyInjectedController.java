package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author jasim
 */
@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGretingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting ()
    {
        return greetingService.sayGreeting();

    }

}
