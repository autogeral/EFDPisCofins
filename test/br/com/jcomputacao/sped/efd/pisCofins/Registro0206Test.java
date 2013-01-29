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
public class Registro0206Test {
    
    public Registro0206Test() {
    }
    public String linhaRegistro0206Test(){
        Registro0206 reg = new Registro0206();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0206.COD_COMB, "Código do combustível, conforme tabela publicada pela ANP");
        
        StringBuffer sb = line.getRepresentation();
//        System.out.print(sb);
//        String expected = "|0206|Código do combustível, conforme tabela publicada pela ANP|";
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
