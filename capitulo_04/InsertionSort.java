/**
 * InsertionSort
 */

public class InsertionSort {
    
    public static void main(String[] args) {
        Produto produtos[] = {
            new Produto( "Lamborghini", 1000000 ),
            new Produto( "Jipe", 46000 ),
            new Produto( "Brasília", 16000 ),
            new Produto( "Smart", 46000 ),
            new Produto( "Fusca", 17000 )
        };

        insertionSort( produtos, produtos.length );

        for (Produto produto : produtos) {
            System.out.println("Carro: " + produto.getNome() + " Preço: " + produto.getPreco() );
        }
    }

    public static void insertionSort( Produto[] produtos, int quantidadeDeElementos ){
        for( int atual = 1; atual < quantidadeDeElementos; atual++ ){
            int analise = atual;
            while( analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco() ){
                troca( produtos, analise, analise - 1 );
                analise--;
            }
        }
    }

    public static void troca( Produto[] produtos, int primeiro, int segundo ){
        Produto produtoAnaliseMenos1 = produtos[segundo];
        produtos[segundo] = produtos[primeiro];
        produtos[primeiro] = produtoAnaliseMenos1;
    }

}