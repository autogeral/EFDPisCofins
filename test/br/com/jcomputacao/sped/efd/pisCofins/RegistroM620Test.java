/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 12/11/2011 12:38:11
 * @author rafael.galvao
 */
public class RegistroM620Test extends Randomize {

    public RegistroM620Test() {
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
     * Test of getNome method, of class RegistroM620.
     */
    @Test
    public void RegistroM620Test() throws ParseException {
        RegistroM620 reg = new RegistroM620();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(RegistroM620.REG, "1234");
        line.setFieldValue(RegistroM620.IND_AJ, "d");
        line.setFieldValue(RegistroM620.VL_AJ, 123456789123456789.22);
        line.setFieldValue(RegistroM620.COD_AJ, "12");
        line.setFieldValue(RegistroM620.NUM_DOC, GeraStringRandom(255));
        line.setFieldValue(RegistroM620.DESCR_AJ, GeraStringRandom(255));
        line.setFieldValue(RegistroM620.DT_REF, data);

        StringBuffer r = line.getRepresentation();
        System.out.print(r);








    }
}
