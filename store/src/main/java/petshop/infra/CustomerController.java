package petshop.infra;
import petshop.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/customers")
@Transactional
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;



    @RequestMapping(value = "customers/{id}/createAccount4",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Customer createAccount(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /customer/createAccount  called #####");
            Optional<Customer> optionalCustomer = customerRepository.findById(id);
            
            optionalCustomer.orElseThrow(()-> new Exception("No Entity Found"));
            Customer customer = optionalCustomer.get();
            customer.createAccount();
            
            customerRepository.save(customer);
            return customer;
            
    }
    



    @RequestMapping(value = "customers/{id}/deleteAccount",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Customer deleteAccount(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /customer/deleteAccount  called #####");
            Optional<Customer> optionalCustomer = customerRepository.findById(id);
            
            optionalCustomer.orElseThrow(()-> new Exception("No Entity Found"));
            Customer customer = optionalCustomer.get();
            customer.deleteAccount();
            
            customerRepository.save(customer);
            return customer;
            
    }
    



    @RequestMapping(value = "customers/{id}/createAvatar",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Customer createAvatar(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /customer/createAvatar  called #####");
            Optional<Customer> optionalCustomer = customerRepository.findById(id);
            
            optionalCustomer.orElseThrow(()-> new Exception("No Entity Found"));
            Customer customer = optionalCustomer.get();
            customer.createAvatar();
            
            customerRepository.save(customer);
            return customer;
            
    }
    



    @RequestMapping(value = "customers/{id}/newAPI",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public Customer newApi(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /customer/newApi  called #####");
            Optional<Customer> optionalCustomer = customerRepository.findById(id);
            
            optionalCustomer.orElseThrow(()-> new Exception("No Entity Found"));
            Customer customer = optionalCustomer.get();
            customer.newApi();
            
            customerRepository.save(customer);
            return customer;
            
    }
    



}
