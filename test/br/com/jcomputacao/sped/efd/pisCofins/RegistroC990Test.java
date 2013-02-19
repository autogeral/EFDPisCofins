package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroC990Test {
    public RegistroC990Test() {
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
    public void RegistroC990Test() {
        RegistroC990 reg = new RegistroC990();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC990.QTD_LIN_C, 2);
    
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        
//        String expected = "|C990|2|";
//        assertEquals (expected, sb.toString());
    }
}
