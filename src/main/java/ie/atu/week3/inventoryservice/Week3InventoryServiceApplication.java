package ie.atu.week3.inventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week3InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week3InventoryServiceApplication.class, args);
    }

}
