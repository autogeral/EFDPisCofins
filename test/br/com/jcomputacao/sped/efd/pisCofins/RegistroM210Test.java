package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 22/11/2011 20:26:48
 * @author rafael.galvao
 */
public class RegistroM210Test {
    
    public RegistroM210Test() {
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
     * Test of getNome method, of class RegistroM210.
     */
    @Test
    public void RegistroM210Test()  {
        RegistroM210 reg = new RegistroM210();
        LineModel line = reg.createModel();
        
        //Teste usando a classe ContribuicaoSocialApurada
        //02
        line.setFieldValue(RegistroM210.COD_CONT, String.valueOf(ContribuicaoSocialApurada.Contribuicao_cumulativa_apurada_a_aliquota_basica_Atividade_Imobiliaria.getCodigo()));
        //03
        line.setFieldValue(RegistroM210.VL_REC_BRT, 100000000000.01);
        //04
        line.setFieldValue(RegistroM210.VL_BC_CONT, 100000000000.01);        
        //05
        line.setFieldValue(RegistroM210.ALIQ_PIS, 100000000000.0001);
        //06
        line.setFieldValue(RegistroM210.QUANT_BC_PIS, 100000000000.001);
        //07
        line.setFieldValue(RegistroM210.ALIQ_PIS_QUANT, 100000000000.0001);
        //08
        line.setFieldValue(RegistroM210.VL_CONT_APUR, 100000000000.01);
        //09
        line.setFieldValue(RegistroM210.VL_AJUS_ACRES, 100000000000.01);
        //10
        line.setFieldValue(RegistroM210.VL_AJUS_REDUC, 100000000000.01);        
        //11
        line.setFieldValue(RegistroM210.VL_CONT_DIFER, 100000000000.01);
        //12
        line.setFieldValue(RegistroM210.VL_CONT_DIFER_ANT, 100000000000.01);
        //13
        line.setFieldValue(RegistroM210.VL_CONT_PER, 100000000000.01);
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

	String expected = "|M210|54|100000000000,01|100000000000,01|100000000000,0001|100000000000,001|100000000000,0001|100000000000,01|100000000000,01|100000000000,01|100000000000,01|100000000000,01|100000000000,01|";
	assertEquals (expected, sb.toString());
    }
}
