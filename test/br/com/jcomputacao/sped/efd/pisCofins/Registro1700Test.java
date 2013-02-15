
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 26/11/2011 11:24:13
 * @author Douglas
 */
public class Registro1700Test{

    public Registro1700Test() {
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
    public void Registro1700Test() throws ParseException{
        Registro1700 reg = new Registro1700();
        LineModel line = reg.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat ("MMyyyy");
        Date data = sdf.parse ("022013");
        
        //02
        line.setFieldValue(Registro1700.IND_NAT_RET, 99);
        //03
        line.setFieldValue(Registro1700.PR_REC_RET, data);
        //04
        line.setFieldValue(Registro1700.VL_RET_APU, 100000000000.01);
        //05
        line.setFieldValue(Registro1700.VL_RET_DED, 100000000000.02);
        //06
        line.setFieldValue(Registro1700.VL_RET_PER, 100000000000.03);
        //07
        line.setFieldValue(Registro1700.VL_RET_DCOMP, 100000000000.04);
        //08
        line.setFieldValue(Registro1700.SLD_RET, 100000000000.05);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1700|99|022013|100000000000,01|100000000000,02|100000000000,03|100000000000,04|100000000000,05|";
//	assertEquals (expected, sb.toString());
    }

}
