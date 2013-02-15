package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 25/11/2011 09:40:34
 * @author Douglas
 */
public class Registro1300Test{

    public Registro1300Test() {
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
    public void Registro1300Test() throws ParseException{
        Registro1300 reg = new Registro1300();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat ("MMyyyy");
        Date data = sdf.parse ("022013");
 
        //02
        line.setFieldValue(Registro1300.IND_NAT_RET, 1);
        //03
        line.setFieldValue(Registro1300.PR_REC_RET, data);
        //04
        line.setFieldValue(Registro1300.VL_RET_APU, 100000000000.01);
        //05
        line.setFieldValue(Registro1300.VL_RET_DED, 200000000000.02);
        //06
        line.setFieldValue(Registro1300.VL_RET_PER, 300000000000.03);
        //07
        line.setFieldValue(Registro1300.VL_RET_DCOMP, 400000000000.04);
        //08
        line.setFieldValue(Registro1300.SLD_RET, 500000000000.05);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "";
//	assertEquals (expected, sb.toString());
    }

}