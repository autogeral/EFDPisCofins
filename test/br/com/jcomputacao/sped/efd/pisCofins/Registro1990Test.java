package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class Registro1990Test {
    public Registro1990Test() {
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
    public void Registro1990Test(){
        Registro1990 reg = new Registro1990();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(Registro1990.QTD_LIN_1, 2);
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|1990|2|";
//        assertEquals (expected, sb.toString());
    }
}
