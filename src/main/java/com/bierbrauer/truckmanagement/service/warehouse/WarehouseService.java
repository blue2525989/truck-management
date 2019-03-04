package com.bierbrauer.truckmanagement.service.warehouse;

import com.bierbrauer.truckmanagement.model.warehouse.Warehouse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "WarehouseService")
public class WarehouseService {

    public ArrayList<Warehouse> getWarehouses() {
        ArrayList<Warehouse> warehouses = new ArrayList<>();

        Warehouse warehouse1 = new Warehouse("ware 1", "warehouse 1");
        Warehouse warehouse2 = new Warehouse("ware 2", "warehouse 2");

        warehouses.add(warehouse1);
        warehouses.add(warehouse2);

        return warehouses;
    }
}
