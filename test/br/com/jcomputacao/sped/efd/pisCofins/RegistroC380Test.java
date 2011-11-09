/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author John
 */
public class RegistroC380Test {

    public RegistroC380Test() throws ParseException {
        RegistroC380 reg = new RegistroC380();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(RegistroC380.REG, "0001");
        line.setFieldValue(RegistroC380.COD_MOD, "02");
        line.setFieldValue(RegistroC380.DT_DOC_INI, data);
        line.setFieldValue(RegistroC380.DT_DOC_FIN, data);
        line.setFieldValue(RegistroC380.NUM_DOC_INI, 123456L);
        line.setFieldValue(RegistroC380.NUM_DOC_FIN, 123456L);
        line.setFieldValue(RegistroC380.VL_DOC, 12345678912345678911.11);
        line.setFieldValue(RegistroC380.VL_DOC_CANC, 12345678912345678911.11);

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
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
     * Test of getNome method, of class RegistroC380.
     */
    @Test
    public void testGetNome() {
    }
}
