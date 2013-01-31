package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.*;
/**
 * 10/11/2011 21:21:26
 * @author rafael.galvao
 */
public class RegistroC180Test {
    
    public RegistroC180Test() {
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
     * Test of getNome method, of class RegistroC180.
     */
    @Test
    public String linhaRegistroC180Test() throws ParseException{
        RegistroC180 reg = new RegistroC180();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("31012013");
        Randomize rm = new Randomize();
        
        //03
        line.setFieldValue(RegistroC180.DT_DOC_INI, data);
        //04
        line.setFieldValue(RegistroC180.DT_DOC_FIN, data);
        //05
        line.setFieldValue(RegistroC180.COD_ITEM, "Código do Item (campo 02 do Registro 0200)");
        //06
        line.setFieldValue(RegistroC180.COD_NCM, "12345678");
        //07
        line.setFieldValue(RegistroC180.EX_IPI, "EX3");
        //08
        line.setFieldValue(RegistroC180.VL_TOT_ITEM, 678912.35);
        
        StringBuffer sb = line.getRepresentation();
//        System.out.println(sb);
//        String expected = "|C180|55|31012013|31012013|Código do Item (campo 02 do Registro 0200)|12345678|EX3|678912,35|";
//        System.out.println(expected);
//        assertEquals (expected, sb.toString()); 
        return sb.toString();
    }
}
