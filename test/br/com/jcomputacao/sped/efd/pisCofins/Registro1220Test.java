package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 21:25:00
 * @author William Antunes
 */
public class Registro1220Test{
    
    public Registro1220Test() {
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
    public void Registro1220Test() throws ParseException{
        Registro1220 reg = new Registro1220();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("MMyyyy");
        Date data = sdf.parse ("022013");
       
        //02
        line.setFieldValue(Registro1220.PER_APU_CRED, data);
        //03
        line.setFieldValue(Registro1220.ORIG_CRED, 1);
        //04
        line.setFieldValue(Registro1220.COD_CRED, 123);
        //05
        line.setFieldValue(Registro1220.VL_CRED, 100000000000.01);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1220|022013|01|123|100000000000,01|";
//	assertEquals (expected, sb.toString());
    }
    
}
