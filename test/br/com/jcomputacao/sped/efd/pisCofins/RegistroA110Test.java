package br.com.jcomputacao.sped.efd.pisCofins;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.*;
/**
 * 09/11/2011 21:22:42
 * @author Jonas
 */
public class RegistroA110Test {
     public RegistroA110Test(){
        
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
    public void RegistroA110Test(){
        
        RegistroA110 reg = new RegistroA110();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroA110.COD_INF, "sdf234");
        //03
        line.setFieldValue(RegistroA110.TXT_COMPL, "Informação Complementar do Documento Fiscal");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|A110|sdf234|Informação Complementar do Documento Fiscal|";
//        assertEquals (expected, sb.toString());
        
    }
    
    
}
