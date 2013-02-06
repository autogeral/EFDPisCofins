package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Feb 6, 2013 3:49:59 PM
 * @author Jennifer
 */
public class RegistroC860Test {
    public RegistroC860Test (){
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
    public void RegistroC860Test() throws ParseException{
        RegistroC860 reg = new RegistroC860();
        LineModel line = reg.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("14021986");
        
        //02
        line.setFieldValue(RegistroC860.COD_MOD, "12");
        //03
        line.setFieldValue(RegistroC860.NR_SAT, 123456789L);
        //04
        line.setFieldValue(RegistroC860.DT_DOC, data);
        //05
        line.setFieldValue(RegistroC860.DOC_INI, 123456789L);
        //06
        line.setFieldValue(RegistroC860.DOC_FIM, 123456789L);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C860|12|123456789|14021986|123456789|123456789|";
//        assertEquals (expected, sb.toString());
    }
}
