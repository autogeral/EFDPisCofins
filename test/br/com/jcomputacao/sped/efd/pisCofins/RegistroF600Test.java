
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;


/**
 * 24/11/2011 09:24:13
 * @author Douglas
 */
public class RegistroF600Test {


  public RegistroF600Test() {

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
    public void registroF600test() throws ParseException {

      RegistroF600 reg = new RegistroF600();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("11022013");

        //02
        line.setFieldValue(RegistroF600.IND_NAT_RET, 99);
        //03
        line.setFieldValue(RegistroF600.DT_RET, data);
        //04
        line.setFieldValue(RegistroF600.VL_BC_RET, 123.1234);
        //05
        line.setFieldValue(RegistroF600.VL_RET, 123.12);
        //06
        line.setFieldValue(RegistroF600.COD_REC, "abcd");
        //07
        line.setFieldValue(RegistroF600.IND_NAT_REC, 0);
        //08
        line.setFieldValue(RegistroF600.CNPJ, 12345678912345L);
        //09
        line.setFieldValue(RegistroF600.VL_RET_PIS, 123.12);
        //10
        line.setFieldValue(RegistroF600.VL_RET_COFINS, 123.12);
        //11
        line.setFieldValue(RegistroF600.IND_DEC, 0);


        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|F600|99|11022013|123,1234|123,12|abcd|0|12345678912345|123,12|123,12|0|";
//        assertEquals (expected, sb.toString());

    }
}