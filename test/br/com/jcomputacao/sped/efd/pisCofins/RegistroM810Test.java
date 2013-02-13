package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 11:39:12
 * @author rafael.galvao
 */
public class RegistroM810Test extends Randomize{
    
    public RegistroM810Test() {
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
     * Test of getNome method, of class RegistroM810.
     */
    @Test
    public void RegistroM810Test(){
        RegistroM810 reg = new RegistroM810();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroM810.NAT_REC, "012");
        //03
        line.setFieldValue(RegistroM810.VL_REC, 100000000000.01);
        //04
        line.setFieldValue(RegistroM810.COD_CTA, "Código da conta analítica contábil debitada/creditada.");
        //05
        line.setFieldValue(RegistroM810.DESC_COMPL, "Descrição Complementar da Natureza da Receita.");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M410|012|100000000000,01|Código da conta analítica contábil debitada/creditada.|Descrição Complementar da Natureza da Receita.|";
//	assertEquals (expected, sb.toString());

    }
}
