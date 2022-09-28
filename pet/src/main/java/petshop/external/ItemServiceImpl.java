package petshop.external;

import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    /**
     * Fallback
     */
    public Item getItem(Long id) {
        Item item = new Item();
        return item;
    }
}
