package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 09/11/2011 21:36:38
 * @author Jonas
 */
public class RegistroA111Test {
    public RegistroA111Test(){
        
    }   

    public String linhaRegistroA111Test(){
        RegistroA111 reg = new RegistroA111();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroA111.NUM_PROC, "sdsdf234f234125");
        //03
        line.setFieldValue(RegistroA111.IND_PROC, "3");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|A111|sdsdf234f234125|3|";
//        assertEquals (expected, sb.toString());
        return sb.toString();        
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
    public void testSomeMethod() {
    }
}
