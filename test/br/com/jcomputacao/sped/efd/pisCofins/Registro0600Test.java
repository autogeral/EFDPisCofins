package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 *
 * @author rafael.galvao
 */
public class Registro0600Test {
    
    public Registro0600Test() {
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
    public String linhaRegistro0600Test() throws ParseException{
        Registro0600 reg = new Registro0600();
        LineModel line = reg.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        

        //02
        line.setFieldValue(Registro0600.DT_ALT, data);
        //03
        line.setFieldValue(Registro0600.COD_CCUS, "Código do centro de custos.");
        //04
        line.setFieldValue(Registro0600.CCUS, "Nome do centro de custos.");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|0600|29012013|Código do centro de custos.|Nome do centro de custos.|";
//        assertEquals (expected, sb.toString());   
        return sb.toString();
    }
}
