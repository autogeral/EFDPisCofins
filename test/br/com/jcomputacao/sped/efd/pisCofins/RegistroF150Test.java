package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 22:42:59
 * @author Jonas
 */
public class RegistroF150Test {

    public RegistroF150Test() {
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
    public void registroF150test() throws ParseException {


        RegistroF150 reg = new RegistroF150();
        LineModel line = reg.createModel();

        //03
        line.setFieldValue(RegistroF150.VL_TOT_EST, 123456.12);
        //04
        line.setFieldValue(RegistroF150.EST_IMP, 123456.12);
        //05
        line.setFieldValue(RegistroF150.VL_BC_EST, 123456.12);
        //06
        line.setFieldValue(RegistroF150.VL_BC_MEN_EST, 123456.12);
        //07
        line.setFieldValue(RegistroF150.CST_PIS, 23);
        //08
        line.setFieldValue(RegistroF150.ALIQ_PIS, 123456.1234);
        //09
        line.setFieldValue(RegistroF150.VL_CRED_PIS, 123456.12);
        //10
        line.setFieldValue(RegistroF150.CST_COFINS, 12);
        //11
        line.setFieldValue(RegistroF150.ALIQ_COFINS, 123456.1234);
        //12
        line.setFieldValue(RegistroF150.VL_CRED_COFINS, 123456.12);
        //13
        line.setFieldValue(RegistroF150.DESC_EST, "Descrição do estoque");
        //14
        line.setFieldValue(RegistroF150.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

        String expected = "|F150|18|123456,12|123456,12|123456,12|123456,12|23|123456,1234|123456,12|12|123456,1234|123456,12|Descrição do estoque|Código da conta analítica contábil debitada/creditada|";
        assertEquals (expected, sb.toString());
    }
}
