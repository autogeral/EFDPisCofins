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
 * @author Ana Cláudia
 */
public class RegistroC601Test {
      public RegistroC601Test() {
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
    public void RegistroC601Test(){
        RegistroC601 reg = new RegistroC601();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC601.REG, "0001");
        line.setFieldValue(RegistroC601.CST_PIS, 3L);
        line.setFieldValue(RegistroC601.VL_ITEM, 222.76);
        line.setFieldValue(RegistroC601.VL_BC_PIS, 493.45);
        line.setFieldValue(RegistroC601.ALIQ_PIS, 1111.4444);
        line.setFieldValue(RegistroC601.VL_PIS, 234.34);
        line.setFieldValue(RegistroC601.COD_CTA, "aaaaaaaaaaaaa");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}

