package guru.springframework.sfgdi.repositories;

/**
 * @author jasim
 */
public class EnglishGrettingRepositoryImpl implements EnglishGrettingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }

}

