package com.bierbrauer.truckmanagement.controller.warehouse;

import com.bierbrauer.truckmanagement.model.warehouse.Warehouse;
import com.bierbrauer.truckmanagement.service.warehouse.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController()
@RequestMapping(path = "warehouses")
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @GetMapping("/")
    public ArrayList<Warehouse> get() {
        try {
            return warehouseService.getWarehouses();
        } catch (Exception e) {
            // throw for now
            throw e;
        }
    }
}
