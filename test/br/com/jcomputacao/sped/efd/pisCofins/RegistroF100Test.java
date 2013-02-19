package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 10/11/2011 22:08:04
 * @author Jonas
 */
public class RegistroF100Test {

    public RegistroF100Test() {
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
    public void registroF100test() throws ParseException {


        RegistroF100 reg = new RegistroF100();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("08022013");

        //PIS
        double campo08 = 12345678.1234;
        double campo09 = 1.6500;
        double campo10;
        //COFINS
        double campo12 = 12345678.1234;
        double campo13 = 7.6000;
        double campo14;
        //02
        line.setFieldValue(RegistroF100.IND_OPER, "1");
        //03
        line.setFieldValue(RegistroF100.COD_PART,"(Campo 02 do Registro 0150)");
        //04
        line.setFieldValue(RegistroF100.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //05
        line.setFieldValue(RegistroF100.DT_ITEM, data);
        //06
        line.setFieldValue(RegistroF100.VL_OPER, 12345678.12);
        //07
        line.setFieldValue(RegistroF100.CST_PIS, 12);
        //08
        line.setFieldValue(RegistroF100.VL_BC_PIS, campo08);
        //09
        line.setFieldValue(RegistroF100.ALIQ_PIS, campo09);
        //10
        campo10 = campo08*campo09/100;
        line.setFieldValue(RegistroF100.VL_PIS, campo10);
        //11
        line.setFieldValue(RegistroF100.CST_COFINS, 12);
        //12
        line.setFieldValue(RegistroF100.VL_BC_COFINS, campo12);
        //13
        line.setFieldValue(RegistroF100.ALIQ_COFINS, campo13);
        //14
        campo14 = campo12*campo13/100;
        line.setFieldValue(RegistroF100.VL_COFINS, campo14);
        //15
        line.setFieldValue(RegistroF100.NAT_BC_CRED, "12");
        //16
        line.setFieldValue(RegistroF100.IND_ORIG_CRED, "0");
        //17
        line.setFieldValue(RegistroF100.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        //18
        line.setFieldValue(RegistroF100.COD_CCUS, "Código do Centro de Custos");
        //19
        line.setFieldValue(RegistroF100.DESC_DOC_OPER, "Descrição do Documento/Operação");

        StringBuffer sb = line.getRepresentation();
                System.out.print(sb);

//        String expected = "|F100|1|(Campo 02 do Registro 0150)|Código do item (campo 02 do Registro 0200)|08022013|12345678,12|12|12345678,1234|1,6500|203703,69|12|12345678,1234|7,6000|938271,54|12|0|Código da conta analítica contábil debitada/creditada|Código do Centro de Custos|Descrição do Documento/Operação|";
//        assertEquals (expected, sb.toString());
    }
}
