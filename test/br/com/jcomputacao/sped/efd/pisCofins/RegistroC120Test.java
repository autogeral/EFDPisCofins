package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 09/11/2011 22:10:18
 * @author rafael.galvao
 */
public class RegistroC120Test  {
    
    public RegistroC120Test() {
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
    public String linhaRegistroC120Test(){
        RegistroC120 reg = new RegistroC120();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroC120.COD_DOC_IMP, "1");
        //03
        line.setFieldValue(RegistroC120.NUM_DOC_IMP, "1548711");
        //04
        line.setFieldValue(RegistroC120.VL_PIS_IMP, 78978.12);
        //05
        line.setFieldValue(RegistroC120.VL_COFINS_IMP, 7893.23);
        //06
        line.setFieldValue(RegistroC120.NUM_ACDRAW, "56648115");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|C120|1|1548711|78978,12|7893,23|56648115|";
//        assertEquals (expected, sb.toString());
        return sb.toString();
    }
}
