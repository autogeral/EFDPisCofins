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
public class RegistroM110Test {
     public RegistroM110Test() {
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
    public void RegistroM110Test() throws ParseException {
        RegistroM110 reg = new RegistroM110();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("13022013");
                
        //02
        line.setFieldValue(RegistroM110.IND_AJ, "1");
        //03
        line.setFieldValue(RegistroM110.VL_AJ, 2332.45);
        //04
        line.setFieldValue(RegistroM110.COD_AJ, "23");        
        //05
        line.setFieldValue(RegistroM110.NUM_DOC, "Número do processo, documento ou ato concessório ao qual o ajuste está vinculado, se houver.");
        //06
        line.setFieldValue(RegistroM110.DESCR_AJ, "Descrição resumida do ajuste.");
        //07
        line.setFieldValue(RegistroM110.DT_REF, data);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "|M110|1|2332,45|23|Número do processo, documento ou ato concessório ao qual o ajuste está vinculado, se houver.|Descrição resumida do ajuste.|13022013|";
	assertEquals (expected, sb.toString());
    }
}
