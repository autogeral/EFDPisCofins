package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 09/11/2011 11:53:18
 * @author WILL
 */
public class Registro0208Test {
    
    public Registro0208Test() {
    }

    public String linhaRegistro0208Test(){
        Registro0208 reg = new Registro0208();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0208.COD_TAB, "01");
        //03
        line.setFieldValue(Registro0208.COD_GRU, "SN");
        //04
        line.setFieldValue(Registro0208.MARCA_COM, "Marca comercial");
       
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|0208|01|SN|Marca comercial|";
//        assertEquals (expected, sb.toString());
        return sb.toString();                
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
    public void testSomeMethod() {
    }
}
