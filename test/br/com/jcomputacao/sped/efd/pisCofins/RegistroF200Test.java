
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 18/11/2011 11:48:53
 * @author Douglas
 */
public class RegistroF200Test {


  public RegistroF200Test() {

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
    public void registroF200test() throws ParseException {


        RegistroF200 reg = new RegistroF200();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("08022013");
        
        double campo09 = 53000.00;
        double campo10 = 11000.00;
        double campo11 = 2000.00;
        double campo20;
        
        //02
        line.setFieldValue(RegistroF200.IND_OPER, 02);
        //03
        line.setFieldValue(RegistroF200.UNID_IMOB, 5);
        //04
        line.setFieldValue(RegistroF200.IDENT_EMP, "Identificação/Nome do Empreendimento");
        //05
        line.setFieldValue(RegistroF200.DESC_UNID_IMOB, "Descrição resumida da unidade imobiliária vendida");
        //06
        line.setFieldValue(RegistroF200.NUM_CONT, "Número do Contrato/Documento que formaliza a Venda da Unidade Imobiliária");
        //07
        line.setFieldValue(RegistroF200.CPF_CNPJ_ADQU, "12345678911111");
        //08
        line.setFieldValue(RegistroF200.DT_OPER, data);
        //09
        line.setFieldValue(RegistroF200.VL_TOT_VEND, campo09);
        //10
        line.setFieldValue(RegistroF200.VL_REC_ACUM, campo10);
        //11
        line.setFieldValue(RegistroF200.VL_TOT_REC, campo11);
        //12
        line.setFieldValue(RegistroF200.CST_PIS, 12);
        //13
        line.setFieldValue(RegistroF200.VL_BC_PIS, 1.99);
        //14
        line.setFieldValue(RegistroF200.ALIQ_PIS, 123456.1234);
        //15
        line.setFieldValue(RegistroF200.VL_PIS, 123456.12);
        //16
        line.setFieldValue(RegistroF200.CST_COFINS, 13);
        //17
        line.setFieldValue(RegistroF200.VL_BC_COFINS, 123456.12);
        //18
        line.setFieldValue(RegistroF200.ALIQ_COFINS, 123456.1234);
        //19
        line.setFieldValue(RegistroF200.VL_COFINS, 123456.12);
        //20
        campo20 = (campo10+campo11)/campo09;
        line.setFieldValue(RegistroF200.PERC_REC_RECEB, campo20);
        //21
        line.setFieldValue(RegistroF200.IND_NAT_EMP, 1);
        //21
        line.setFieldValue(RegistroF200.INF_COMP, "Informações Complementares");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|F200|04|05|Identificação/Nome do Empreendimento|Descrição resumida da unidade imobiliária vendida|Número do Contrato/Documento que formaliza a Venda da Unidade Imobiliária|12345678911111|08022013|53000,00|11000,00|2000,00|12|1,99|123456,1234|123456,12|13|123456,12|123456,1234|123456,12|0,25|1|Informações Complementares|";
//        assertEquals (expected, sb.toString());

    }
}
