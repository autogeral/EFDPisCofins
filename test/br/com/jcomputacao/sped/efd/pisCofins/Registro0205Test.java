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
 * 09/11/2011 11:36:04
 * @author WILL
 */
public class Registro0205Test {
     public Registro0205Test() {
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
    public void registro0205test(){
        Registro0205 reg = new Registro0205();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0205.REG, "0001");
        line.setFieldValue(Registro0205.DESCR_ANT_ITEM, "111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        line.setFieldValue(Registro0205.DT_INI, 11111111l);
        line.setFieldValue(Registro0205.DT_FIM, 11111l);
        line.setFieldValue(Registro0205.COD_ANT_ITEM, "111111111111111111111111111111111111111111111111111111111111");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }
    
}
