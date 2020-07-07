package com.arului.apiservice;

import com.arului.apiservice.modal.ItemDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (
        value = "/item",
        produces = { MediaType.APPLICATION_JSON_VALUE  })
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public List< ItemDetail > findItems() {
        return itemService.findItems();
    }
}
