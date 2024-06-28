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
        FWAlgorithm FWA = new FWAlgorithm(4);
        
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
        
        double graph5[][] = {
            {0,9,-4,INF},
            {6,0,INF,2},
            {INF,5,0,INF},
            {INF,INF,1,0}
        };
        
        double[][] warshall = FWA.Solve(graph5);
        
        for(int i=0;i<4;i++){
            for(int j=0; j<4;j++){
                System.out.print(i+1 + "  ");
                FWA.Routes(i,j);
                System.out.print(j+1 + "  ");
                System.out.println();
            }
            System.out.println();
        }
        
        //FWA.PrintRoutesMatrix();
    }
}
