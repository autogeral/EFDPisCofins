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
 * 09/11/2011 22:10:18
 * @author rafael.galvao
 */
public class RegistroC120Test  {
    
    public RegistroC120Test() {
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
    public void RegistroC120Test(){
        RegistroC120 reg = new RegistroC120();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC120.REG, "1234");
        line.setFieldValue(RegistroC120.COD_DOC_IMP, "f");
        line.setFieldValue(RegistroC120.NUM_DOC_IMP, "asdfghjklç");
        line.setFieldValue(RegistroC120.VL_PIS_IMP, 12345678912345678978.12);
        line.setFieldValue(RegistroC120.VL_COFINS_IMP, 78945612378945612783.23);
        line.setFieldValue(RegistroC120.NUM_ACDRAW, "asdfghjklçqwertyuiop");
        
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
