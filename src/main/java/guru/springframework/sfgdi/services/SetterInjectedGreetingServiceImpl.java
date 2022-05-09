package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author jasim
 */
@Service
public class SetterInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
