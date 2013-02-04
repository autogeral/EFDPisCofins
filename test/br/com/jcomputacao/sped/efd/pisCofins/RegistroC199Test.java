package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 12/11/2011 11:15:04
 * @author rafael.galvao
 */
public class RegistroC199Test {
    
    public RegistroC199Test() {
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
     * Test of getNome method, of class RegistroC199.
     */
    @Test
    public void RegistroC199Test(){
        RegistroC199 reg = new RegistroC199();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC199.COD_DOC_IMP, "1");
        //03
        line.setFieldValue(RegistroC199.NUM_DOC_IMP, "123457897");
        //04
        line.setFieldValue(RegistroC199.VL_PIS_IMP, 3456789.32);
        //05
        line.setFieldValue(RegistroC199.VL_COFINS_IMP, 56789.32);
        //06
        line.setFieldValue(RegistroC199.NUM_ACDRAW, " asdfghjklçpoiuytrew");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|C199|1|123457897|3456789,32|56789,32| asdfghjklçpoiuytrew|";
//        assertEquals(expected, sb.toString());
        
    }
}
