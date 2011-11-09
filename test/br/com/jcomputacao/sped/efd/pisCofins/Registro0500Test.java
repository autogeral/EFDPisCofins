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
public class Registro0500Test {
    
    public Registro0500Test() {
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
    public void Registro0500Test(){
        Registro0500 reg = new Registro0500();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0500.REG, "0001");
        line.setFieldValue(Registro0500.DT_ALT, 12345678L);
        line.setFieldValue(Registro0500.COD_NAT_CC, "sd");
        line.setFieldValue(Registro0500.IND_CTA, "g");
        line.setFieldValue(Registro0500.NIVEL, 12345L);
        line.setFieldValue(Registro0500.COD_CTA,"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb" );
        line.setFieldValue(Registro0500.NOME_CTA, "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        line.setFieldValue(Registro0500.COD_CTA_REF,"bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"
);
        line.setFieldValue(Registro0500.CNPJ_EST, 11111111111111L);
        
        StringBuffer a = line.getRepresentation();
        System.out.print(a);
        
    }
}
