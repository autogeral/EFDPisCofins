package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 *
 * @author Jennifer
 */
public class Registro0145Test {
    public Registro0145Test(){
    
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
    public void Registro0145Test(){
        Registro0145 reg = new Registro0145();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(Registro0145.COD_INC_TRIB, 1);
        //03
        line.setFieldValue(Registro0145.VL_REC_TOT, 100000000000.01);
        //04
        line.setFieldValue(Registro0145.VL_REC_ATIV, 200000000000.02);
        //05
        line.setFieldValue(Registro0145.VL_REC_DEMAIS_ATIV, 300000000000.03);
        //06
        line.setFieldValue(Registro0145.INFO_COMPL, "Informações complementares");        
                
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "|0145|1|100000000000,01|200000000000,02|300000000000,03|Informações complementares|";
	assertEquals (expected, sb.toString());
    }
}
