package com.lyl.learndevtools;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lyl.learndevtools.entity.Book;
import com.lyl.learndevtools.service.HelloService;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Testlearndevtools {
    @Autowired
    HelloService helloService;
    @Autowired
    WebApplicationContext wac;
    MockMvc mockMvc;
    @Before
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Test
    public void test1() throws Exception {
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders
                .get("/hello")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("name","Michael"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andDo(MockMvcResultHandlers.print())
            .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }
    @Test
    public void test2() throws Exception {
        ObjectMapper om = new ObjectMapper();
        Book book = new Book();
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setId(1);
        String s = om.writeValueAsString(book);
        MvcResult mvcResult = mockMvc
                .perform(MockMvcRequestBuilders
                .post("/book")
                .contentType(MediaType.APPLICATION_JSON)
                .content(s))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }
    @Test
    public void contextLoads() {
        String hello = helloService.sayHello("Michael");
        Assert.assertThat(hello, Matchers.is("Hello Michael !"));
    }
}
