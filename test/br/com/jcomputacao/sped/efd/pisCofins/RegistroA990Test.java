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
 * 10/11/2011 20:44:01
 * @author Jonas
 */
public class RegistroA990Test {
    
     public RegistroA990Test() {
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
    public void registroA990test() throws ParseException {
        
         RegistroA990 reg = new RegistroA990();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroA990.REG, "0001");
        line.setFieldValue(RegistroA990.QTD_LIN_A, 2135l);
    }

    
}
