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
 * 12/11/2011 10:10:31
 * @author WILL
 */
public class Registro9900Test extends Randomize
{
            public Registro9900Test() {
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
    public void registro9900test(){
        Registro9900 reg = new Registro9900();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro9900.REG, GeraStringRandom(4));
        line.setFieldValue(Registro9900.REG_BLC,GeraStringRandom(4) );
        line.setFieldValue(Registro9900.QTD_REG_BLC, 11111111111l);
        
        
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }
    
}
