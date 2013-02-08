package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 20:23:56
 * @author Jonas
 */
public class RegistroF120Test {
    
     public RegistroF120Test() {
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
    public void registroF120test() throws ParseException {    
    
        RegistroF120 reg = new RegistroF120();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroF120.NAT_BC_CREDN, "11" );
        //03
        line.setFieldValue(RegistroF120.IDENT_BEM_IMOB, 6);
        //04
        line.setFieldValue(RegistroF120.IND_ORIG_CRED, "0");
        //05
        line.setFieldValue(RegistroF120.IND_UTIL_BEM_IMOB, 2); 
        //06
        line.setFieldValue(RegistroF120.VL_OPER_DEP, 123456.12);
        //07
        line.setFieldValue(RegistroF120.PARC_OPER_NAO_BC_CRED, 123456.12); 
        //08
        line.setFieldValue(RegistroF120.CST_PIS, 23);
        //09
        line.setFieldValue(RegistroF120.VL_BC_PIS, 123456.12);
        //10
        line.setFieldValue(RegistroF120.ALIQ_PIS, 123456.1234);
        //11
        line.setFieldValue(RegistroF120.VL_PIS, 123456.12);
        //12
        line.setFieldValue(RegistroF120.CST_COFINS, 12);
        //13
        line.setFieldValue(RegistroF120.VL_BC_COFINS, 123456.12);
        //14
        line.setFieldValue(RegistroF120.ALIQ_COFINS, 123456.1234);
        //15
        line.setFieldValue(RegistroF120.VL_COFINS, 123456.12);
        //16
        line.setFieldValue(RegistroF120.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        //17
        line.setFieldValue(RegistroF120.COD_CCUS, "Código do Centro de Custos");
        //18
        line.setFieldValue(RegistroF120.DESC_BEM_IMOB, "Descrição complementar do bem ou grupo de bens, com crédito apurado com base nos encargos de depreciação ou amortização.");
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|F120|11|06|0|2|123456,12|123456,12|23|123456,12|123456,1234|123456,12|12|123456,12|123456,1234|123456,12|Código da conta analítica contábil debitada/creditada|Código do Centro de Custos|Descrição complementar do bem ou grupo de bens, com crédito apurado com base nos encargos de depreciação ou amortização.|";
//        assertEquals (expected, sb.toString());
    }
}
