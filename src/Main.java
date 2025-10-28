void main() {
    ConsultaCep consultaCep = new ConsultaCep();
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite um número de CEP para consulta:");
    var cep = leitura.nextLine();
    try{
        Endereco novoEndereco = consultaCep.buscaEndereco(cep);
        System.out.println(novoEndereco);
        GeradorArquivo gerador = new GeradorArquivo();
        gerador.salvaJson(novoEndereco);
    }catch (RuntimeException | IOException e){
        System.out.println(e.getMessage());
        System.out.println("Finalizando a aplicação.");
    }

    }


