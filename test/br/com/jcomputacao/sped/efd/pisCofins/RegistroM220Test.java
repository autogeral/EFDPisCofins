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
 * 21/11/2011 16:52:03
 * @author rafael.galvao
 */
public class RegistroM220Test {
    
    public RegistroM220Test() {
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
     * Test of getNome method, of class RegistroM220.
     */
    @Test
    public void RegistroM220Test() throws ParseException {
        RegistroM220 reg = new RegistroM220();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
                
        line.setFieldValue(RegistroM220.REG, "0100");
        line.setFieldValue(RegistroM220.IND_AJ, "1");
        line.setFieldValue(RegistroM220.VL_AJ, 23123123456789654532.45);
        line.setFieldValue(RegistroM220.COD_AJ, "23");        
        line.setFieldValue(RegistroM220.NUM_DOC, "12346......50.......100.....150......200...255");
        line.setFieldValue(RegistroM220.DESCR_AJ, "++++....Descricao.....+++++");
        line.setFieldValue(RegistroM220.DT_REF, data);
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
