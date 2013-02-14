package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author rafael.galvao
 */
public class Registro0400Test {
    
    public Registro0400Test() {
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
    public void Registro0400Test(){
        Registro0400 reg = new Registro0400();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0400.COD_NAT, "CodNatOper");
        //03
        line.setFieldValue(Registro0400.DESCR_NAT, "Descrição da natureza da operação/prestação");
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|0400|CodNatOper|Descrição da natureza da operação/prestação|";
//        assertEquals (expected, sb.toString());
    }
}
