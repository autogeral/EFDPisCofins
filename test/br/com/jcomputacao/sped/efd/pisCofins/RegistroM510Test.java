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
import static org.junit.Assert.*;

/**
 * 17/11/2011 20:09:20
 * @author rafael.galvao
 */
public class RegistroM510Test extends Randomize {
    
    public RegistroM510Test() {
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
     * Test of getNome method, of class RegistroM510.
     */
    @Test
    public void RegistroM510Test(){
        RegistroM510 rm = new RegistroM510();
        LineModel line = rm.createModel();
        
        line.setFieldValue(RegistroM510.REG, "1234");
        line.setFieldValue(RegistroM510.IND_AJ, "2");
        line.setFieldValue(RegistroM510.VL_AJ, 12345678912345678912.32);
        line.setFieldValue(RegistroM510.COD_AJ, "12");
        line.setFieldValue(RegistroM510.NUM_DOC, GeraStringRandom(255));
        line.setFieldValue(RegistroM510.DESCR_AJ, GeraStringRandom(255));
        line.setFieldValue(RegistroM510.DT_REF, 12345678L);
        
     
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
