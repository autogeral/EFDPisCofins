package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 09/11/2011 21:42:39
 * @author rafael.galvao
 */
public class RegistroC110Test {
    
    public RegistroC110Test() {
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
    public void RegistroC110Test(){
        RegistroC110 reg = new RegistroC110();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC110.COD_INF, "123456");
        //03
        line.setFieldValue(RegistroC110.TXT_COMPL, "Descrição complementar do código de referência.");
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|C110|123456|Descrição complementar do código de referência.|";
//        assertEquals (expected, sb.toString());
        
    }
}
