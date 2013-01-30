package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 09/11/2011 19:53:17
 * @author Jonas
 */
public class RegistroA100Test {

    public RegistroA100Test() {
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
    public String linhaRegistroA100Test() throws ParseException {
        RegistroA100 reg = new RegistroA100();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("10101987");

        //02
        line.setFieldValue(RegistroA100.IND_OPER, "0");
        //03
        line.setFieldValue(RegistroA100.IND_EMIT, "1");
        //04
        line.setFieldValue(RegistroA100.COD_PART, "Código do participante (campo 02 do Registro 0150)");
        //05
        line.setFieldValue(RegistroA100.COD_SIT, 0);
        //06
        line.setFieldValue(RegistroA100.SER, "Série do documento");
        //07
        line.setFieldValue(RegistroA100.SUB, "Subsérie do doc");
        //08
        line.setFieldValue(RegistroA100.NUM_DOC, "Número do documento fiscal ou documento internacional");
        //09
        line.setFieldValue(RegistroA100.CHV_NFSE, "Chave/Código de Verificação da nota fiscal de serv elet");
        //10
        line.setFieldValue(RegistroA100.DT_DOC, data );
        //11
        line.setFieldValue(RegistroA100.DT_EXE_SERV, data);
        //12
        line.setFieldValue(RegistroA100.VL_DOC, 100.02);
        //13
        line.setFieldValue(RegistroA100.IND_PGTO, "1");
        //14
        line.setFieldValue(RegistroA100.VL_DESC, 99.85);
        //15
        line.setFieldValue(RegistroA100.VL_BC_PIS, 65284.15);
        //16
        line.setFieldValue(RegistroA100.VL_PIS, 212.12);
        //17
        line.setFieldValue(RegistroA100.VL_BC_COFINS, 3235.10);
        //18
        line.setFieldValue(RegistroA100.VL_COFINS, 2.05);
        //19
        line.setFieldValue(RegistroA100.VL_PIS_RET, 98754.02);
        //20
        line.setFieldValue(RegistroA100.VL_COFINS_RET, 9856.56);
        //21
        line.setFieldValue(RegistroA100.VL_ISS, 985.75);

        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|A100|0|1|Código do participante (campo 02 do Registro 0150)|00|Série do documento|Subsérie do doc|Número do documento fiscal ou documento internacional|Chave/Código de Verificação da nota fiscal de serv elet|10101987|10101987|100,02|1|99,85|65284,15|212,12|3235,10|2,05|98754,02|9856,56|985,75|";
//        assertEquals (expected, sb.toString());
        return sb.toString();
    }
    
}
