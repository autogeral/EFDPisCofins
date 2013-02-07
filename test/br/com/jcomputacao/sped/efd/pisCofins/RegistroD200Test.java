package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD200Test {

    public RegistroD200Test() {
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
    public void RegistroD200Test() throws ParseException {
        RegistroD200 reg = new RegistroD200();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");

        //02
        line.setFieldValue(RegistroD200.COD_MOD, "41");
        //03
        line.setFieldValue(RegistroD200.COD_SIT, 42L);
        //04
        line.setFieldValue(RegistroD200.SER, "abcd");
        //05
        line.setFieldValue(RegistroD200.SUB, "123");
        //06
        line.setFieldValue(RegistroD200.NUM_DOC_INI, 123456789L);
        //07
        line.setFieldValue(RegistroD200.NUM_DOC_FIN, 123456789L);
        //08
        line.setFieldValue(RegistroD200.CFOP, 1234L);
        //09
        line.setFieldValue(RegistroD200.DT_REF, data);
        //10
        line.setFieldValue(RegistroD200.VL_DOC, 873.12);
        //11
        line.setFieldValue(RegistroD200.VL_DESC, 122.43);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

        String expected = "|D200|41|42|abcd|123|123456789|123456789|1234|17121986|873,12|122,43|";
        assertEquals (expected, sb.toString());
    }
}
