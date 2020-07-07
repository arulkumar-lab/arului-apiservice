package com.arului.apiservice;

import com.arului.apiservice.modal.ItemDetail;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List< ItemDetail > findItems() {
        List<ItemEntity> entityList = itemRepository.findAll();
        List< ItemDetail > results = new ArrayList< ItemDetail > ();
        for (ItemEntity itemEntity : entityList) {
            ItemDetail model = new ItemDetail ();
            BeanUtils.copyProperties(itemEntity, model);
            results.add(model);
        }
        return results;
    }

    public List< ItemDetail > findItemByType( EnItemType type) {
        List<ItemEntity> entityList = itemRepository.findByType(type);
        List< ItemDetail > results = new ArrayList<>();
        for (ItemEntity itemEntity : entityList) {
            ItemDetail model = new ItemDetail ();
            BeanUtils.copyProperties(itemEntity, model);
            results.add(model);
        }
        return results;
    }

    public ItemDetail saveItem( ItemDetail item) {
        ItemEntity entity = new ItemEntity();
        BeanUtils.copyProperties(item, entity);

        ItemEntity saved = itemRepository.save(entity);
        ItemDetail result = new ItemDetail ();
        BeanUtils.copyProperties(saved, result);
        return result;
    }
}
