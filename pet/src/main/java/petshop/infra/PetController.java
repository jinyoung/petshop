package petshop.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import petshop.domain.*;
import petshop.domain.usecase.*;

@RestController
@RequestMapping(value = "/pets")
@Transactional
public class PetController {

    @Autowired
    PetCommand petCommand;

    @RequestMapping(
        value = "/{id}/feed",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Item feed(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /item/feed  called #####");
        Optional<Item> optionalItem = itemRepository.findById(id);

        optionalItem.orElseThrow(() -> new Exception("No Entity Found"));
        Item item = optionalItem.get();
        itemCommand.feed();

        return item;
    }

    @RequestMapping(
        value = "/{id}/unregister",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Pet unregister(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /pet/unregister  called #####");
        Optional<Pet> optionalPet = petRepository.findById(id);

        optionalPet.orElseThrow(() -> new Exception("No Entity Found"));
        Pet pet = optionalPet.get();
        petCommand.unregister();

        return pet;
    }
}
