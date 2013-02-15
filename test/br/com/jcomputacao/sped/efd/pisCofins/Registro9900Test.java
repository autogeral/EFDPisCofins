package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 10:10:31
 * @author WILL
 */
public class Registro9900Test extends Randomize
{
    public Registro9900Test() {
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
    public void registro9900test(){
        Registro9900 reg = new Registro9900();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro9900.REG_BLC, "????");
        //03
        line.setFieldValue(Registro9900.QTD_REG_BLC, 150);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "|9900|????|150|";
	assertEquals (expected, sb.toString());
    }
    
}
