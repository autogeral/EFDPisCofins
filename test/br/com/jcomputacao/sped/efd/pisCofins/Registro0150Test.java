/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.*;
import static org.junit.Assert.*;

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
    public String linhaRegistro0150Test(){
        Registro0150 reg = new Registro0150();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0150.COD_PART, "Codigo Participante 007");
        //03
        line.setFieldValue(Registro0150.NOME, "Nome pessoal ou empresarial do participante");
        //04
        line.setFieldValue(Registro0150.COD_PAIS, 1058);
        //05
        line.setFieldValue(Registro0150.CNPJ, 11111111111111L);
        //06
        line.setFieldValue(Registro0150.CPF, 22222222222L);
        //07
        line.setFieldValue(Registro0150.IE, "33333333333333");
        //08
        line.setFieldValue(Registro0150.COD_MUN, 1111111L);
        //09
        line.setFieldValue(Registro0150.SUFRAMA, "444444444");
        //10
        line.setFieldValue(Registro0150.END, "Av. Dr. Octaviano Pereira Mendes");
        //11
        line.setFieldValue(Registro0150.NUM1, "33");
        //12
        line.setFieldValue(Registro0150.COMPL, "Primeiro Andar");
        //13
        line.setFieldValue(Registro0150.BAIRRO, "Centro");
        
        StringBuffer sb = line.getRepresentation();
        //System.out.println(sb);
        //String expected = "|0150|Codigo Participante 007|Nome pessoal ou empresarial do participante|01058|11111111111111|22222222222|33333333333333|1111111|444444444|Av. Dr. Octaviano Pereira Mendes|33|Primeiro Andar|Centro|";
        //assertEquals (expected, sb.toString());
        return sb.toString();
    }
}
