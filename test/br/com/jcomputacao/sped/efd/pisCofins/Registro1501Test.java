
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 26/11/2011 09:14:31
 * @author Douglas
 */
public class Registro1501Test{

    public Registro1501Test() {
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
    public void Registro1501Test() throws ParseException{
        Registro1501 reg = new Registro1501();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat ("ddMMyyyy");
        Date data = sdf.parse("15022013");

            
        SimpleDateFormat sdf2 = new SimpleDateFormat ("MMyyyy");
        Date data2 = sdf2.parse ("022013");
        //02
        line.setFieldValue(Registro1501.COD_PART, "Código do participante (Campo 02 do Registro 0150)");
        //03
        line.setFieldValue(Registro1501.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //04
        line.setFieldValue(Registro1501.COD_MOD, "CM");
        //05
        line.setFieldValue(Registro1501.SER, "0001");
        //06
        line.setFieldValue(Registro1501.SUB_SER, "001");
        //07
        line.setFieldValue(Registro1501.NUM_DOC, 123456789L);
        //08
        line.setFieldValue(Registro1501.DT_OPER, data);
        //09
        line.setFieldValue(Registro1501.CHV_NFE, "11111111112222222222333333333344444444445555");
        //10
        line.setFieldValue(Registro1501.VL_OPER, 100000000000.01);
        //11
        line.setFieldValue(Registro1501.CFOP, 1234);
        //12
        line.setFieldValue(Registro1501.NAT_BC_CRED, "50");
        //13
        line.setFieldValue(Registro1501.IND_ORIG_CRED, "1");
        //14
        line.setFieldValue(Registro1501.CST_COFINS, 55);
        //15
        line.setFieldValue(Registro1501.VL_BC_COFINS, 200000000000.002);
        //16
        line.setFieldValue(Registro1501.ALIQ_COFINS, 300000000000.0003);
        //17
        line.setFieldValue(Registro1501.VL_COFINS, 400000000000.04);
        //18
        line.setFieldValue(Registro1501.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        //19
        line.setFieldValue(Registro1501.COD_CCUS, "Código do Centro de Custos");
        //20
        line.setFieldValue(Registro1501.DESC_COMPL, "Descrição complementar do Documento/Operação");
        //21
        line.setFieldValue(Registro1501.PER_ESCRIT, data2);
        //22
        line.setFieldValue(Registro1501.CNPJ, 12345678912345L);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1501|Código do participante (Campo 02 do Registro 0150)|Código do item (campo 02 do Registro 0200)|CM|0001|001|123456789|15022013|11111111112222222222333333333344444444445555|100000000000,01|1234|50|1|55|200000000000,002|300000000000,0003|400000000000,04|Código da conta analítica contábil debitada/creditada|Código do Centro de Custos|Descrição complementar do Documento/Operação|022013|12345678912345|";
//	assertEquals (expected, sb.toString());
    }

}