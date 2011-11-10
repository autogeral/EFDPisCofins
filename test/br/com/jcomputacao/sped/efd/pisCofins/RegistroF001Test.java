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
 * 10/11/2011 21:23:39
 * @author Jonas
 */
public class RegistroF001Test {
     public RegistroF001Test() {
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
    public void registroF001test() throws ParseException {
         RegistroF001 reg = new RegistroF001();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroF001.REG, "0001");
        line.setFieldValue(RegistroF001.IND_MOV, "1");
    }
        
}
