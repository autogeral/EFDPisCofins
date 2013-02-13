package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 21:36:53
 * @author rafael.galvao
 */
public class RegistroM400Test extends Randomize {
    
    public RegistroM400Test() {
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

    /**
     * Test of getNome method, of class RegistroM400.
     */
    @Test
    public void RegistroM400Test() {
        RegistroM400 reg = new RegistroM400();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroM400.CST_PIS, "12");
        //03
        line.setFieldValue(RegistroM400.VL_TOT_REC, 100000000000.01);
        //04
        line.setFieldValue(RegistroM400.COD_CTA, "Código da conta analítica contábil debitada/creditada.");
        //05
        line.setFieldValue(RegistroM400.DESC_COMPL, "Descrição Complementar da Natureza da Receita.");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "|M400|12|100000000000,01|Código da conta analítica contábil debitada/creditada.|Descrição Complementar da Natureza da Receita.|";
	assertEquals (expected, sb.toString());
    }
}
