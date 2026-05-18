package com.sharad.testing.service;

import com.sharad.testing.controller.CustomerController;
import com.sharad.testing.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import tools.jackson.databind.ObjectMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = CustomerController.class)
public class CustomerControllerTest {

    @MockitoBean
    private CustomerService customerService;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

     // Test cases for saveCustomer method
     // 1. Test case for successful save
    @Test
    public void testSaveCustomer_Success()throws Exception{
        when(customerService.saveCustomer(any(Customer.class))).thenReturn(true);

        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Sharad");
        customer.setEmail("sharad@gmail.com");
        // conver customer object to JSON string
        ObjectMapper mapper= new ObjectMapper();
        String customerJson=mapper.writeValueAsString(customer);

        // perform POST request to /saveCustomer endpoint with customer JSON and verify response
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/customers")
                .contentType("application/json")
                .content(customerJson);
        // save request and verify the response
        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk());

    }

     // 2. Test case for failed save (e.g., due to validation errors)
    @Test
    public void testSaveCustomer_Failure() throws Exception {
        when(customerService.saveCustomer(any(Customer.class))).thenReturn(false);
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Sharad");

        // perform POST request to /saveCustomer endpoint with customer JSON and verify response
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/customers")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(customer));
        mockMvc.perform(requestBuilder)
                .andExpect(status().is5xxServerError())
                .andExpect(content().string("Customer could not be saved"));

    }

    }
