package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 21/11/2011 16:52:03
 * @author rafael.galvao
 */
public class RegistroM220Test {
    
    public RegistroM220Test() {
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
     * Test of getNome method, of class RegistroM220.
     */
    @Test
    public void RegistroM220Test() throws ParseException {
        RegistroM220 reg = new RegistroM220();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("13022013");
                
        //02
        line.setFieldValue(RegistroM220.IND_AJ, "1");
        //03
        line.setFieldValue(RegistroM220.VL_AJ, 100000000000.01);
        //04
        line.setFieldValue(RegistroM220.COD_AJ, "23"); 
        //05
        line.setFieldValue(RegistroM220.NUM_DOC, "Número do processo, documento ou ato concessório ao qual o ajuste está vinculado, se houver.");
        //06
        line.setFieldValue(RegistroM220.DESCR_AJ, "Descrição resumida do ajuste.");
        //07
        line.setFieldValue(RegistroM220.DT_REF, data);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M220|1|100000000000,01|23|Número do processo, documento ou ato concessório ao qual o ajuste está vinculado, se houver.|Descrição resumida do ajuste.|13022013|";
//	assertEquals (expected, sb.toString());
    }
}
