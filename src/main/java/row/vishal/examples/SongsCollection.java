package row.vishal.examples;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
@SpringBootApplication
public class SongsCollection {
	public static void main(String[] args) {
		SpringApplication.run(SongsCollection.class, args);
	}

	@Bean
	public Function<String,String> toUpperCase() {
		return (value) -> new StringBuilder(value).toString().toUpperCase();
	}

	@Bean
	public Supplier<String> getMessage() {
		return () -> "GTAJava Song Collection welcomes you, what do you want to do today?";
	}

	@Bean
	public Consumer<String> writeMessage() {
		return (value) -> System.out.println(value);
	}
}
