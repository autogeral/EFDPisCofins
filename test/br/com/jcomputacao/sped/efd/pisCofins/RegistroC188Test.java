package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 11/11/2011 19:03:46
 * @author rafael.galvao
 */
public class RegistroC188Test extends Randomize {
    
    public RegistroC188Test() {
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

    /**
     * Test of getNome method, of class RegistroC188.
     */
    @Test
    public void RegistroC188Test(){
        RegistroC188 reg = new RegistroC188();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC188.NUM_PROC, "Ident Process");
        //03
        line.setFieldValue(RegistroC188.IND_PROC, "3");
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|C188|Ident Process|3|";
//        assertEquals (expected, sb.toString());
        
    }
}
