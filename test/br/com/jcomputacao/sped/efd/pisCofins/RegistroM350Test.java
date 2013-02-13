package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 22:18:41
 * @author rafael.galvao
 */
public class RegistroM350Test {
    
    public RegistroM350Test() {
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
     * Test of getNome method, of class RegistroM350.
     */
    @Test
    public void RegistroM350Test() {
        RegistroM350 reg = new RegistroM350();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroM350.VL_TOT_FOL, 100000000000.02);
        //03
        line.setFieldValue(RegistroM350.VL_EXC_BC, 100000000000.03);
        //04
        line.setFieldValue(RegistroM350.VL_TOT_BC, 100000000000.04);
        //05
        line.setFieldValue(RegistroM350.ALIQ_PIS_FOL, 100000.05);
        //06
        line.setFieldValue(RegistroM350.VL_TOT_CONT_FOL, 100000000000.06);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M350|100000000000,02|100000000000,03|100000000000,04|100000,05|100000000000,06|";
//	assertEquals (expected, sb.toString());
    }
}
