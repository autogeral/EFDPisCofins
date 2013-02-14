package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 09/11/2011 21:59:37
 * @author rafael.galvao
 */
public class RegistroC111Test {
    
    public RegistroC111Test() {
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
    public void RegistroC111Test(){
        RegistroC111 reg = new RegistroC111();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroC111.NUM_PROC, "Identif do processo");
        //03
        line.setFieldValue(RegistroC111.IND_PROC, "3");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|C111|Identif do processo|3|";
//        assertEquals (expected, sb.toString());
        
    }
}
