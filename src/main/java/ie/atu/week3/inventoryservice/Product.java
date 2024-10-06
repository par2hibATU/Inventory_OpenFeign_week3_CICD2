package ie.atu.week3.inventoryservice;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value = 0)
    private long id;

    @NotBlank
    private String name;

    @Min(value = 0)
    private double price;
}
