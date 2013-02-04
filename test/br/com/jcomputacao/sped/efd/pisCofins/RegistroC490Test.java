package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 20:31:44
 * @author John
 */
public class RegistroC490Test {

    public RegistroC490Test() {

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

    /**
     * Test of getNome method, of class RegistroC490.
     */
    @Test
    public void RegistroC490Test() throws ParseException {
        RegistroC490 reg = new RegistroC490();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("04022013");
        
        //02
        line.setFieldValue(RegistroC490.DT_DOC_INI, data);
        //03
        line.setFieldValue(RegistroC490.DT_DOC_FIN, data);
        //04
        line.setFieldValue(RegistroC490.COD_MOD, "12");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|C490|04022013|04022013|12|";
//        assertEquals (expected, sb.toString());
    }
}
