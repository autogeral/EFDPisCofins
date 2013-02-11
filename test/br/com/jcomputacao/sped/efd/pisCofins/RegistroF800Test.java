
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 24/11/2011 11:38:15
 * @author Douglas
 */
public class RegistroF800Test {


  public RegistroF800Test() {

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
    public void registroF800test() throws ParseException {

      RegistroF800 reg = new RegistroF800();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf1 = new SimpleDateFormat ("ddMMyyyy");
        Date data1 = sdf1.parse("11022013");
        SimpleDateFormat sdf2 = new SimpleDateFormat ("MMyyyy");
        Date data2 = sdf2.parse("022013");
        //02
        line.setFieldValue(RegistroF800.IND_NAT_EVEN, 99);
        //03
        line.setFieldValue(RegistroF800.DT_EVEN, data1);
        //04
        line.setFieldValue(RegistroF800.CNPJ_SUCED, 12345678912345L);
        //05
        line.setFieldValue(RegistroF800.PA_CONT_CRED, data2);
        //06
        line.setFieldValue(RegistroF800.COD_CRED, 123);
        //07
        line.setFieldValue(RegistroF800.VL_CRED_PIS, 123.12);
        //08
        line.setFieldValue(RegistroF800.VL_CRED_COFINS, 123.12);
        //09
        line.setFieldValue(RegistroF800.PER_CRED_CIS, 123456.12);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|F800|99|11022013|12345678912345|022013|123|123,12|123,12|123456,12|";
//        assertEquals (expected, sb.toString());

    }
}
