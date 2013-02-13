package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 11:30:29
 * @author rafael.galvao
 */
public class RegistroM990Test {
    
    public RegistroM990Test() {
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
     * Test of getNome method, of class RegistroM990.
     */
    @Test
    public void RegistroM990Test(){
        RegistroM990 reg = new RegistroM990();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroM990.QTD_LIN_M, 150);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

        String expected = "|M990|150|";
        assertEquals (expected, sb.toString());      
    }
}
