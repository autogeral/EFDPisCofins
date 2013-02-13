package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 12:25:12
 * @author rafael.galvao
 */
public class RegistroM630Test {

    public RegistroM630Test() {
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
     * Test of getNome method, of class RegistroM630.
     */
    @Test
    public void RegistroM630Test() {
        RegistroM630 reg = new RegistroM630();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(RegistroM630.CNPJ, 12345678912345L);
        //03
        line.setFieldValue(RegistroM630.VL_VEND, 100000000000.01);
        //04
        line.setFieldValue(RegistroM630.VL_NAO_RECEB, 200000000000.02);
        //05
        line.setFieldValue(RegistroM630.VL_CONT_DIF, 300000000000.03);
        //06
        line.setFieldValue(RegistroM630.VL_CRED_DIF, 400000000000.04);
        //07
        line.setFieldValue(RegistroM630.COD_CRED, "COD");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|M630|12345678912345|100000000000,01|200000000000,02|300000000000,03|400000000000,04|COD|";
//	assertEquals (expected, sb.toString());
    }
}
