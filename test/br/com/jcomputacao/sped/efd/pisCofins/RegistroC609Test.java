package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroC609Test {

    public RegistroC609Test() {
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
    public void RegistroC609Test() {
        RegistroC609 reg = new RegistroC609();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroC609.NUM_PROC, "12879332");
        //03
        line.setFieldValue(RegistroC609.IND_PROC, "1");


        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        String expected = "|C609|12879332|1|";
        assertEquals (expected, sb.toString());
    }
}
