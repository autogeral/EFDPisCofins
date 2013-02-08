package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 10/11/2011 21:36:39
 * @author Jonas
 */
public class RegistroF010Test {
    
    public RegistroF010Test() {
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
    public void registroF010test() throws ParseException {
        
         RegistroF010 reg = new RegistroF010();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroF010.CNPJ, 12345678910111L);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|F010|12345678910111|";
//        assertEquals (expected, sb.toString());
    }
    
}
