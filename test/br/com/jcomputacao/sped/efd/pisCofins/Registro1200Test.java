package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 20:43:11
 * @author William Antunes
 */
public class Registro1200Test extends Randomize {
       
    public Registro1200Test() {
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
    public void Registro1200Test() throws ParseException{
        Registro1200 reg = new Registro1200();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat ("MMyyyy");
        Date data = sdf.parse("022013");
        SimpleDateFormat sdf2 = new SimpleDateFormat ("ddMMyyyy");
        Date data2 = sdf2.parse("14022013");
        
        //02
        line.setFieldValue(Registro1200.PER_APUR_ANT, data);
        //03
        line.setFieldValue(Registro1200.NAT_CONT_REC, "12");
        //04
        line.setFieldValue(Registro1200.VL_CONT_APUR, 100000000000.01);
        //05
        line.setFieldValue(Registro1200.VL_CRED_PIS_DESC, 200000000000.02);
        //06
        line.setFieldValue(Registro1200.VL_CONT_DEV, 300000000000.03);
        //07
        line.setFieldValue(Registro1200.VL_OUT_DED, 400000000000.04);
        //08
        line.setFieldValue(Registro1200.VL_CONT_EXT, 500000000000.05);
        //09
        line.setFieldValue(Registro1200.VL_MUL, 600000000000.06);
        //10
        line.setFieldValue(Registro1200.VL_JUR, 700000000000.07);
        //11
        line.setFieldValue(Registro1200.DT_RECOL, data2);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1200|022013|12|100000000000,01|200000000000,02|300000000000,03|400000000000,04|500000000000,05|600000000000,06|700000000000,07|14022013|";
//	assertEquals (expected, sb.toString());
    }
    
    
}
