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
 * 09/11/2011 21:42:39
 * @author rafael.galvao
 */
public class RegistroC110Test {
    
    public RegistroC110Test() {
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
    public void RegistroC110(){
        RegistroC110 reg = new RegistroC110();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC110.REG, "0001");
        line.setFieldValue(RegistroC110.COD_INF, " 0000 ");
        line.setFieldValue(RegistroC110.TXT_COMPL, " lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb "
);
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
