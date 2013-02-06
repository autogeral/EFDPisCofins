package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Feb 5, 2013 3:46:37 PM
 * @author Jennifer
 */
public class RegistroC800Test {
    public RegistroC800Test() {
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
    public void RegistroC800Test () throws ParseException{
        RegistroC800 reg = new RegistroC800();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data  = sdf.parse("14021986");
        
        //02
        line.setFieldValue(RegistroC800.COD_MOD, "12");
        //03
        line.setFieldValue(RegistroC800.COD_SIT, 13);
        //04
        line.setFieldValue(RegistroC800.NUM_CFE, 123456789);
        //05
        line.setFieldValue(RegistroC800.DT_DOC, data);
        //06
        line.setFieldValue(RegistroC800.VL_CFE, 1234.12);
        //07
        line.setFieldValue(RegistroC800.VL_PIS, 56789.12);
        //08
        line.setFieldValue(RegistroC800.VL_COFINS, 1234.12);
        //09
        line.setFieldValue(RegistroC800.CNPJ_CPF, 33763698876L);
        //10
        line.setFieldValue(RegistroC800.NR_SAT, 123456789L);
        //11
        line.setFieldValue(RegistroC800.CHV_CFE, "12345678901234567890123456789012345678901234");
        //12
        line.setFieldValue(RegistroC800.VL_DESC, 0.0);
        //13
        line.setFieldValue(RegistroC800.VL_MERC, 1.99);
        //14
        line.setFieldValue(RegistroC800.VL_OUT_DA, 2.99);
        //15
        line.setFieldValue(RegistroC800.VL_ICMS, 3.99);
        //16
        line.setFieldValue(RegistroC800.VL_PIS_ST, 4.99);
        //17
        line.setFieldValue(RegistroC800.VL_COFINS_ST, 5.99);
        
        StringBuffer sb = line.getRepresentation();
        System.out.println(sb);
//        String expected = "|C800|12|13|123456789|14021986|1234,12|56789,12|1234,12|33763698876|123456789|12345678901234567890123456789012345678901234|0,00|1,99|2,99|3,99|4,99|5,99|";
//        assertEquals (expected, sb.toString());
    }

}
