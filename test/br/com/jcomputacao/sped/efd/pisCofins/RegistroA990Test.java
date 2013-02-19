package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 10/11/2011 20:44:01
 * @author Jonas
 */
public class RegistroA990Test {
    
    public RegistroA990Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void RegistroA990Test() throws ParseException {
        
        RegistroA990 reg = new RegistroA990();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroA990.QTD_LIN_A, 2);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|A990|2|";
//        assertEquals (expected, sb.toString());
             
    } 
}
