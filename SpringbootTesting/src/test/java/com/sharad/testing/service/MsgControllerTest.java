package com.sharad.testing.service;

import com.sharad.testing.controller.MsgController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@WebMvcTest(controllers = MsgController.class)
public class MsgControllerTest {

    @MockitoBean
    private MsgService msgService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public  void  testMsg() throws Exception{
        // define the behavior of the mock object
        when(msgService.getMessage()).thenReturn("Dummy Message");
        doNothing().when(msgService).sendEmail();  // we are not interested in the actual implementation of the sendEmail() method, so we can use doNothing() to specify that it should do nothing when called.
        // prepare the request
        MockHttpServletRequestBuilder request =  MockMvcRequestBuilders.get("/msg");
        // perform the request and get the response
        MvcResult mvcResult = mockMvc.perform(request).andReturn();
        //catch the response and verify the result
        MockHttpServletResponse response = mvcResult.getResponse();
        String stringContent = response.getContentAsString();
        int status = response.getStatus();
        // verify the result
        Assertions.assertEquals(200,status);
    }

    // we can also add more test cases to cover different scenarios, such as when the getMessage() method returns null or an empty string, and verify that the sendEmail() method is not called in those cases.
    @Test
    public void testMsg_NullOrEmptyMessage() throws Exception {
        // Test case for null message
        when(msgService.getMessage()).thenReturn(null);

        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/msg");
        MvcResult mvcResult = mockMvc.perform(request).andReturn();
        MockHttpServletResponse response = mvcResult.getResponse();
        String stringContent = response.getContentAsString();
        int status = response.getStatus();
        Assertions.assertEquals(200, status);
       // Assertions.assertNull(stringContent);

        // Test case for empty message
        when(msgService.getMessage()).thenReturn("");
        mvcResult = mockMvc.perform(request).andReturn();
        response = mvcResult.getResponse();
        stringContent = response.getContentAsString();
        status = response.getStatus();
        Assertions.assertEquals(200, status);
       // Assertions.assertNull(stringContent);
    }
}
