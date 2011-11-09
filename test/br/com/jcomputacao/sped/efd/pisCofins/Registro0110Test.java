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
public class Registro0110Test {
    
    public Registro0110Test() {
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
    public void Registro0110Test(){
         Registro0110 reg = new Registro0110();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0110.REG, "0001");
        line.setFieldValue(Registro0110.COD_INC_TRIB, 2L);
        line.setFieldValue(Registro0110.IND_APRO_CRED, 2L);
        line.setFieldValue(Registro0110.COD_TIPO_CONT, 2L);
        line.setFieldValue(Registro0110.IND_REG_CUM, 2L);

        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }
}
