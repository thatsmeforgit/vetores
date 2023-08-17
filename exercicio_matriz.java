import java.util.Scanner;

class matrizes{
    public static void main (String[] args){
        
        int[][] matriz;
        int i,j;
        int n_linhas = 4, n_colunas = 4, cont = 0;
        Scanner sc = new Scanner(System.in);

        matriz = new int[n_linhas][n_colunas];

        for(i=0; i<n_linhas; i++){
            for(j=0; j<n_colunas; j++){
            matriz [i][j] = sc.nextInt(); 
<<<<<<< HEAD
            
            if( matriz [i][j]>=10){
                cont += 1;
            }

            }   
        }

         System.out.printf("%d valores maiores que 10 ", cont); 
=======
                if (matriz [i][j] > 10){
                    cont += 1;
                }
            }   
        }
        
        System.out.printf("%d valores maiores que 10", cont); 
>>>>>>> bccb9108852962af2410f2c18bea0f93a44058b1
    }
}