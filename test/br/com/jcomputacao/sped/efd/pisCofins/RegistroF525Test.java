package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class RegistroF525Test {
    public RegistroF525Test(){
    
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
    public void RegistroF525Test(){
        RegistroF525 reg = new RegistroF525();
        LineModel line = reg.createModel();
        
        double campo02 = 123.23;
        String campo03 = "11111111111111";
        double campo07 = 123.23;
        
        //02
        line.setFieldValue(RegistroF525.VL_REC, campo02);
        //03
        line.setFieldValue(RegistroF525.IND_REC, "01");
        //04
        line.setFieldValue(RegistroF525.CNPJ_CPF, campo03);
        //05
        line.setFieldValue(RegistroF525.NUM_DOC, null);        
        //06
        line.setFieldValue(RegistroF525.COD_ITEM, null);
        //07
        line.setFieldValue(RegistroF525.VL_REC_DET, campo07);
        //08
        line.setFieldValue(RegistroF525.CST_PIS, 23);
        //09
        line.setFieldValue(RegistroF525.CST_COFINS, 24);
        //10
        line.setFieldValue(RegistroF525.INFO_COMPL, "Informação complementar");
        //11
        line.setFieldValue(RegistroF525.COD_CTA, "Cód da cont analítica contábil represent da receita recebida");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        
//        String expected = "|F525|123,23|01|11111111111111|Número do título de crédito ou do documento fiscal|Código do item (campo 02 do Registro 0200)|123,23|23|24|Informação complementar|Cód da cont analítica contábil represent da receita recebida|";
//        assertEquals (expected, sb.toString());
    }

}
