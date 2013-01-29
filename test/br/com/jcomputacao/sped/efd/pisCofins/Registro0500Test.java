package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;
        
/**
 *
 * @author rafael.galvao
 */
public class Registro0500Test {
    
    public Registro0500Test() {
    }

    public String linhaRegistro0500Test() throws ParseException{
        Registro0500 reg = new Registro0500();
        LineModel line = reg.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("14012013");
        
        //02
        line.setFieldValue(Registro0500.DT_ALT, data);
        //03
        line.setFieldValue(Registro0500.COD_NAT_CC, "09");
        //04
        line.setFieldValue(Registro0500.IND_CTA, "A");
        //05
        line.setFieldValue(Registro0500.NIVEL, 4);
        //06
        line.setFieldValue(Registro0500.COD_CTA,"Código da conta analítica/grupo de contas.");
        //07
        line.setFieldValue(Registro0500.NOME_CTA, "Nome da conta analítica/grupo de contas.");
        //08
        line.setFieldValue(Registro0500.COD_CTA_REF,"Código da conta correlacionada - Pl. de Contas Referenciado");
        //09
        line.setFieldValue(Registro0500.CNPJ_EST, 11111111111111L);
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|0500|14012013|09|A|00004|Código da conta analítica/grupo de contas.|Nome da conta analítica/grupo de contas.|Código da conta correlacionada - Pl. de Contas Referenciado|11111111111111|";
//        assertEquals (expected, sb.toString());
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
