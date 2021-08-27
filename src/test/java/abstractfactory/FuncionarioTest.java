package abstractfactory;

import org.junit.jupiter.api.Test;
import padroescriacao.abstractfactory.FabricaAbstrata;
import padroescriacao.abstractfactory.FabricaNotaFiscal;
import padroescriacao.abstractfactory.Funcionario;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void emiteNFe(){
        FabricaAbstrata fabricaAbstrata = new FabricaNotaFiscal();
        Funcionario funcionario = new Funcionario(fabricaAbstrata);
        assertEquals("Nota Fiscal Eletrônica de Produtos ou Mercadorias", funcionario.emitirNFe());
    }

    @Test
    void emiteNFSe(){
        FabricaAbstrata fabricaAbstrata = new FabricaNotaFiscal();
        Funcionario funcionario = new Funcionario(fabricaAbstrata);
        assertEquals("Nota Fiscal Eletrônica de Serviços", funcionario.emitirNFSe());
    }

    @Test
    void emiteNFCe(){
        FabricaAbstrata fabricaAbstrata = new FabricaNotaFiscal();
        Funcionario funcionario = new Funcionario(fabricaAbstrata);
        assertEquals("Nota Fiscal ao Consumidor Eletrônica", funcionario.emitirNFCe());
    }

}
