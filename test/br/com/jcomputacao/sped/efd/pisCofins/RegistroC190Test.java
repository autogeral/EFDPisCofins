package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.*;

/**
 * 11/11/2011 19:23:19
 * @author rafael.galvao
 */
public class RegistroC190Test extends Randomize{
    
    public RegistroC190Test() {
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
     * Test of getNome method, of class RegistroC190.
     */
    @Test
    public void RegistroC190Test() throws ParseException{
        RegistroC190 reg = new RegistroC190();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        
        //03
        line.setFieldValue(RegistroC190.DT_REF_INI, data);
        //04
        line.setFieldValue(RegistroC190.DT_REF_FIN, data);
        //05
        line.setFieldValue(RegistroC190.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //06
        line.setFieldValue(RegistroC190.COD_NCM, "zxcvbnm,");
        //07
        line.setFieldValue(RegistroC190.EX_IPI, "123");
        //08
        line.setFieldValue(RegistroC190.VL_TOT_ITEM, 8912.33);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        
//        String expected = "|C190|55|17121986|17121986|Código do item (campo 02 do Registro 0200)|zxcvbnm,|123|8912,33|";
//        assertEquals(expected, sb.toString());
 
    }
}
