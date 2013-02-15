
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 25/11/2011 11:43:00
 * @author Douglas
 */
public class Registro1500Test{

    public Registro1500Test() {
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
    public void Registro1500Test() throws ParseException{
        Registro1500 reg = new Registro1500();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();
        
        SimpleDateFormat sdf = new SimpleDateFormat ("MMyyyy");
        Date data = sdf.parse ("022013");

        //02
        line.setFieldValue(Registro1500.PER_APU_CRED, data);
        //03
        line.setFieldValue(Registro1500.ORIG_CRED, 02);
        //04
        line.setFieldValue(Registro1500.CNPJ_SUC, 12345678912345L);
        //05
        line.setFieldValue(Registro1500.COD_CRED, 001);
        //06
        line.setFieldValue(Registro1500.VL_CRED_APU, 100000000000.01);
        //07
        line.setFieldValue(Registro1500.VL_CRED_EXT_APU, 200000000000.02);
        //08
        line.setFieldValue(Registro1500.VL_TOT_CRED_APU, 300000000000.03);
        //09
        line.setFieldValue(Registro1500.VL_CRED_DESC_PA_ANT, 400000000000.04);
        //10
        line.setFieldValue(Registro1500.VL_CRED_PER_PA_ANT, 500000000000.05);
        //11
        line.setFieldValue(Registro1500.VL_CRED_DCOMP_PA_ANT, 600000000000.06);
        //12
        line.setFieldValue(Registro1500.SD_CRED_DISP_EFD, 700000000000.07);
        //13
        line.setFieldValue(Registro1500.VL_CRED_DESC_EFD, 800000000000.08);
        //14
        line.setFieldValue(Registro1500.VL_CRED_PER_EFD, 900000000000.09);
        //15
        line.setFieldValue(Registro1500.VL_CRED_DCOMP_EFD, 100000000000.01);
        //16
        line.setFieldValue(Registro1500.VL_CRED_TRANS, 200000000000.02);
        //17
        line.setFieldValue(Registro1500.VL_CRED_OUT, 300000000000.03);
        //18
        line.setFieldValue(Registro1500.SLD_CRED_FIM, 400000000000.04);
        

        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//
//	String expected = "|1500|022013|02|12345678912345|001|100000000000,01|200000000000,02|300000000000,03|400000000000,04|500000000000,05|600000000000,06|700000000000,07|800000000000,08|900000000000,09|100000000000,01|200000000000,02|300000000000,03|400000000000,04|";
//	assertEquals (expected, sb.toString());
    }

}