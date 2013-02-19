package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.*;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Jennifer
 */
public class RegistroM100Test {
    public RegistroM100Test(){
    
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
    public void RegistroM100Test(){
        RegistroM100 reg = new RegistroM100();
        LineModel line = reg.createModel();
        
        double campo08 = 100000000000.02;
        double campo09 = 100000000000.02;
        double campo10 = 200.03;
        double campo11 = 300.04;
        double campo12;
        double campo14 = 0;
        double campo15;
        
        //02
        line.setFieldValue(RegistroM100.COD_CRED, "109");
        //03
        line.setFieldValue(RegistroM100.IND_CRED_ORI, 0);
        //04
        line.setFieldValue(RegistroM100.VL_BC_PIS, null);
        //05
        line.setFieldValue(RegistroM100.ALIQ_PIS, null);
        //06
        line.setFieldValue(RegistroM100.QUANT_BC_PIS, null);        
        //07 
        line.setFieldValue(RegistroM100.ALIQ_PIS_QUANT, null);       
        //08
        //Somatório dos campos VL_CRED_PIS_DESC do registro F205 e VL_CRED_PIS_UTIL do registro F210
        line.setFieldValue(RegistroM100.VL_CRED, campo08);        
        //09
        line.setFieldValue(RegistroM100.VL_AJUS_ACRES, campo09);        
        //10 
        line.setFieldValue(RegistroM100.VL_AJUS_REDUC, campo10);        
        //11 
        /**O preenchimento deste campo obriga o preenchimento do registro M230, 
         * devendo o somatório dos respectivos campos dos registros M100 ser 
         * igual ao somatório dos campos VL_CRED_DIF dos registros M230, 
         * para o mesmo COD_CRED
         * O valor deste campo não pode ser maior que 
         * VL_CRED + VL_AJUS_ACRES - VL_AJUS_REDUC
         */
        line.setFieldValue(RegistroM100.VL_CRED_DIF, campo11);       
        //12
        campo12 = campo08+campo09-campo10-campo11;
        line.setFieldValue(RegistroM100.VL_CRED_DISP, campo12);
        //13
        line.setFieldValue(RegistroM100.IND_DESC_CRED, "0");
        //14
        line.setFieldValue(RegistroM100.VL_CRED_DESC, campo14);
        //15
        campo15 = campo12-campo14;
        line.setFieldValue(RegistroM100.SLD_CRED, campo15);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
        String expected = "|M100|109|0|||||100000000000,02|100000000000,02|200,03|300,04|199999999499,97|0|0,00|199999999499,97|";
        //assertEquals (expected, sb.toString());
    }

}
