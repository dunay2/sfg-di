package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGrettingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */

public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGrettingRepository englishGrettingRepository;

    public I18nEnglishGreetingService(EnglishGrettingRepository englishGrettingRepository) {
        this.englishGrettingRepository = englishGrettingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.englishGrettingRepository.getGreeting() ;
    }
}
