package ma.enset.bdccensetspringmvc;

import ma.enset.bdccensetspringmvc.entities.Product;
import ma.enset.bdccensetspringmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BdccEnsetSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdccEnsetSpringMvcApplication.class, args);
    }
    @Bean
    public CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
           productRepository.save(Product.builder()
                           .name("computer")
                           .price(5400)
                           .quantity(2)

                   .build());
            productRepository.save(Product.builder()
                    .name("printer")
                    .price(8030)
                    .quantity(12)

                    .build());
            productRepository.save(Product.builder()
                    .name("camera")
                    .price(400)
                    .quantity(10)

                    .build());
            productRepository.findAll().forEach(p->{
                System.out.println(p.toString());
            });

        };
    }

}
