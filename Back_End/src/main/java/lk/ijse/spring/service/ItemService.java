package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ItemDTO;

import java.util.List;

public interface ItemService {

    void addItem(ItemDTO dto);

    void deleteItem(String id);

    List<ItemDTO> getAllItem();

    ItemDTO findItem(String id);

    void updateItem(ItemDTO c);
}
