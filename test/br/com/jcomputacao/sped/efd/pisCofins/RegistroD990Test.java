package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD990Test {
      public RegistroD990Test() {
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
    public void RegistroD990Test() {
        RegistroD990 reg = new RegistroD990();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroD990.QTD_LIN_D, 450L);
    
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|D990|450|";
//        assertEquals (expected, sb.toString());
    }
}
