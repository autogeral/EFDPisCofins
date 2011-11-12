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
 * 12/11/2011 10:44:35
 * @author WILL
 */
public class Registro1010Test extends Randomize {
            public Registro1010Test() {
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
    public void Registro1010Test(){
        Registro1010 reg = new Registro1010();
        LineModel line = reg.createModel();
       
        line.setFieldValue(Registro1010.REG, GeraStringRandom(4));
        line.setFieldValue(Registro1010.NUM_PROC, GeraStringRandom(20));
        line.setFieldValue(Registro1010.ID_SEC_JUD, GeraStringRandom(255));
        line.setFieldValue(Registro1010.ID_VARA, GeraStringRandom(2));
        line.setFieldValue(Registro1010.IND_NAT_ACAO, GeraStringRandom(2));
        line.setFieldValue(Registro1010.DESC_DEC_JUD, GeraStringRandom(100));
        line.setFieldValue(Registro1010.DT_SENT_JUD,11111111l);
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
    
}
