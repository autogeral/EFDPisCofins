package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 10:55:08
 * @author WILL
 */
public class Registro1020Test extends Randomize {
                public Registro1020Test() {
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
    public void Registro1020Test() throws ParseException{
        Registro1020 reg = new Registro1020();
        LineModel line = reg.createModel();
       SimpleDateFormat sdf = new SimpleDateFormat ("ddMMyyyy");
       Date data = sdf.parse ("14022013");
        
        //02
        line.setFieldValue(Registro1020.NUM_PROC, "Identific Process");
        //03
        line.setFieldValue(Registro1020.IND_NAT_ACAO, "99");
        //04
        line.setFieldValue(Registro1020.DT_DEC_ADM, data);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1020|Identific Process|99|140202013|";
//	assertEquals (expected, sb.toString());
    }
    
}
