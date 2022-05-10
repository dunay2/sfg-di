package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author jasim
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class ProtoTypeBean {
    public ProtoTypeBean() {
        System.out.println("Creating a ProtoType bean");
    }


    public String getMyScope()
    {
        return "I'm ProtoType Bean";
    }


}
