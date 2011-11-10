/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 10/11/2011 20:31:44
 * @author John
 */
public class RegistroC490Test {

    public RegistroC490Test() throws ParseException {
        RegistroC490 reg = new RegistroC490();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(RegistroC490.REG, "C490");
        line.setFieldValue(RegistroC490.DT_DOC_INI, data);
        line.setFieldValue(RegistroC490.DT_DOC_FIN, data);
        line.setFieldValue(RegistroC490.COD_MOD, "AA");

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
     * Test of getNome method, of class RegistroC490.
     */
    @Test
    public void testGetNome() {
    }
}
