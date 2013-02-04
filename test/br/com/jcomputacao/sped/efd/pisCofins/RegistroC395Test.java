package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 10/11/2011 19:00:47
 * @author John
 */
public class RegistroC395Test {

    public RegistroC395Test(){
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
     * Test of getNome method, of class RegistroC395.
     */
    @Test
    public void RegistroC395Test() throws ParseException {
         RegistroC395 reg = new RegistroC395();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");

        //02
        line.setFieldValue(RegistroC395.COD_MOD, "2D");
        //03
        line.setFieldValue(RegistroC395.COD_PART, "(campo 02 do Registro 0150)");
        //04
        line.setFieldValue(RegistroC395.SER, "123");
        //05
        line.setFieldValue(RegistroC395.SUB_SER, "DFG");
        //06
        line.setFieldValue(RegistroC395.NUM_DOC, "ABCASD");
        //07
        line.setFieldValue(RegistroC395.DT_DOC, data);
        //08
        line.setFieldValue(RegistroC395.VL_DOC, 67890.99);
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|C395|2D|(campo 02 do Registro 0150)|123|DFG|ABCASD|17121986|67890,99|";
//        assertEquals(expected, sb.toString());
    }
}
