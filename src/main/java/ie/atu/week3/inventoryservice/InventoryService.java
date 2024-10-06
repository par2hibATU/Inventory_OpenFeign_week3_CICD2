package ie.atu.week3.inventoryservice;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventoryService {
    @Getter
    private List<Inventory> inventoryList = new ArrayList<>();

    @Autowired
    private InventoryServiceClient inventoryServiceClient;

    public List<Inventory>getInventoryList(){return inventoryList;}

    public Inventory addInventory(Inventory inventory){
        inventoryList.add(inventory);
        return inventory;
    }

    public Inventory updateInventory(long id, Inventory updatedInventory) {
        for (Inventory inventory : inventoryList) {
            if (inventory.getId() == id) {
                inventory.setName(updatedInventory.getName());
                inventory.setPrice(updatedInventory.getPrice());
                inventory.setMake(updatedInventory.getMake());
                inventory.setSerial_no(updatedInventory.getSerial_no());
                return inventory;
            }
        }
        return updatedInventory;
    }


    public Inventory deleteInventory ( long id){
        for(Inventory inventory : inventoryList){
            if(inventory.getId()==id){
                inventoryList.remove(inventory);
            }
        }
        return null;
    }
}
