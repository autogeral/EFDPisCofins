package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 10/11/2011 19:57:36
 * @author Jonas
 */
public class RegistroA170Test {

    public RegistroA170Test() {
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
    public String linhaRegistroA170Test() throws ParseException {

        RegistroA170 reg = new RegistroA170();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroA170.NUM_ITEM, 2132);
        //03
        line.setFieldValue(RegistroA170.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //04
        line.setFieldValue(RegistroA170.DESCR_COMPL, "Descrição complementar do item como adotado no documento fiscal");
        //05
        line.setFieldValue(RegistroA170.VL_ITEM, 2134.12);
        //06
        line.setFieldValue(RegistroA170.VL_DESC, 3.12);
        //07
        line.setFieldValue(RegistroA170.NAT_BC_CRED, "21");
        //08
        line.setFieldValue(RegistroA170.IND_ORIG_CRED, "1");
        //09
        line.setFieldValue(RegistroA170.CST_PIS, 49);
        //10
        line.setFieldValue(RegistroA170.VL_BC_PIS, 4564.54);
        //11
        line.setFieldValue(RegistroA170.ALIQ_PIS, 4564.54);
        //12
        line.setFieldValue(RegistroA170.VL_PIS, 344.12);
        //13
        line.setFieldValue(RegistroA170.CST_COFINS, 86);
        //14
        line.setFieldValue(RegistroA170.VL_BC_COFINS, 32.12);
        //15
        line.setFieldValue(RegistroA170.ALIQ_COFINS, 65428.32);
        //16
        line.setFieldValue(RegistroA170.VL_COFINS, 545464.98);
        //17
        line.setFieldValue(RegistroA170.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        //18
        line.setFieldValue(RegistroA170.COD_CCUS, "Código do centro de custos");

        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|A170|2132|Código do item (campo 02 do Registro 0200)|Descrição complementar do item como adotado no documento fiscal|2134,12|3,12|21|1|49|4564,54|4564,54|344,12|86|32,12|65428,32|545464,98|Código da conta analítica contábil debitada/creditada|Código do centro de custos|";
//        assertEquals (expected, sb.toString());
        return sb.toString();
    }
    
}
