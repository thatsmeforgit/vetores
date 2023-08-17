public class matrizFuncoes {
    public static int[][] matrizNovaInt(int numero_linhas, int numero_colunas){
        int [][] matriz;
        matriz = new int[numero_linhas][numero_colunas];
        return matriz;
    }
    public static String[][] matrizNovaString(int numero_linhas, int numero_colunas){
        String [][] matriz;
        matriz = new String[numero_linhas][numero_colunas];
        return matriz;
    }
    public static void matrizPrintInt (int [][] matriz){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void matrizPrintString (String [][] matriz){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                System.out.printf("%s ", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int [][] matrizPreencherInt(int[][] matriz, int valor){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }
    public static String [][] matrizPreencherString(String[][] matriz, String valor){
        int i, j;
        for(i=0;i<matriz.length;i++){
            for(j=0;j<matriz[0].length;j++){
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }
    public static void main(String[] args){
        int [][] m;
        int n_linhas = 4, n_colunas = 6;
        int valor = 5;

        m = matrizNovaInt(n_linhas, n_colunas);
        m = matrizPreencherInt(m, valor);
    }
}
