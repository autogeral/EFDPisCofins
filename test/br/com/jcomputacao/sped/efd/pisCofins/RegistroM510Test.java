package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 20:09:20
 * @author rafael.galvao
 */
public class RegistroM510Test extends Randomize {
    
    public RegistroM510Test() {
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
     * Test of getNome method, of class RegistroM510.
     */
    @Test
    public void RegistroM510Test() throws ParseException{
        RegistroM510 rm = new RegistroM510();
        LineModel line = rm.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat ("ddMMyyyy");
        Date data = sdf.parse("13022013");
        
        //02
        line.setFieldValue(RegistroM510.IND_AJ, "0");
        //03
        line.setFieldValue(RegistroM510.VL_AJ, 100000000000.01);
        //04
        line.setFieldValue(RegistroM510.COD_AJ, "CA");
        //05
        line.setFieldValue(RegistroM510.NUM_DOC, "Número do processo, documento ou ato concessório ao qual o ajuste está vinculado, se houver.");
        //06
        line.setFieldValue(RegistroM510.DESCR_AJ, "Descrição resumida do ajuste.");
        //07
        line.setFieldValue(RegistroM510.DT_REF, data);
        
     
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M510|0|100000000000,01|CA|Número do processo, documento ou ato concessório ao qual o ajuste está vinculado, se houver.|Descrição resumida do ajuste.|13022013|";
//	assertEquals (expected, sb.toString());
    }
}
