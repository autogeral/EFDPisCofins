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
 * 09/11/2011 10:33:08
 * @author WILL
 */
public class Registro0150Test {
        public Registro0150Test() {
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
    public void registro0150test(){
        Registro0150 reg = new Registro0150();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0150.REG, "0001");
        line.setFieldValue(Registro0150.COD_PART, "111111111111111111111111111111111111111111111111111111111111");
        line.setFieldValue(Registro0150.NOME, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        line.setFieldValue(Registro0150.COD_PAIS, 11111l);
        line.setFieldValue(Registro0150.CNPJ, 1111111111111l);
        line.setFieldValue(Registro0150.CPF, 11111111111l);
        line.setFieldValue(Registro0150.IE, "11111111111111");
        line.setFieldValue(Registro0150.COD_MUN, 1111111l);
        line.setFieldValue(Registro0150.SUFRAMA, "111111111");
        line.setFieldValue(Registro0150.END, "111111111111111111111111111111111111111111111111111111111111");
        line.setFieldValue(Registro0150.NUM1, "11111111111111111111");
        line.setFieldValue(Registro0150.NUM2, "111111111111111111111111111111111111111111111111111111111111");
        line.setFieldValue(Registro0150.BAIRRO, "111111111111111111111111111111111111111111111111111111111111");
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }
}
