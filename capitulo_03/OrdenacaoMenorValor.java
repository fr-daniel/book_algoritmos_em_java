/**
 * OrdenacaoMenorValor
 */
public class OrdenacaoMenorValor {

    public static void main(String[] args) {
        Produto produtos[] = {
            new Produto( "Lamborghini", 1000000 ),
            new Produto( "Jipe", 46000 ),
            new Produto( "Brasília", 16000 ),
            new Produto( "Smart", 46000 ),
            new Produto( "Fusca", 17000 )
        };

        ordenar( produtos, produtos.length);

        for ( Produto produto : produtos ) {
            System.out.println( "Carro: " + produto.getNome() + " Preço: " + produto.getPreco() );
        }

    }

    private static int buscarMenor( Produto[] produtos, int inicio, int termino ){
        int menorPreco = inicio;
        for( int atual = inicio + 1; atual <= termino; atual++ ){
            System.out.println("Comparando " + menorPreco + " com " + atual);
            if( produtos[atual].getPreco() < produtos[menorPreco].getPreco() ){
                menorPreco = atual;
            }
        }
        return menorPreco;
    }
    
    private static void ordenar( Produto[] produtos, int quantidadeDeElementos ){
        quantidadeDeElementos--;
        for( int valorAtual = 0; valorAtual < quantidadeDeElementos; valorAtual++ ){
            System.out.println("Estou na casa: " + valorAtual);
            int menor = buscarMenor( produtos, valorAtual, quantidadeDeElementos );
            Produto produtoAtual = produtos[valorAtual];
            produtos[valorAtual] = produtos[menor];
            produtos[menor] = produtoAtual;
        }
    }

}