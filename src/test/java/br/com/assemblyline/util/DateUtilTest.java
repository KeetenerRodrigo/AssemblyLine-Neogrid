package br.com.assemblyline.util;

import java.time.LocalDateTime;
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
public class DateUtilTest {

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
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for
     * {@link br.com.assemblyline.util.DateUtil#dateToString(org.joda.time.LocalDateTime)}.
     */
    @Test
    public void testDateToString() {
        LocalDateTime DateTimeNow = LocalDateTime.now();
        
        LocalDateTime localDateTime = LocalDateTime.of(DateTimeNow.getYear(), 
                DateTimeNow.getMonth(), DateTimeNow.getDayOfMonth(), 9, 0);

        assertEquals(DateUtil.dateToString(localDateTime), "09:00AM");
    }

}
