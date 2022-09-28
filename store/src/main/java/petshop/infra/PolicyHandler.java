package petshop.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import petshop.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import petshop.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired ItemRepository itemRepository;
    @Autowired OrderItemRepository orderItemRepository;
    @Autowired CustomerRepository customerRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @Autowired
    petshop.external.PetService petService;

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='PetRegistered'")
    public void wheneverPetRegistered_DisplayToTheShop(@Payload PetRegistered petRegistered){

        PetRegistered event = petRegistered;
        System.out.println("\n\n##### listener DisplayToTheShop : " + petRegistered + "\n\n");

        // REST Request Sample
        
        // petService.getPet(/** mapping value needed */);


        

        // Sample Logic //
        Item.displayToTheShop(event);
        

        

    }

}


