package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD359Test {
     public RegistroD359Test() {
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
    public void RegistroD359Test() {
        RegistroD359 reg = new RegistroD359();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC830.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(RegistroC830.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        String expected = "|D359|Identif do process|9|";
        assertEquals(expected, sb.toString());
    }
}
