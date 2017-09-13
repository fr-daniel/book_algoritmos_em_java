/**
 * ProdutoMaisBarato
 */
public class ProdutoMaisBarato {

    public static void main(String[] args) {
        /*
        Produto produtos[] = new Produto[5];
        produtos[0] = new Produto( "Lamborghini", 1000000 );
        produtos[1] = new Produto( "Jipe", 46000 );
        produtos[2] = new Produto( "Brasília", 16000 );
        produtos[3] = new Produto( "Smart", 46000 );
        produtos[4] = new Produto( "Fusca", 17000 );
        
        int maisBarato = 0;
        for( int atual = 0; atual <= 4; atual++ ){
            if( produtos[atual].getPreco() < produtos[maisBarato].getPreco() ){
                maisBarato = atual;
            }
        }
        */

        Produto produtos[] = {
            new Produto( "Lamborghini", 1000000 ),
            new Produto( "Jipe", 46000 ),
            new Produto( "Brasília", 16000 ),
            new Produto( "Smart", 46000 ),
            new Produto( "Fusca", 17000 )
        };

        int maisBarato = buscaMenor( produtos, 0, 4 );

        System.out.println( "O carro mais barato é o: " + produtos[maisBarato].getNome() );
        System.out.println( "Preço: " + produtos[maisBarato].getPreco() );

    }

    /* private static int buscaMenor( Produto[] produtos ){
        int maisBarato = 0;
        int termino = produtos.length - 1;
        for( int atual = 0; atual <= termino ; atual++ ){
            if( produtos[atual].getPreco() < produtos[maisBarato].getPreco() ){
                maisBarato = atual;
            }
        }
        return maisBarato;
    } */

    private static int buscaMenor( Produto[] produtos, int inicio, int termino ){
        int maisBarato = 0;
        for( int atual = inicio; atual <= termino ; atual++ ){
            if( produtos[atual].getPreco() < produtos[maisBarato].getPreco() ){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }
    
    
}