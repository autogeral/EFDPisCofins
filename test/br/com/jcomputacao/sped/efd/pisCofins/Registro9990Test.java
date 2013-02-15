package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 10:26:14
 * @author WILL
 */
public class Registro9990Test extends Randomize {
                public Registro9990Test() {
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
    public void registro9990test()
    {
        Registro9990 reg = new Registro9990();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro9990.QTD_LIN_9, 150);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "|9990|150|";
	assertEquals (expected, sb.toString());
    }
    
}
