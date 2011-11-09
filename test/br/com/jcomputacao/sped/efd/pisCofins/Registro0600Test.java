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
public class Registro0600Test {
    
    public Registro0600Test() {
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
    public void Registro0600Test(){
        Registro0600 reg = new Registro0600();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0600.REG, "0123");
        line.setFieldValue(Registro0600.DT_ALT, 12345678L);
        line.setFieldValue(Registro0600.COD_CCUS, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        line.setFieldValue(Registro0600.CCUS, "    rafaelalexandredeoliveiragalvaojcomputacaovilanovaitusao");
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
               
    }
}
