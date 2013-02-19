package br.com.jcomputacao.sped.efd.pisCofins;


import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 10/11/2011 21:23:39
 * @author Jonas
 */
public class RegistroF001Test {
     public RegistroF001Test() {
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
    public void registroF001test() throws ParseException {
         RegistroF001 reg = new RegistroF001();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(RegistroF001.IND_MOV, "0");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

        String expected = "|F001|0|";
        assertEquals (expected, sb.toString());
    }
        
}
