package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroM001Test {
     public RegistroM001Test() {
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
    public void RegistroM001Test() {
        RegistroM001 reg = new RegistroM001();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroM001.IND_MOV, "1");
            
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

        String expected = "|M001|1|";
        assertEquals (expected, sb.toString());
    }
    
}
