package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * Feb 6, 2013 4:16:32 PM
 * @author Jennifer
 */
public class RegistroC870Test {
    public RegistroC870Test(){
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
    public void RegistroC870Test(){
        RegistroC870 reg = new RegistroC870();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC870.CFOP, 1234);
        //03
        line.setFieldValue(RegistroC870.VL_ITEM, 123456.12);
        //04
        line.setFieldValue(RegistroC870.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //05
        line.setFieldValue(RegistroC870.CST_PIS, 12);
        //06
        line.setFieldValue(RegistroC870.VL_BC_PIS, 123456.12);
        //07
        line.setFieldValue(RegistroC870.ALIQ_PIS, 123456.1212);
        //08
        line.setFieldValue(RegistroC870.VL_PIS, 123456.12);
        //09
        line.setFieldValue(RegistroC870.CST_COFINS, 12);
        //10
        line.setFieldValue(RegistroC870.VL_BC_COFINS, 123456.12);
        //11
        line.setFieldValue(RegistroC870.ALIQ_COFINS, 123456.1212);
        //12
        line.setFieldValue(RegistroC870.VL_COFINS, 123456.12);
        //13
        line.setFieldValue(RegistroC870.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C870|1234|123456,12|Código do item (campo 02 do Registro 0200)|12|123456,12|123456,1212|123456,12|12|123456,12|123456,1212|123456,12|Código da conta analítica contábil debitada/creditada|";
//        assertEquals (expected, sb.toString());
    }
}
