
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 24/11/2011 11:12:19
 * @author Douglas
 */
public class RegistroF700Test {


  public RegistroF700Test() {

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
    public void registroF700test() throws ParseException {

      RegistroF700 reg = new RegistroF700();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroF700.IND_ORI_DED, 99);
        //03
        line.setFieldValue(RegistroF700.IND_NAT_DED, 1);
        //04
        line.setFieldValue(RegistroF700.VL_DED_PIS, 123.12);
        //05
        line.setFieldValue(RegistroF700.VL_DED_COFINS, 123.12);
        //06
        line.setFieldValue(RegistroF700.VL_BC_OPER, 123.12);
        //07
        line.setFieldValue(RegistroF700.CNPJ,12345678912345L);
        //08
        line.setFieldValue(RegistroF700.INF_COMP, "Informações Complementares do Documento/Operação");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//        String expected = "|F700|99|1|123,12|123,12|123,12|12345678912345|Informações Complementares do Documento/Operação|";
//        assertEquals (expected, sb.toString());

    }
}