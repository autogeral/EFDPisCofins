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
 * 09/11/2011 11:53:18
 * @author WILL
 */
public class Registro0208Test {
     public Registro0208Test() {
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
    public void registro0208test(){
        Registro0208 reg = new Registro0208();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0208.REG, "0001");
        line.setFieldValue(Registro0208.COD_TAB, "11");
        line.setFieldValue(Registro0208.COD_GRU, "11");
        line.setFieldValue(Registro0208.MARCA_COM, "111111111111111111111111111111111111111111111111111111111111");
       
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }
    
}
