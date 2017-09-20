/**
 * TestaIntercalaEmUmArray	
 */
public class TestaIntercalaEmUmArray {
    
    public static void main(String[] args) {
        Nota[] notas = {
            new Nota( "andre", 4 ),
            new Nota( "mariana", 5 ),
            new Nota( "carlos", 8.5 ),
            new Nota( "paulo", 9 ),
            new Nota( "jonas", 3 ),
            new Nota( "juliana", 6.7 ),
            new Nota( "guilherme", 7 ),
            new Nota( "lucia", 9.3 ),
            new Nota( "ana", 10 )
        };

        Nota[] rank = intercala( notas, 1, 4, notas.length );

        for (Nota nota : rank) {
            System.out.println( nota.getNome() + " " + nota.getValor() );
        }

    }

    public static Nota[] intercala( Nota[] notas, int inicial, int miolo, int termino ){
        Nota[] resultado = new Nota[ termino - inicial ];
        int atual = 0;
        int atual1 = inicial;
        int atual2 = miolo;

        while( atual1 < miolo && atual2 < termino ){
            if( notas[atual1].getValor() < notas[atual2].getValor() ){
                resultado[atual] = notas[atual1];
                atual1++;
            } else {
                resultado[atual] = notas[atual2];
                atual2++;
            }
            atual++;
        }

        while( atual1 < miolo ){
            resultado[atual] = notas[atual1];
            atual1++;
            atual++;
        }

        while( atual2 < termino ) {
            resultado[atual] = notas[atual2];
            atual2++;
            atual++;
        }

        for( int contador = 0; contador < atual; contador++ ){
            notas[ inicial + contador ] = resultado[ contador ];
        }

        return notas;
    }

}