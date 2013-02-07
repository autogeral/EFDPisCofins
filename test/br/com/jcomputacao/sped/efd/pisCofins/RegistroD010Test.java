package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 *
 * @author Jeni
 */
public class RegistroD010Test {
    public RegistroD010Test(){
    
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
    public void RegistroD010Test(){
        RegistroD010 reg = new RegistroD010();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroD010.CNPJ, 12345678912345L);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
        String expected = "|D010|12345678912345|";
        assertEquals (expected, sb.toString());
    }
}
