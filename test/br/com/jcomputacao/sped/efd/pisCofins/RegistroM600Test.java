package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 20:00:21
 * @author rafael.galvao
 */
public class RegistroM600Test {
    
    public RegistroM600Test() {
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
     * Test of getNome method, of class RegistroM600.
     */
    @Test
    public void RegistroM610Test(){
        RegistroM600 rm = new RegistroM600();
        LineModel line = rm.createModel();
        
        //02
        line.setFieldValue(RegistroM600.VL_TOT_CONT_NC_PER, 100000000000.01);
        //03
        line.setFieldValue(RegistroM600.VL_TOT_CRED_DESC,100000000000.01);
        //04
        line.setFieldValue(RegistroM600.VL_TOT_CRED_DESC_ANT, 300000000000.03);
        //05
        line.setFieldValue(RegistroM600.VL_TOT_CONT_NC_DEV, 400000000000.04);
        //06
        line.setFieldValue(RegistroM600.VL_RET_NC, 500000000000.05);
        //07
        line.setFieldValue(RegistroM600.VL_OUT_DED_NC, 600000000000.06);
        //08
        line.setFieldValue(RegistroM600.VL_CONT_NC_REC, 700000000000.07);
        //09
        line.setFieldValue(RegistroM600.VL_TOT_CONT_CUM_PER, 900000000000.09);
        //10
        line.setFieldValue(RegistroM600.VL_RET_CUM, 100000000000.01);
        //11
        line.setFieldValue(RegistroM600.VL_OUT_DED_CUM, 200000000000.02);
        //12
        line.setFieldValue(RegistroM600.VL_CONT_CUM_REC, 300000000000.03);
        //13
        line.setFieldValue(RegistroM600.VL_TOT_CONT_REC, 400000000000.04);
     
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M600|100000000000,01|200000000000,02|300000000000,03|400000000000,04|500000000000,05|600000000000,06|700000000000,07|900000000000,09|100000000000,01|200000000000,02|300000000000,03|400000000000,04|";
//	assertEquals (expected, sb.toString());
    }
}
