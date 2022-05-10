package guru.springframework.sfgdi.config;

import guru.springframework.pets.CatPetService;
import guru.springframework.pets.DogPetService;
import guru.springframework.pets.PetService;
import guru.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositories.EnglishGrettingRepository;
import guru.springframework.sfgdi.repositories.EnglishGrettingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;


/**
 * @author jasim
 * Beans of external components. Also Config file to define beans instead of class notations
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService() {
        return new PetServiceFactory().getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService() {
        return new PetServiceFactory().getPetService("cat");
    }

    @Bean
    EnglishGrettingRepository englishGrettingRepository() {
        return new EnglishGrettingRepositoryImpl();
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }

    @Profile("EN")
    @Bean("i18nService")
    I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGrettingRepository englishGrettingRepository) {
        return new I18nEnglishGreetingService(englishGrettingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }


}
