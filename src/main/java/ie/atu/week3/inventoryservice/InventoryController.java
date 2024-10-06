package ie.atu.week3.inventoryservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    @GetMapping("/allproduct")
    public String getALLProducts(){return inventoryServiceClient.getProducts();}

    @PostMapping("/newdetails")
    public String addInventory(@RequestBody Inventory inventory){return inventoryServiceClient.addDetails(inventory);}

    @PutMapping("/newdetails/{id}")
    public String updatedInventory(@PathVariable long id, @RequestBody Inventory inventory){return inventoryServiceClient.updateDetails(id, inventory);}

    @PostMapping("/newdetails/{id}")
    public String deleteInventory(@PathVariable long id){return inventoryServiceClient.deleteDetails(id);}

}
