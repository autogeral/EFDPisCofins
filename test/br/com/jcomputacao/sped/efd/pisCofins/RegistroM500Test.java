package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 17/11/2011 20:41:06
 * @author rafael.galvao
 */
public class RegistroM500Test {
    
    public RegistroM500Test() {
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
     * Test of getNome method, of class RegistroM500.
     */
    @Test
    public void RegistroM500Test() {
        RegistroM500 reg = new RegistroM500();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroM500.COD_CRED, "CRE");
        //03
        line.setFieldValue(RegistroM500.IND_CRED_ORI, 0);
        //04
        line.setFieldValue(RegistroM500.VL_BC_COFINS, 100000000000.01);
        //05
        line.setFieldValue(RegistroM500.ALIQ_COFINS, 20000000.0002);
        //06
        line.setFieldValue(RegistroM500.QUANT_BC_COFINS, 300000000000.003);
        //07
        line.setFieldValue(RegistroM500.ALIQ_COFINS_QUANT, 400000000000.0004);
        //08
        line.setFieldValue(RegistroM500.VL_CRED, 500000000000.05);
        //09
        line.setFieldValue(RegistroM500.VL_AJUS_ACRES, 600000000000.06);
        //10
        line.setFieldValue(RegistroM500.VL_AJUS_REDUC, 700000000000.07);
        //11
        line.setFieldValue(RegistroM500.VL_CRED_DIFER, 800000000000.08);
        //12
        line.setFieldValue(RegistroM500.VL_CRED_DISP, 900000000000.09);
        //13
        line.setFieldValue(RegistroM500.IND_DESC_CRED, "1");
        //14
        line.setFieldValue(RegistroM500.VL_CRED_DESC, 100000000000.01);
        
        line.setFieldValue(RegistroM500.SLD_CRED, 200000000000.02);
     
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M500|CRE|0|100000000000,01|20000000,0002|300000000000,003|400000000000,0004|500000000000,05|600000000000,06|700000000000,07|800000000000,08|900000000000,09|1|100000000000,01|200000000000,02|";
//	assertEquals (expected, sb.toString());
    }
}
