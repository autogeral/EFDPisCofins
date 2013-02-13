package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 12:03:04
 * @author rafael.galvao
 */
public class RegistroM700Test {

    public RegistroM700Test() {
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
    public void RegistroM700Test() throws ParseException {
        RegistroM700 reg = new RegistroM700();
        LineModel line = reg.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("13022013");
        SimpleDateFormat sdf1 = new SimpleDateFormat("MMyyyy");
        Date data1 = sdf1.parse("022013");
        
        //02
        line.setFieldValue(RegistroM700.COD_CONT, "12");
        //03
        line.setFieldValue(RegistroM700.VL_CONT_APUR_DIFER, 100000000000.01);
        //04
        line.setFieldValue(RegistroM700.NAT_CRED_DESC, "12");
        //05
        line.setFieldValue(RegistroM700.VL_CRED_DESC_DIFER, 200000000000.02);
        //06
        line.setFieldValue(RegistroM700.VL_CONT_DIFER_ANT, 300000000000.03);
        //07
        line.setFieldValue(RegistroM700.PER_APUR, data1);
        //08
        line.setFieldValue(RegistroM700.DT_RECEB, data);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M700|12|100000000000,01|12|200000000000,02|300000000000,03|022013|13022013|";
//	assertEquals (expected, sb.toString());
    }
}
