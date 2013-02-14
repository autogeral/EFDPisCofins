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
public class Registro0450Test {
    
    public Registro0450Test() {
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
    public void Registro0450Test(){
        Registro0450 reg = new Registro0450();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0450.COD_INF, "123456");
        //03
        line.setFieldValue(Registro0450.TXT, "Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicação referentes ao tributo.");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|0450|123456|Texto livre da informação complementar existente no documento fiscal, inclusive espécie de normas legais, poder normativo, número, capitulação, data e demais referências pertinentes com indicação referentes ao tributo.|";
//        assertEquals (expected, sb.toString());
    }
}
