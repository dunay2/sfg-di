package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author jasim
 */
@Primary
@Service
public class PrimaryGretingService  implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello world from the PRIMARY bean";
    }
}
