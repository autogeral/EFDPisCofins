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
 * 12/11/2011 10:26:14
 * @author WILL
 */
public class Registro9990Test extends Randomize {
                public Registro9990Test() {
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
    public void registro9990test()
    {
        Registro9990 reg = new Registro9990();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro9990.REG, GeraStringRandom(4));
        line.setFieldValue(Registro9990.QTD_LIN_9,1111111111111111111l );
     
        
        
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }
    
}
