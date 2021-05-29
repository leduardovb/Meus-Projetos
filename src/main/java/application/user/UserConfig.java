package application.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User user1 = new User(
                    "Maria"
            );

            User user2 = new User(
                    "Eduardo"
            );

            userRepository.saveAll(List.of(user1 , user2));
        };
    }
}
