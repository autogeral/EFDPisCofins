
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 26/11/2011 11:37:15
 * @author Douglas
 */
public class Registro1800Test{

    public Registro1800Test() {
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
    public void Registro1800Test() throws ParseException{
        Registro1800 reg = new Registro1800();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat ("ddMMyyyy");
        Date data = sdf.parse ("15022013");
        //02
        line.setFieldValue(Registro1800.INC_IMOB, "Empreendimento objeto de Incorporação Imobiliária, optantepelo RET.");
        //03
        line.setFieldValue(Registro1800.REC_RECEB_RET, 100000000000.01);
        //04
        line.setFieldValue(Registro1800.REC_FIN_RET, 100000000000.02);
        //05
        line.setFieldValue(Registro1800.BC_RET, 100000000000.03);
        //06
        line.setFieldValue(Registro1800.ALIQ_RET, 100000.04);
        //70
        line.setFieldValue(Registro1800.VL_REC_UNI, 100000000000.05);
        //08
        line.setFieldValue(Registro1800.DT_REC_UNI, data);
        //09
        line.setFieldValue(Registro1800.COD_REC, "CDRC");


        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1800|Empreendimento objeto de Incorporação Imobiliária, optantepelo RET.|100000000000,01|100000000000,02|100000000000,03|100000,04|100000000000,05|15022013|CDRC|";
//	assertEquals (expected, sb.toString());
    }

}
