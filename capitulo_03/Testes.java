/**
 * Testes
 */
public class Testes {

    public static void main(String[] args) {
        double[] v1 = { 8, 4, 2, 1, 10, 5, 7, 6, 9, 3 } ;
        for (double valor : v1) {
            System.out.println(valor);
        }

        double menor, atual;

        for( int i = 0; i < v1.length - 1; i++ ){
            menor = 0;
            for( int j = i + 1; j <= v1.length - 1; j++ ){
                if ( v1[j] < v1[i]) {
                    menor = v1[i];
                }
            }
            if( menor != 0 ){
                atual = v[i];
                v[i] = v[menor];
                v[menor] = atual;
            }
        }

        System.out.println("\n");
        for (double valor : v1) {
            System.out.println(valor);
        }

    }

}