package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author John
 */
public class RegistroC380Test {

       
    public RegistroC380Test(){        
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
     * Test of getNome method, of class RegistroC380.
     */
    @Test
    public void RegistroC380Test() throws ParseException {
        RegistroC380 reg = new RegistroC380();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        
        //02
        line.setFieldValue(RegistroC380.COD_MOD, "02");
        //03
        line.setFieldValue(RegistroC380.DT_DOC_INI, data);
        //04
        line.setFieldValue(RegistroC380.DT_DOC_FIN, data);
        //05
        line.setFieldValue(RegistroC380.NUM_DOC_INI, 123456L);
        //06
        line.setFieldValue(RegistroC380.NUM_DOC_FIN, 123456L);
        //07
        line.setFieldValue(RegistroC380.VL_DOC, 78911.11);
        //08
        line.setFieldValue(RegistroC380.VL_DOC_CANC, 78911.11);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C380|02|17121986|17121986|123456|123456|78911,11|78911,11|";
//        assertEquals (expected, sb.toString());
    }
}
