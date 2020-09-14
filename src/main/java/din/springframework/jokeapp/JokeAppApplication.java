package din.springframework.jokeapp;

import din.springframework.jokeapp.services.JokesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokeAppApplication.class, args);

    }

}
