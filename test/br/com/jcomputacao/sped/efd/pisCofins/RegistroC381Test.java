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
 * @author John
 */
public class RegistroC381Test {
    
    public RegistroC381Test() {
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
     * Test of getNome method, of class RegistroC381.
     */
    @Test
    public void RegistroC381Test() {
        RegistroC381 reg = new RegistroC381();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC381.CST_PIS, 11L);
        //03
        line.setFieldValue(RegistroC381.COD_ITEM, "Código do item (campo 02 do Registro 0200)");
        //04
        line.setFieldValue(RegistroC381.VL_ITEM, 7890.55);
        //05
        line.setFieldValue(RegistroC381.VL_BC_PIS, null);
        //06
        line.setFieldValue(RegistroC381.ALIQ_PIS, null);
        //07
        line.setFieldValue(RegistroC381.QUANT_BC_PIS, null);
        //08
        line.setFieldValue(RegistroC381.ALIQ_PIS_QUANT, null);
        //09
        line.setFieldValue(RegistroC381.VL_PIS, 8911.11);
        //10
        line.setFieldValue(RegistroC381.COD_CTA, null);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
        String expected = "|C381|11|Código do item (campo 02 do Registro 0200)|7890,55|||||8911,11||";
        assertEquals (expected, sb.toString());
    }
}
