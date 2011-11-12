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
 * 12/11/2011 10:55:08
 * @author WILL
 */
public class Registro1020Test extends Randomize {
                public Registro1020Test() {
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
    public void Registro1020Test(){
        Registro1020 reg = new Registro1020();
        LineModel line = reg.createModel();
       
        line.setFieldValue(Registro1020.REG, GeraStringRandom(4));
        line.setFieldValue(Registro1020.NUM_PROC, GeraStringRandom(20));
        line.setFieldValue(Registro1020.IND_NAT_ACAO, GeraStringRandom(2));
        line.setFieldValue(Registro1020.DT_DEC_ADM, 11111111l);

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
    
}
