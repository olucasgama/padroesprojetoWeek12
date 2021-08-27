package padroescriacao.abstractfactory;

public class Funcionario {

    private NotaFiscal nfe;
    private NotaFiscal nfse;
    private NotaFiscal nfce;

    public Funcionario(FabricaAbstrata fabricaAbstrata) {
        this.nfe = fabricaAbstrata.criarNFe();
        this.nfse = fabricaAbstrata.criarNFSe();
        this.nfce = fabricaAbstrata.criarNFCe();
    }

    public String emitirNFe(){
        return this.nfe.emitir();
    }

    public String emitirNFSe(){
        return this.nfse.emitir();
    }

    public String emitirNFCe(){
        return this.nfce.emitir();
    }
}
