package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Ana Cláudia
 */
public class RegistroD500Test {

    public RegistroD500Test() {
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
    public void RegistroD500Test() throws ParseException {
        RegistroD500 reg = new RegistroD500();
        LineModel line = reg.createModel();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("07022013");
        
        //02
        line.setFieldValue(RegistroD500.IND_OPER, "0");
        //03
        line.setFieldValue(RegistroD500.IND_EMIT, "0");
        //04
        line.setFieldValue(RegistroD500.COD_PART, "0101SADA12DA0");
        //05
        line.setFieldValue(RegistroD500.COD_MOD, "01");
        //06
        line.setFieldValue(RegistroD500.COD_SIT, 98L);
        //07
        line.setFieldValue(RegistroD500.SER, "0100");
        //08
        line.setFieldValue(RegistroD500.SUB, 123L);
        //09
        line.setFieldValue(RegistroD500.NUM_DOC, 123456789L);
        //10
        line.setFieldValue(RegistroD500.DT_DOC, data);
        //11
        line.setFieldValue(RegistroD500.DT_A_P, data);
        //12
        line.setFieldValue(RegistroD500.VL_DOC, 145.34);
        //13
        line.setFieldValue(RegistroD500.VL_DESC, 1432.23);
        //14
        line.setFieldValue(RegistroD500.VL_SERV, 152.56);
        //15
        line.setFieldValue(RegistroD500.VL_SERV_NT, 1412.34);
        //16
        line.setFieldValue(RegistroD500.VL_TERC, 123.76);
        //17
        line.setFieldValue(RegistroD500.VL_DA, 142.45);
        //18
        line.setFieldValue(RegistroD500.VL_BC_ICMS, 183.89);
        //19
        line.setFieldValue(RegistroD500.VL_ICMS, 158.87);
        //20
        line.setFieldValue(RegistroD500.COD_INF, "123456");
        //21
        line.setFieldValue(RegistroD500.VL_PIS, 12222223.43);
        //22
        line.setFieldValue(RegistroD500.VL_COFINS, 1235.34);
        

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|D500|0|0|0101SADA12DA0|01|98|0100|123|123456789|07022013|07022013|145,34|1432,23|152,56|1412,34|123,76|142,45|183,89|158,87|123456|12222223,43|1235,34|";
//        assertEquals (expected, sb.toString());
    }
}
