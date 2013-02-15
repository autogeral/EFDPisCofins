
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 26/11/2011 10:25:56
 * @author Douglas
 */
public class Registro1600Test{

    public Registro1600Test() {
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
    public void Registro1600Test() throws ParseException{
        Registro1600 reg = new Registro1600();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat ("MMyyyy");
        Date data = sdf.parse ("022013");
        SimpleDateFormat sdf2 = new SimpleDateFormat ("ddMMyyyy");
        Date data2 = sdf2.parse ("15022013");
        
        //02
        line.setFieldValue(Registro1600.PER_APUR_ANT, data);
        //03
        line.setFieldValue(Registro1600.NAT_CONT_REC, "01");
        //04
        line.setFieldValue(Registro1600.VL_CONT_APUR, 100000000000.01);
        //05
        line.setFieldValue(Registro1600.VL_CRED_COFINS_DESC, 100000000000.02);
        //06
        line.setFieldValue(Registro1600.VL_CONT_DEV, 100000000000.03);
        //07
        line.setFieldValue(Registro1600.VL_OUT_DED, 100000000000.04);
        //08
        line.setFieldValue(Registro1600.VL_CONT_EXT, 100000000000.05);
        //09
        line.setFieldValue(Registro1600.VL_MUL, 100000000000.06);        
        //10
        line.setFieldValue(Registro1600.VL_JUR, 100000000000.07);
        //11
        line.setFieldValue(Registro1600.DT_RECOL, data2);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1600|022013|01|100000000000,01|100000000000,02|100000000000,03|100000000000,04|100000000000,05|100000000000,06|100000000000,07|15022013|";
//        assertEquals (expected, sb.toString());
    }

}