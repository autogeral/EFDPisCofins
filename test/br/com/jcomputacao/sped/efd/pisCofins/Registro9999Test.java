package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 10:31:26
 * @author WILL
 */
public class Registro9999Test extends Randomize {
                    public Registro9999Test() {
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
    public void registro9999test()
    {
        Registro9999 reg = new Registro9999();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro9999.QTD_LIN, 1000);
     
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "|9999|1000|";
	assertEquals (expected, sb.toString());
    }
    
}
