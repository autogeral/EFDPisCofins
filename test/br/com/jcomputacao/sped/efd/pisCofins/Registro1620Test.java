
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 26/11/2011 11:07:33
 * @author Douglas
 */
public class Registro1620Test{

    public Registro1620Test() {
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
    public void Registro1620Test() throws ParseException{
        Registro1620 reg = new Registro1620();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat ("ddMMyyyy");
        Date data = sdf.parse ("15022013");
        
        //02
        line.setFieldValue(Registro1620.PER_APU_CRED, data);
        //03
        line.setFieldValue(Registro1620.ORIG_CRED, 01);
        //04
        line.setFieldValue(Registro1620.COD_CRED, 123);
        //05
        line.setFieldValue(Registro1620.VL_CRED, 100000000000.01);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1620|022013|01|123|100000000000,01|";
//	assertEquals (expected, sb.toString());
    }

}
