
public class Conjunto
{
    /**
     * Criar testes no BlueJ!
     * 
     * [] [] -> []
     * [] [1,2,3] -> [1, 2, 3]
     * [1, 2] [9] -> [1, 2, 9]
     * [1] [1] -> [1, 1]
     * 
     * 
     * [1, 2] [9] -> [1, 2, 9]
     *  0  1   0      0  1  2
     * 
     * a = [1, 2]
     * b = [9]
     * 
     * ta = 2
     * tb = 1
     * tr = 2 + 1 = 3
     * r = [0, 0, 0]
     * i = 0, 1, *2*
     * for
     *   r[0] = a[0]
     *   r[1] = a[1]
     * j = 0, *1*
     * for
     *   r[2] = b[0]
     * r = [1, 2, 9]
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
