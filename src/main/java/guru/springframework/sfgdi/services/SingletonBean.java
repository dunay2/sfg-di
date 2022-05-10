package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * @author jasim
 */
@Component
public class SingletonBean {
    public SingletonBean() {

        System.out.println("Creating a Singleton bean");
    }

    public String getMyScope()
    {
        return "I'm singleton";
    }

}
