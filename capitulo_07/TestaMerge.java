/**
 * TestaMerge
 */
public class TestaMerge {
    
    public static void main(String[] args) {
        Nota[] notasDoAniche = {
            new Nota( "andre", 4 ),
            new Nota( "mariana", 5 ),
            new Nota( "carlos", 8.5 ),
            new Nota( "paulo", 9 )
        };

        Nota[] notasDoAlberto = {
            new Nota( "jonas", 3 ),
            new Nota( "juliana", 6.7 ),
            new Nota( "guilherme", 7 ),
            new Nota( "lucia", 9.3 ),
            new Nota( "ana", 10 )
        };

        Nota[] rank = intercala( notasDoAniche, notasDoAlberto );

        for (Nota nota : rank) {
            System.out.println( nota.getNome() + " " + nota.getValor() );
        }

    }

    public static Nota[] intercala( Nota[] notas1, Nota[] notas2 ){
        int total = notas1.length + notas2.length;
        Nota[] resultado = new Nota[total];
        int atualNotas1 = 0;
        int atualNotas2 = 0;
        int atual = 0;
        while ( atualNotas1 < notas1.length && atualNotas2 < notas2.length ){
            Nota nota1 = notas1[atualNotas1];
            Nota nota2 = notas2[atualDoAlberto];
            if( nota1.getValor() < nota2.getValor() ){
                resultado[atual] = nota1;
                atualNotas1++;
            } else {
                resultado[atual] = nota2;
                atualNotas2++;
            }
            atual++;
        }
        while ( atualNotas1 < notas1.length ){
            resultado[atual] = notas1[atualNotas1];
            atual++;
            atualNotas1++;
        }
        while ( atualNotas2 < notas2.length ) {
            resultado[atual] = notas2[atualNotas2];
            atual++;
            atualNotas2++;
        }
        return resultado;
    }

}