package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 11:07:26
 * @author WILL
 */
public class Registro1100Test extends Randomize {
    public Registro1100Test() {
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
    public void Registro1100Test(){
        Registro1100 reg = new Registro1100();
        LineModel line = reg.createModel();
       
        line.setFieldValue(Registro1100.REG, GeraStringRandom(4));
        line.setFieldValue(Registro1100.PER_APU_CRED, 111111l);
        line.setFieldValue(Registro1100.ORIG_CRED, 11l);
        line.setFieldValue(Registro1100.CNPJ_SUC, 11111111111111l);
        line.setFieldValue(Registro1100.COD_CRED, 111l);
        line.setFieldValue(Registro1100.VL_CRED_APU, 1111111111111111111l);
        line.setFieldValue(Registro1100.VL_CRED_EXT_APU, 11111111111111111.11);
        line.setFieldValue(Registro1100.VL_TOT_CRED_APU, 11111111111111111.11);
        line.setFieldValue(Registro1100.VL_CRED_DESC_PA_ANT, 11111111111111111.11);
        line.setFieldValue(Registro1100.VL_CRED_PER_PA_ANT, 11111111111111111.11);
        line.setFieldValue(Registro1100.VL_CRED_DCOMP_PA_ANT, 11111111111111111.11);
        line.setFieldValue(Registro1100.SD_CRED_DISP_EFD, 11111111111111111.11);
        line.setFieldValue(Registro1100.VL_CRED_DESC_EFD, 11111111111111111.11);
        line.setFieldValue(Registro1100.VL_CRED_PER_EFD, 11111111111111111.11);
        line.setFieldValue(Registro1100.VL_CRED_DCOMP_EFD, 11111111111111111.11);
        line.setFieldValue(Registro1100.VL_CRED_TRANS, 11111111111111111.11);
        line.setFieldValue(Registro1100.VL_CRED_OUT , 11111111111111111.11);
        line.setFieldValue(Registro1100.SLD_CRED_FIM, 11111111111111111.11);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "";
	//assertEquals (expected, sb.toString());
    }
    
}
