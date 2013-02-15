
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 26/11/2011 11:46:16
 * @author Douglas
 */
public class Registro1809Test{

    public Registro1809Test() {
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
    public void Registro1809Test() throws ParseException{
        Registro1809 reg = new Registro1809();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(Registro1809.NUM_PROC, "Identif do process");
        //03
        line.setFieldValue(Registro1809.IND_PROC, "9");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|F1809|Identif do process|9|";
//        assertEquals(expected, sb.toString());
    }
}
