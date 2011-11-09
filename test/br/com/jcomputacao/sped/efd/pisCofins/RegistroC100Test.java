/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 * @author rafael.galvao
 */
public class RegistroC100Test {

    public RegistroC100Test() {
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
    public void RegistroC100Test() {
        RegistroC100 reg = new RegistroC100();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroC100.REG, "1000");
        line.setFieldValue(RegistroC100.IND_OPER, "f");
        line.setFieldValue(RegistroC100.IND_EMIT, "s");
        line.setFieldValue(RegistroC100.COD_PART, "rafaelalexandredeoliveiragalvaojcomputacaovilanovaitusaopaul");
        line.setFieldValue(RegistroC100.COD_MOD, "fd");
        line.setFieldValue(RegistroC100.COD_SIT, 12L);
        line.setFieldValue(RegistroC100.SER, "100");
        line.setFieldValue(RegistroC100.NUM_DOC, 123456789L);
        line.setFieldValue(RegistroC100.CHV_NFE, " asdfghjklçqwertyuiopzxcvbnm,.lkjhgfdsaqwe   ");
        line.setFieldValue(RegistroC100.DT_DOC, 12345678L);
        line.setFieldValue(RegistroC100.DT_E_S, 12345678L);
        line.setFieldValue(RegistroC100.VL_DOC, 12345678912345678912.22);
        line.setFieldValue(RegistroC100.IND_PGTO, "l");
        line.setFieldValue(RegistroC100.VL_DESC, 12345678912345678912.22);
        line.setFieldValue(RegistroC100.VL_ABAT_NT, 12345678912345678912.22);
        line.setFieldValue(RegistroC100.VL_MERC, 12345678912345678912.22);
        line.setFieldValue(RegistroC100.IND_FRT, "1");
        line.setFieldValue(RegistroC100.VL_FRT, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_SEG, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_OUT_DA, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_BC_ICMS, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_ICMS, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_BC_ICMS_ST, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_ICMS_ST, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_IPI, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_PIS, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_COFINS, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_PIS_ST, 12345678912345678912.99);
        line.setFieldValue(RegistroC100.VL_COFINS_ST, 12345678912345678912.99);
        
        StringBuffer a = line.getRepresentation();
        System.out.print(a);






    }
}
