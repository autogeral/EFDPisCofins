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
public class Registro0100Test {

    public Registro0100Test() {
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
    public void registro0100test(){
        Registro0100 reg = new Registro0100();
        LineModel line = reg.createModel();
      
        line.setFieldValue(Registro0100.BAIRRO, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        line.setFieldValue(Registro0100.REG, "1323");
        line.setFieldValue(Registro0100.CEP, "22222222");
        line.setFieldValue(Registro0100.CNPJ, "11111111111111");
          String brancos = "  ";
       StringBuffer sb = line.getRepresentation();
        String expected = "02RETORNO01COBRANÇA       12341234567812345678Hermanoteu godofredo durvalino333SANTANDER      051109" +
                "0000000000XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" +
                "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" + brancos + "123123456";


        assertEquals(expected.length(), 400);
        assertEquals(sb.toString().length(), 400);

        assertEquals(expected, sb.toString());
        
    }
}
