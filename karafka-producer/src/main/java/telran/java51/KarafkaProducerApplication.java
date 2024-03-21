package telran.java51;


import java.util.Random;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KarafkaProducerApplication {

	Random rnd = new Random();
	
	public static void main(String[] args) {
		SpringApplication.run(KarafkaProducerApplication.class, args);
	}
	
	@Bean
	Supplier<String> strsup() {
	    return () -> rnd.nextDouble(Double.MAX_VALUE)+"";
	}

}
