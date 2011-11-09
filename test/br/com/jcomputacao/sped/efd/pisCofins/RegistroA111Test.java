/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 09/11/2011 21:36:38
 * @author Jonas
 */
public class RegistroA111Test {
    public RegistroA111Test(){
        
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
    public void registroA111test(){
        RegistroA111 reg = new RegistroA111();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroA111.REG, "0001");
        line.setFieldValue(RegistroA111.NUM_PROC, "sdsdf234f234125");
        line.setFieldValue(RegistroA111.IND_PROC, "3");
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
