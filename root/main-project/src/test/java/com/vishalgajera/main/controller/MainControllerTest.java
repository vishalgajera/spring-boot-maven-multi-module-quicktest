package com.vishalgajera.main.controller;

import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.vishalgajera.main.MainProjectApplication;
import com.vishalgajera.projectA.A;
import com.vishalgajera.projectB.B;

/**
 * The Class MainControllerTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MainProjectApplication.class,
		/** define default port */
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class MainControllerTest {

	/** The mock mvc. */
	@Autowired
	private MockMvc mockMvc;

	/** The a bean. */
	@Mock
	private A aBean;

	/** The b bean. */
	@Mock
	private B bBean;

	/** The main controller. */
	@InjectMocks
	private MainController mainController;

	/**
	 * Test A.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testA() throws Exception {
		String url = "/A";
		MvcResult mvcResult = mockMvc.perform(get(url)).andExpect(status().isOk()).andDo(print()).andReturn();
		String actualResult = mvcResult.getResponse().getContentAsString();
		String expectedResult = "result from method A of a Class-A";
		assertEquals(expectedResult, actualResult);
	}

	/**
	 * Test B.
	 *
	 * @throws Exception
	 *             the exception
	 */
	@Test
	public void testB() throws Exception {
		String url = "/B";
		MvcResult mvcResult = mockMvc.perform(get(url)).andExpect(status().isOk()).andDo(print()).andReturn();
		String actualResult = mvcResult.getResponse().getContentAsString();
		String expectedResult = "result from method B of a Class-B";
		assertEquals(expectedResult, actualResult);
	}

}
