package simpleSpringBootWithAngularApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner{
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
	
	@Autowired
    private UserRepository userRepository;

	@Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Ramesh", "ramesh@gmail.com"));
        this.userRepository.save(new User("Tom", "tom@gmail.com"));
        this.userRepository.save(new User("Tony", "tony@gmail.com"));
    }
}

