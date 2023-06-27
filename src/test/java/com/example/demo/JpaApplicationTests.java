//package com.example.demo;
//import org.springframework.http.MediaType;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Import;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import com.example.Service.ServiceFile;
//import com.example.controller.Controller;
//
//@SpringBootTest
//
////@WebMvcTest(Controller.class)
////@Import(Config.class) 
////@TestPropertySource(properties = { "my.property=jdbc:mariadb://localhost:3306/testing", "another.property=testing" })
//
//class JpaApplicationTests {
//
//	@Autowired
//	Controller controller;
//	
////	@MockBean
////    private ServiceFile serviceFile;
//	
//	@Test
//	void IntegerTest() throws Exception {
//		assertEquals(controller.StringTest("ok"),"ok");
////		   this.mockMvc.perform(get("/first/asd")).andDo(print()).andExpect(status().isOk());
//	}
//
//}
