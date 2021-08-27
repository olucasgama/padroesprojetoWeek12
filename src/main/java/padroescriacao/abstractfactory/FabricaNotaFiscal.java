package padroescriacao.abstractfactory;

public class FabricaNotaFiscal implements FabricaAbstrata {

    @Override
    public NotaFiscal criarNFe() {
        return new NFe();
    }

    @Override
    public NotaFiscal criarNFSe() {
        return new NFSe();
    }

    @Override
    public NotaFiscal criarNFCe() {
        return new NFCe();
    }
}
