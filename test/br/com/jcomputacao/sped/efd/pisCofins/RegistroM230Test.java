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
 * 17/11/2011 22:48:01
 * @author rafael.galvao
 */
public class RegistroM230Test {
    
    public RegistroM230Test() {
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

    /**
     * Test of getNome method, of class RegistroM230.
     */
    @Test
    public void RegistroM230Test() {
        RegistroM230 reg = new RegistroM230();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroM230.REG, "0100");
        line.setFieldValue(RegistroM230.CNPJ, 1234567891234L);
        line.setFieldValue(RegistroM230.VL_VEND, 12345678912345678912.33);
        line.setFieldValue(RegistroM230.VL_NAO_RECEB, 12345678912345678912.33);
        line.setFieldValue(RegistroM230.VL_CONT_DIF, 12345678912345678912.33);
        line.setFieldValue(RegistroM230.VL_CRED_DIF, 12345678912345678912.33);
        line.setFieldValue(RegistroM230.COD_CRED, "asd");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
