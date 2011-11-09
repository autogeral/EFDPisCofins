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
 * @author rafael.galvao
 */
public class Registro0990Test {
    
    public Registro0990Test() {
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
    public void Registro0990Test(){
        Registro0990 reg = new Registro0990();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0990.REG, "1234");
        line.setFieldValue(Registro0990.QTD_LIN_0,1234567897123456789L);
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
