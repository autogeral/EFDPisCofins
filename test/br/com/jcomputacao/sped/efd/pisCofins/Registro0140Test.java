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
 * 09/11/2011 09:51:25
 * @author WILL
 */
public class Registro0140Test {
     public Registro0140Test() {
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
    public void registro0001test(){
        Registro0140 reg = new Registro0140();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0140.REG, "0001");
        line.setFieldValue(Registro0140.COD_EST, "111111111111111111111111111111111111111111111111111111111111");
        line.setFieldValue(Registro0140.NOME, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        line.setFieldValue(Registro0140.CNPJ, 1111111111111l);
        line.setFieldValue(Registro0140.UF, "0l");
        line.setFieldValue(Registro0140.IE, "1111111111111l");
        line.setFieldValue(Registro0140.COD_MUN, 1111111l);
        line.setFieldValue(Registro0140.IM, "0l");
        line.setFieldValue(Registro0140.SUFRAMA, "111111111");
        
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }

    
}
