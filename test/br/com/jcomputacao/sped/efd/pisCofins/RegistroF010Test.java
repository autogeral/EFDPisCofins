/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 10/11/2011 21:36:39
 * @author Jonas
 */
public class RegistroF010Test {
    
    public RegistroF010Test() {
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
    public void registroF010test() throws ParseException {
        
         RegistroF010 reg = new RegistroF010();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroF010.REG, "0001");
        line.setFieldValue(RegistroF010.CNPJ, 123456789101112l);
         StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
    
}
