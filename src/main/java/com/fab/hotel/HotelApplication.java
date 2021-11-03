package com.fab.hotel;

import java.util.Arrays;

import org.apache.skywalking.apm.meter.micrometer.SkywalkingConfig;
import org.apache.skywalking.apm.meter.micrometer.SkywalkingMeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotelApplication {

	private static final Logger log = LoggerFactory.getLogger(HotelApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}
	@Bean
  public CommandLineRunner demo(CustomerRepository repository) {
    return (args) -> {
      // save a few customers
      repository.save(new Customer("Ritesh", "Deshmukh"));
      repository.save(new Customer("Sonu", "Nigam"));
      repository.save(new Customer("Allu", "Arjun"));
      repository.save(new Customer("Scheldon", "Cooper"));
      repository.save(new Customer("Pawan", "Kalyan"));
	  repository.save(new Customer("Barbie", "Jonas"));

      // fetch all customers
      log.info("Customers found with findAll():");
      log.info("-------------------------------");
      for (Customer customer : repository.findAll()) {
        log.info(customer.toString());
      }
      log.info("");
    };
  }
  @Bean
  SkywalkingMeterRegistry skywalkingMeterRegistry() {
    // SkywalkingMeterRegistry registry = new SkywalkingMeterRegistry();

      // Add rate configs If you need, otherwise using none args construct
      SkywalkingConfig config = new SkywalkingConfig(Arrays.asList(""));
      return new SkywalkingMeterRegistry(config);
  }

}
