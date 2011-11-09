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
    public void registro0100test() {
        Registro0100 reg = new Registro0100();
        LineModel line = reg.createModel();

        line.setFieldValue(Registro0100.REG, "1323");
        line.setFieldValue(Registro0100.NOME, "fdfs");
        line.setFieldValue(Registro0100.CPF, 1231231231L);
        line.setFieldValue(Registro0100.CRC, "aaaaaa");
        line.setFieldValue(Registro0100.CNPJ, 1111111111L);
        line.setFieldValue(Registro0100.CEP, 2222222L);
        line.setFieldValue(Registro0100.END, "bbbbbbbbbbbbbbb");
        line.setFieldValue(Registro0100.NUM, "ccccccccccc");
        line.setFieldValue(Registro0100.COMPL, "dddddddd");
        line.setFieldValue(Registro0100.BAIRRO, "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        line.setFieldValue(Registro0100.FONE, "EEEEEE");
        line.setFieldValue(Registro0100.FAX, "fffffffff");
        line.setFieldValue(Registro0100.EMAIL, "dddddddd");
        line.setFieldValue(Registro0100.COD_MUN, 123456L);

        StringBuffer sb = line.getRepresentation();
        //   String expected = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx    "+ "1323" + 22222222l + 1111111111111l;
        System.out.print(sb);
        // assertEquals(expected, sb.toString());

    }
}
