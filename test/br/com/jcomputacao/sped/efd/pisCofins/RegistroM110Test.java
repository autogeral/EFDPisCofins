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
 *
 * @author Ana Cláudia
 */
public class RegistroM110Test {
     public RegistroM110Test() {
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
    public void RegistroM110Test() throws ParseException {
        RegistroM110 reg = new RegistroM110();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
                
        line.setFieldValue(RegistroM110.REG, "0100");
        line.setFieldValue(RegistroM110.IND_AJ, "1");
        line.setFieldValue(RegistroM110.VL_AJ, 2332.45);
        line.setFieldValue(RegistroM110.COD_AJ, "23");        
        line.setFieldValue(RegistroM110.NUM_DOC, "12346");
        line.setFieldValue(RegistroM110.DESCR_AJ, "Descricao");
        line.setFieldValue(RegistroM110.DT_REF, data);
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
