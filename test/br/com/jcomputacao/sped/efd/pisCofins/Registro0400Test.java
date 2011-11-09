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
import sun.font.CreatedFontTracker;
import static org.junit.Assert.*;

/**
 *
 * @author rafael.galvao
 */
public class Registro0400Test {
    
    public Registro0400Test() {
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
    public void Registro0400Test(){
        Registro0400 reg = new Registro0400();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0400.REG, "0001");
        line.setFieldValue(Registro0400.COD_NAT, "aaaaaaaaaa");
        line.setFieldValue(Registro0400.DESCR_NAT, "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"
);
        StringBuffer as = line.getRepresentation();
        System.out.print(as);
    }
}
