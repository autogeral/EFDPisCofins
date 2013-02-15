
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 25/11/2011 09:10:44
 * @author Douglas
 */
public class Registro1300 extends LineArchetype {

        //01 - Fixo
        public static String REG = "REG";
        //02
        /**Indicador de Natureza da Retenção na Fonte:
         * 01 - Retenção por Órgãos, Autarquias e Fundações Federais
         * 02 - Retenção por outras Entidades da Administração Pública Federal
         * 03 - Retenção por Pessoas Jurídicas de Direito Privado
         * 04 - Recolhimento por Sociedade Cooperativa
         * 05 - Retenção por Fabricante de Máquinas e Veículos
         * 99 - Outras Retenções
         */
        public static String IND_NAT_RET = "IND_NAT_RET";
        //03 - Período do Recebimento e da Retenção (MM/AAAA)
        public static String PR_REC_RET = "PR_REC_RET";
        //04 - Valor Total da Retenção
        public static String VL_RET_APU = "VL_RET_APU";
        //05 - Valor da Retenção deduzida da Contribuição devida no 
        //período da escrituração e em períodos anteriores.
        public static String VL_RET_DED = "VL_RET_DED";
        //06 - Valor da Retenção utilizada mediante Pedido de Restituição.
        public static String VL_RET_PER = "VL_RET_PER";
        //07 - Valor da Retenção utilizada mediante Declaração de Compensação.
        public static String VL_RET_DCOMP = "VL_RET_DCOMP";
        //08 - Saldo de Retenção a utilizar em períodos de apuração futuros (04 – 05 - 06 - 07).
        public static String SLD_RET = "SLD_RET";


    public Registro1300(){
        setName("Controle dos Valores Retidos na Fonte – PIS/PASEP");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fdm = new FieldDecimalMaximumLengthArchetype(15,2);
        fdm.setFormat(fw);
        
        //01
        addFieldArchetype(REG, new FieldDefaultArchetype("1300"));
        //02
        addFieldArchetype(IND_NAT_RET, new FieldIntegerFixedLengthArchetype(2));
        //03
        addFieldArchetype(PR_REC_RET, new FieldDateFixedLengthArchetype("MMyyyy"));
        //04
        addFieldArchetype(VL_RET_APU , fdm);
        //05
        addFieldArchetype(VL_RET_DED, fdm);
        //06
        addFieldArchetype(VL_RET_PER, fdm);
        //07
        addFieldArchetype(VL_RET_DCOMP, fdm);
        //08
        addFieldArchetype(SLD_RET, fdm);

    }

}