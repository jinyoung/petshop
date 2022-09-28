package petshop.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "pet", url = "${api.url.pet}")
public interface PetService {
    @RequestMapping(method= RequestMethod.GET, path="/pets/{id}")
    public Pet getPet(@PathVariable("id") Long id);
}

