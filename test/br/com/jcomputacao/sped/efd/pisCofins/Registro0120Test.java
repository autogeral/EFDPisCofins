package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 *
 * @author Jennifer
 */
public class Registro0120Test {
    
    public Registro0120Test(){
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
    public void Registro0120Test() throws ParseException{
        Registro0120 reg = new Registro0120();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("MMyyyy");
                Date data = sdf.parse("022013");
       
       //02         
       line.setFieldValue(Registro0120.MES_DISPENSA, data);
       //03
       line.setFieldValue(Registro0120.INF_COMP, "Informações complementares");        
       
       StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|0120|022013|Informações complementares|";
//	assertEquals (expected, sb.toString());
    }
}
