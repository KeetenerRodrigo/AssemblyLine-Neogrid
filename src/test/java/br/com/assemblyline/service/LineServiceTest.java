package br.com.assemblyline.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Keetener Rodrigo
 *
 */
public class LineServiceTest {

	private LineService lineService;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		lineService = new LineService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link br.com.assemblyline.service.LineService#getLineOne()}.
	 */
	@Test
	public void testGetLineOne() {
		assertEquals(lineService.getLineOne().getDescription(), "Assembly Line 1:");
		assertEquals(lineService.getLineOne().getProcess().size(), 11);
	}

	/**
	 * Test method for {@link br.com.assemblyline.service.LineService#getLineTwo()}.
	 */
	@Test
	public void testGetLineTwo() {
		assertEquals(lineService.getLineTwo().getDescription(), "Assembly Line 2:");
		assertEquals(lineService.getLineTwo().getProcess().size(), 12);
	}

}
