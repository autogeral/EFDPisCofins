package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafael.galvao
 */
public class Registro0200Test {
    
    public Registro0200Test() {
    }
    
    public String linhaRegistro0200Test(){
        Registro0200 reg = new Registro0200();
        LineModel line = reg.createModel();
        
         //02
         line.setFieldValue(Registro0200.COD_ITEM, "Código do item");
         //03
         line.setFieldValue(Registro0200.DESCR_ITEM, "Descricao do item");
         //04
         line.setFieldValue(Registro0200.COD_BARRA, "Representação alfanumérico do código de barra do produto, se houver.");
         //05
         line.setFieldValue(Registro0200.COD_ANT_ITEM, "Código anterior do item com relação à última informação");
         //06
         line.setFieldValue(Registro0200.UNID_INV, "UN");
         //07
         line.setFieldValue(Registro0200.TIPO_ITEM, 02);
         //08
         line.setFieldValue(Registro0200.COD_NCM, "cod_ncm");
         //09
         line.setFieldValue(Registro0200.EX_IPI, "abc");
         //10
         line.setFieldValue(Registro0200.COD_GEN, 13);
         //11
         line.setFieldValue(Registro0200.COD_LST, 1234);
         //12
         line.setFieldValue(Registro0200.ALIQ_ICMS, 123456.12);
         
         StringBuffer sb = line.getRepresentation();
         //System.out.println(sb);
         //String expected = "|0200|Código do item|Descricao do item|Representação alfanumérico do código de barra do produto, se houver.|Código anterior do item com relação à última informação|UN|02|cod_ncm|abc|13|1234|123456,12|";
         //assertEquals (expected, sb.toString());
         
         return sb.toString();
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
    public void testSomeMethod() {
    }
}
