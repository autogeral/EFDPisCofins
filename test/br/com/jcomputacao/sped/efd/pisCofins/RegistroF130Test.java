package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 21:30:02
 * @author Jonas
 */
public class RegistroF130Test {
    
     public RegistroF130Test() {
         
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
    public void registroF130test() throws ParseException {


        RegistroF130 reg = new RegistroF130();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("MMyyyy");
        
        Date data = sdf.parse("022013");
        
        //03
        line.setFieldValue(RegistroF130.IDENT_BEM_IMOB, 99);
        //04
        line.setFieldValue(RegistroF130.IND_ORIG_CRED, "1"); 
        //05
        line.setFieldValue(RegistroF130.IND_UTIL_BEM_IMOB, 3);
        //06
        line.setFieldValue(RegistroF130.MES_OPER_AQUIS, data);
        //07
        line.setFieldValue(RegistroF130.VL_OPER_AQUIS, 123456.12); 
        //08
        line.setFieldValue(RegistroF130.PARC_OPER_NAO_BC_CRED, 123456.12);
        //09
        line.setFieldValue(RegistroF130.VL_BC_CRED, 123456.12); 
        //10
        line.setFieldValue(RegistroF130.IND_NR_PARC, 2);
        //11
        line.setFieldValue(RegistroF130.CST_PIS, 24);  
        //12
        line.setFieldValue(RegistroF130.VL_BC_PIS, 123456.12);  
        //13
        line.setFieldValue(RegistroF130.ALIQ_PIS, 123456.1234);  
        //14
        line.setFieldValue(RegistroF130.VL_PIS, 123456.12);  
        //15
        line.setFieldValue(RegistroF130.CST_COFINS, 57);     
        //16
        line.setFieldValue(RegistroF130.VL_BC_COFINS, 123456.12); 
        //17
        line.setFieldValue(RegistroF130.ALIQ_COFINS, 123456.1234); 
        //18
        line.setFieldValue(RegistroF130.VL_COFINS, 123456.12);  
        //19
        line.setFieldValue(RegistroF130.COD_CTA, "Código da conta analítica contábil debitada/creditada"); 
        line.setFieldValue(RegistroF130.COD_CCUS, "Código do Centro de Custos"); 
        line.setFieldValue(RegistroF130.DESC_BEM_IMOB, "Descrição complementar do bem ou grupo de bens, com crédito apurado com base no valor de aquisição."); 
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|F130|10|99|1|3|022013|123456,12|123456,12|123456,12|2|24|123456,12|123456,1234|123456,12|57|123456,12|123456,1234|123456,12|Código da conta analítica contábil debitada/creditada|Código do Centro de Custos|Descrição complementar do bem ou grupo de bens, com crédito apurado com base no valor de aquisição.|";
//        assertEquals (expected, sb.toString());       
        
    }
    
}
