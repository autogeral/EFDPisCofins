package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 12:38:11
 * @author rafael.galvao
 */
public class RegistroM620Test extends Randomize {

    public RegistroM620Test() {
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
     * Test of getNome method, of class RegistroM620.
     */
    @Test
    public void RegistroM620Test() throws ParseException {
        RegistroM620 reg = new RegistroM620();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("13022013");
        
        //02
        line.setFieldValue(RegistroM620.IND_AJ, "0");
        //03
        line.setFieldValue(RegistroM620.VL_AJ, 100000000000.01);
        //04
        line.setFieldValue(RegistroM620.COD_AJ, "12");
        //05
        line.setFieldValue(RegistroM620.NUM_DOC, "Número do processo, documento ou ato concessório ao qual o ajuste está vinculado, se houver.");
        //06
        line.setFieldValue(RegistroM620.DESCR_AJ, "Descrição resumida do ajuste.");
        //07
        line.setFieldValue(RegistroM620.DT_REF, data);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M620|0|100000000000,01|12|Número do processo, documento ou ato concessório ao qual o ajuste está vinculado, se houver.|Descrição resumida do ajuste.|13022013|";
//	assertEquals (expected, sb.toString());
    }
}
