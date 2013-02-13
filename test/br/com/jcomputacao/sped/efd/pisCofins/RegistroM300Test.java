package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 22:35:40
 * @author rafael.galvao
 */
public class RegistroM300Test {
    
    public RegistroM300Test() {
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
     * Test of getNome method, of class RegistroM300.
     */
    @Test
    public void RegistroM300Test() throws ParseException {
        RegistroM300 reg = new RegistroM300();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse ("13022013");
        SimpleDateFormat sdf1 = new SimpleDateFormat("MMyyyy");
        Date data1 = sdf1.parse ("022013");
        
        //02
        line.setFieldValue(RegistroM300.COD_CONT, "CD");
        //03
        line.setFieldValue(RegistroM300.VL_CONT_APUR_DIFER, 100000000000.01);
        //04
        line.setFieldValue(RegistroM300.NAT_CRED_DESC, "01");
        //05
        line.setFieldValue(RegistroM300.VL_CRED_DESC_DIFER, 100000000000.01);
        //06
        line.setFieldValue(RegistroM300.VL_CONT_DIFER_ANT, 100000000000.01);
        //07
        line.setFieldValue(RegistroM300.PER_APUR, data1);
        //08
        line.setFieldValue(RegistroM300.DT_RECEB, data);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M300|CD|100000000000,01|01|100000000000,01|100000000000,01|022013|13022013|";
//	assertEquals (expected, sb.toString());
    }
}
