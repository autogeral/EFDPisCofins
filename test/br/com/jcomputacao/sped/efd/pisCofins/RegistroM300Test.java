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
 * 17/11/2011 22:35:40
 * @author rafael.galvao
 */
public class RegistroM300Test {
    
    public RegistroM300Test() {
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
     * Test of getNome method, of class RegistroM300.
     */
    @Test
    public void RegistroM300Test() {
        RegistroM300 reg = new RegistroM300();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroM300.REG, "0100");
        line.setFieldValue(RegistroM300.COD_CONT, "fd");
        line.setFieldValue(RegistroM300.VL_CONT_APUR_DIFER, 12345678912345678912.33);
        line.setFieldValue(RegistroM300.NAT_CRED_DESC, "vc");
        line.setFieldValue(RegistroM300.VL_CRED_DESC_DIFER, 12345678912345678912.33);
        line.setFieldValue(RegistroM300.VL_CONT_DIFER_ANT, 12345678912345678912.33);
        line.setFieldValue(RegistroM300.PER_APUR, 123456L);
        line.setFieldValue(RegistroM300.DT_RECEB, 12345678L);

        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
