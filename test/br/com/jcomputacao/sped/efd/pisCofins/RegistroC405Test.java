package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 19:45:52
 * @author John
 */
public class RegistroC405Test {

    public RegistroC405Test(){

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
     * Test of getNome method, of class RegistroC405.
     */
    @Test
    public void RegistroC405Test() throws ParseException {
                RegistroC405 reg = new RegistroC405();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        
        //02
        line.setFieldValue(RegistroC405.DT_DOC, data);
        //03
        line.setFieldValue(RegistroC405.CRO, 123l);
        //04
        line.setFieldValue(RegistroC405.CRZ, 123456l);
        //05
        line.setFieldValue(RegistroC405.NUM_COO_FIN, 123456l);
        //06
        line.setFieldValue(RegistroC405.GT_FIN, 5678911.11);
        //07
        line.setFieldValue(RegistroC405.VL_BRT, 2345678911.11);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        String expected = "|C405|17121986|123|123456|123456|5678911,11|2345678911,11|";
        assertEquals (expected, sb.toString());
    }
}
