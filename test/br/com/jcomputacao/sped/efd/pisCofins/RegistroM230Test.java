package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 22:48:01
 * @author rafael.galvao
 */
public class RegistroM230Test {
    
    public RegistroM230Test() {
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
     * Test of getNome method, of class RegistroM230.
     */
    @Test
    public void RegistroM230Test() {
        RegistroM230 reg = new RegistroM230();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroM230.CNPJ, 12345678912345L);
        //03
        line.setFieldValue(RegistroM230.VL_VEND, 100000000000.01);
        //04
        line.setFieldValue(RegistroM230.VL_NAO_RECEB, 100000000000.01);
        //05
        line.setFieldValue(RegistroM230.VL_CONT_DIF, 100000000000.01);
        //06
        line.setFieldValue(RegistroM230.VL_CRED_DIF, 100000000000.01);
        //07
        line.setFieldValue(RegistroM230.COD_CRED, "COD");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M230|12345678912345|100000000000,01|100000000000,01|100000000000,01|100000000000,01|COD|";
//	assertEquals (expected, sb.toString());
    }
}
