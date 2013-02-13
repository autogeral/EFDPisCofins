package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 19:48:23
 * @author rafael.galvao
 */
public class RegistroM610Test {
    
    public RegistroM610Test() {
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
     * Test of getNome method, of class RegistroM610.
     */
    @Test
    public void RegistroM610Test(){
        RegistroM610 rm = new RegistroM610();
        LineModel line = rm.createModel();
        
        //02
        line.setFieldValue(RegistroM610.COD_CONT, "2");
        //03
        line.setFieldValue(RegistroM610.VL_REC_BRT, 200000000000.02);
        //04
        line.setFieldValue(RegistroM610.VL_BC_CONT, 300000000000.03);
        //05
        line.setFieldValue(RegistroM610.ALIQ_COFINS, 40000000.0004);
        //06
        line.setFieldValue(RegistroM610.QUANT_BC_COFINS, 500000000000.005);
        //07
        line.setFieldValue(RegistroM610.ALIQ_COFINS_QUANT, 600000000000.0006);
        //08
        line.setFieldValue(RegistroM610.VL_CONT_APUR, 700000000000.07);
        //09
        line.setFieldValue(RegistroM610.VL_AJUS_ACRES, 800000000000.08);
        //10
        line.setFieldValue(RegistroM610.VL_AJUS_REDUC, 900000000000.09);
        //11
        line.setFieldValue(RegistroM610.VL_CONT_DIFER, 100000000000.01);
        //12
        line.setFieldValue(RegistroM610.VL_CONT_DIFER_ANT, 200000000000.02);
        //13
        line.setFieldValue(RegistroM610.VL_CONT_PER, 300000000000.03);
     
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M610|2|200000000000,02|300000000000,03|40000000,0004|500000000000,005|600000000000,0006|700000000000,07|800000000000,08|900000000000,09|100000000000,01|200000000000,02|300000000000,03|";
//	assertEquals (expected, sb.toString());
    }
}
