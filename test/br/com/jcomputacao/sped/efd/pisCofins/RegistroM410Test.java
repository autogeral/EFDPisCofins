package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 21:20:32
 * @author rafael.galvao
 */
public class RegistroM410Test extends Randomize{

    public RegistroM410Test() {
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
     * Test of getNome method, of class RegistroM410.
     */
    @Test
    public void RegistroM410Test() {
        RegistroM410 reg = new RegistroM410();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroM410.NAT_REC, "NAT");
        //03
        line.setFieldValue(RegistroM410.VL_REC, 100000000000.01);
        //04
        line.setFieldValue(RegistroM410.COD_CTA, "Código da conta analítica contábil debitada/creditada.");
        //05
        line.setFieldValue(RegistroM410.DESC_COMPL, "Descrição Complementar da Natureza da Receita.");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "|M410|NAT|100000000000,01|Código da conta analítica contábil debitada/creditada.|Descrição Complementar da Natureza da Receita.|";
	assertEquals (expected, sb.toString());
    }
}
