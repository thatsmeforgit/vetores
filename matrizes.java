class matrizes{
    public static void main (String[] args){
        // int[][] v = {{10, 20, 30, 40},
        //              {50, 60, 70, 80},       exemplo 1
        //              {90, 100, 110, 120},
        //              {130, 140, 150, 160}}; esse só precisa do FOR a partir da linha 21
        int[][] matriz;
        // int valor = 10; exemplo 2
        //int valor = 0;  //exercicio 1 com matriz
        int i, j;
        // int n_linhas = 4, n_colunas = 4;
        int n_linhas = 7, n_colunas = 7;

        matriz = new int[n_linhas][n_colunas];

        for(i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
                // matriz[i][j] = valor; exemplo 2
                // valor = valor + 10;
                if(i==0){
                    matriz [i][j] = 1; //linha 0 : 1 1 1 1 1 1 1
                }else{
                    if(i==n_linhas-1){ // "n_linhas - 1" = última linha
                        matriz [i][j] = 1; // 1 1 1 1 1 1 1 
                    }else{
                        if(j==0){
                            matriz [i][j] = 1; //coluna 0 = 1 1 1 1 1 1 1
                        }else{
                            if(j==n_colunas-1){
                                matriz[i][j] = 1; //coluna 6 = 1 1 1 1 1 1 1
                            }else{
                                matriz[i][j] = 9; // essa completa o centro da matriz com 9
                            }
                        }
                    }
                }
            }
        }
        
        for(i=0;i<n_linhas;i++){
            for(j=0;j<n_colunas;j++){
                System.out.printf("%d ", matriz[i][j]); //exemplo 1
            }
            System.out.println();
        }
    }
}