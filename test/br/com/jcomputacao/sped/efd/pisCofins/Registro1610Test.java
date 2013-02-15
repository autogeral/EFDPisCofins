
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 26/11/2011 10:50:52
 * @author Douglas
 */
public class Registro1610Test{

    public Registro1610Test() {
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
    public void Registro1610Test() throws ParseException{
        Registro1610 reg = new Registro1610();
        LineModel line = reg.createModel();
        
        SimpleDateFormat sdf2 = new SimpleDateFormat ("ddMMyyyy");
        Date data2 = sdf2.parse ("15022013");

        //02
        line.setFieldValue(Registro1610.CNPJ, 12345678912345L);
        //03
        line.setFieldValue(Registro1610.CST_COFINS, 01);
        //04
        line.setFieldValue(Registro1610.COD_PART, "Código do participante (Campo 02 do Registro 0150)");
        //05
        line.setFieldValue(Registro1610.DT_OPER, data2);
        //06
        line.setFieldValue(Registro1610.VL_OPER, 100000000000.01);
        //07
        line.setFieldValue(Registro1610.VL_BC_COFINS, 100000000000.002);
        //08
        line.setFieldValue(Registro1610.ALIQ_COFINS, 100000000000.0003);
        //09
        line.setFieldValue(Registro1610.VL_COFINS, 100000000000.04);
        //10
        line.setFieldValue(Registro1610.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        //11
        line.setFieldValue(Registro1610.DESC_COMPL, "Descrição complementar do Documento/Operação");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1610|12345678912345|01|Código do participante (Campo 02 do Registro 0150)|15022013|100000000000,01|100000000000,002|100000000000,0003|100000000000,04|Código da conta analítica contábil debitada/creditada|Descrição complementar do Documento/Operação|";
//	assertEquals (expected, sb.toString());
    }

}