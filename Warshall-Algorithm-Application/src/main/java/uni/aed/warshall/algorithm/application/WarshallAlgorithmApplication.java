/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uni.aed.warshall.algorithm.application;
import static uni.aed.warshall.algorithm.application.FWAlgorithm.INF;

/**
 *
 * @author Sandro, Gabriel, Albert
 */
public class WarshallAlgorithmApplication {

    public static void main(String[] args) {
        FWAlgorithm FWA = new FWAlgorithm(5);
        
        //Grafos de prueba
        double graph1[][] = { {0, 5, INF, 10},
                          {INF, 0, 3, INF},
                          {INF, INF, 0, 1},
                          {INF, INF, INF, 0}
                        };
        double graph2[][] = { {0, 3, INF, 7},
                          {8, 0, 2, INF},
                          {5, INF, 0, 1},
                          {2, INF, INF, 0}
                        };
        double graph3[][] = { {0, 2, INF, -4, INF},
                          {INF, 0, -2, 1, 3},
                          {INF, INF, 0, INF, 1},
                          {INF, INF, INF, 0, 4},
                          {INF, INF, INF, INF, 0}
                        };
        double graph4[][] = {
            {0,10,INF,30,100},
            {INF,0,50,INF,INF},
            {INF,INF,0,INF,10},
            {INF,INF,20,0,60},
            {INF,INF,INF,INF,0}
        };
        double[][] warshall = FWA.Solve(graph4);
        
        /*for(int i=0;i<5;i++){
            for(int j=0; j<5;j++){
                FWA.Routes(i,j);
            }
            System.out.println();
        }*/
        
        FWA.Routes(2,3);

        //FWA.PrintRoutesMatrix();
    }
}
