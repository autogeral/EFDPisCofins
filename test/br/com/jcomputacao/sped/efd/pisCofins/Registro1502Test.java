
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;


/**
 * 26/11/2011 10:01:57
 * @author Douglas
 */
public class Registro1502Test{

    public Registro1502Test() {
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
    public void Registro1502Test() throws ParseException{
        Registro1502 reg = new Registro1502();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(Registro1502.VL_CRED_COFINS_TRIB_MI, 100000000000.01);
        //03
        line.setFieldValue(Registro1502.VL_CRED_COFINS_NT_MI, 100000000000.02);
        //04
        line.setFieldValue(Registro1502.VL_CRED_COFINS_EXP, 10000000000.03);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1502|100000000000,01|100000000000,02|10000000000,03|";
//	assertEquals (expected, sb.toString());
    }

}