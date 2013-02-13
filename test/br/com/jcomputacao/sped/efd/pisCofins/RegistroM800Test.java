package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;


/**
 * 12/11/2011 11:49:23
 * @author rafael.galvao
 */
public class RegistroM800Test extends Randomize {

    public RegistroM800Test() {
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
     * Test of getNome method, of class RegistroM800.
     */
    @Test
    public void RegistroM800Test() {
        RegistroM800 reg = new RegistroM800();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroM800.CST_COFINS, "01");
        //03
        line.setFieldValue(RegistroM800.VL_TOT_REC, 100000000000.01);
        //04
        line.setFieldValue(RegistroM800.COD_CTA, "Código da conta analítica contábil debitada/creditada.");
        //05
        line.setFieldValue(RegistroM800.DESC_COMPL, "Descrição Complementar da Natureza da Receita.");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M800|01|100000000000,01|Código da conta analítica contábil debitada/creditada.|Descrição Complementar da Natureza da Receita.|";
//	assertEquals (expected, sb.toString());
    }
}
