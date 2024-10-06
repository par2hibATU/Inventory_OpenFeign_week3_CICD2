package ie.atu.week3.inventoryservice;


import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductInventory {
    private Long id;
    private String name;
    private Double price;
    private String make;
    private int quantity;

    @Override
    public String toString() {
        return "ProductInventory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", make='" + make + '\'' +
                ", quantity=" + quantity +
                '}';
    }

}
