
public class Conjunto
{
    /**
     * Criar testes no BlueJ!
     * 
     * [] [] -> []
     * [] [1,2,3] -> [1, 2, 3]
     * [1, 2] [9] -> [1, 2, 9]
     * [1] [1] -> [1, 1]
     */
    public static int[] unir(int[] a, int[] b)
    {
        int[] r = {};
        int ta;
        int tb;
        int tr;
        int i;
        int j;
        //obter o tamanho do primeiro vetor ta
        ta = a.length;
        //obter o tamanho do segundo vetor tb
        tb = b.length;
        //calcular o tamanho do vetor final tr = ta + tb
        tr = ta + tb;
        //criar novo vetor com tamanho tr e armazenar a 
        // referência em r
        r = new int[tr];
        // copiar os dados do vetor a para o vetor r
        for( i = 0; i < ta; i = i + 1 )
        {
            r[i] = a[i];
        }
        // copiar os dados do vetor b para o vetor r
        for( j = 0; j < tb; j = j + 1 )
        {
            r[i] = b[j];
            i = i + 1;
        }        
        return r;
    }
}
