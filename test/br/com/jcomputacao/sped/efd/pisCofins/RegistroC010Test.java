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
 *
 * @author rafael.galvao
 */
public class RegistroC010Test {
    
    public RegistroC010Test() {
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
    public void RegistroC010Test(){
        RegistroC010 reg = new RegistroC010();
        LineModel line = reg.createModel();
        
        line.setFieldValue(RegistroC010.REG, "0001");
        line.setFieldValue(RegistroC010.CNPJ, 2345678912345L);
        line.setFieldValue(RegistroC010.IND_ESCRI, "d");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
