package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 09:51:37
 * @author WILL
 */
public class Registro9001Test {
        public Registro9001Test() {
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
    public void registro9001test(){
        Registro9001 reg = new Registro9001();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro9001.IND_MOV, "0");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|9001|0|";
//        assertEquals (expected, sb.toString());
        
    }

    
}
