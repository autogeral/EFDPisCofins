package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 22/11/2011 20:15:22
 * @author rafael.galvao
 */
public class RegistroM200Test {
    
    public RegistroM200Test() {
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
     * Test of getNome method, of class RegistroM200.
     */
    @Test
    public void RegistroM200Test()  {
        RegistroM200 reg = new RegistroM200();
        LineModel line = reg.createModel();
                 
        //02
        line.setFieldValue(RegistroM200.VL_TOT_CONT_NC_PER, 100000000000.01);
        //03
        line.setFieldValue(RegistroM200.VL_TOT_CRED_DESC,200000000000.02);
        //04
        line.setFieldValue(RegistroM200.VL_TOT_CRED_DESC_ANT, 300000000000.03);
        //05
        line.setFieldValue(RegistroM200.VL_TOT_CONT_NC_DEV, 400000000000.04);
        //06
        line.setFieldValue(RegistroM200.VL_RET_NC, 500000000000.05);
        //07
        line.setFieldValue(RegistroM200.VL_OUT_DED_NC, 600000000000.06);
        //08
        line.setFieldValue(RegistroM200.VL_CONT_NC_REC, 700000000000.07);
        //09
        line.setFieldValue(RegistroM200.VL_TOT_CONT_CUM_PER, 800000000000.08);
        //10
        line.setFieldValue(RegistroM200.VL_RET_CUM, 900000000000.09);        
        //11
        line.setFieldValue(RegistroM200.VL_OUT_DED_CUM, 100000000000.01);
        //12
        line.setFieldValue(RegistroM200.VL_CONT_CUM_REC, 200000000000.02);
        //13
        line.setFieldValue(RegistroM200.VL_TOT_CONT_REC, 300000000000.03);
        
        
       StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "|M200|100000000000,01|200000000000,02|300000000000,03|400000000000,04|500000000000,05|600000000000,06|700000000000,07|800000000000,08|900000000000,09|100000000000,01|200000000000,02|300000000000,03|";
	assertEquals (expected, sb.toString());
    }
}
