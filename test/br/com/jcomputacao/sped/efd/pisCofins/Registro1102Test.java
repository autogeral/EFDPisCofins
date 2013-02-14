package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 20:30:55
 * @author William Antunes
 */
public class Registro1102Test extends Randomize {
                public Registro1102Test() {
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
    public void Registro1102Test(){
        Registro1102 reg = new Registro1102();
        LineModel line = reg.createModel();
       
        //02
        line.setFieldValue(Registro1102.VL_CRED_PIS_TRIB_MI, 100000000000.01);
        //03
        line.setFieldValue(Registro1102.VL_CRED_PIS_NT_MI, 200000000000.02);
        //04
        line.setFieldValue(Registro1102.VL_CRED_PIS_EXP, 300000000000.03);


        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//
//        String expected = "|1102|100000000000,01|200000000000,02|300000000000,03|";
//        assertEquals (expected, sb.toString());
    }
    
    
}
