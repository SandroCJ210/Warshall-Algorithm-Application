/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uni.aed.warshall.algorithm.application;
import static uni.aed.warshall.algorithm.application.FWAlgorithm.INF;

/**
 *
 * @author sandro
 */
public class WarshallAlgorithmApplication {

    public static void main(String[] args) {
        FWAlgorithm FWA = new FWAlgorithm(5);
        
        //Grafos de prueba
        int graph1[][] = { {0, 5, INF, 10},
                          {INF, 0, 3, INF},
                          {INF, INF, 0, 1},
                          {INF, INF, INF, 0}
                        };
        int graph2[][] = { {0, 3, INF, 7},
                          {8, 0, 2, INF},
                          {5, INF, 0, 1},
                          {2, INF, INF, 0}
                        };
        int graph3[][] = { {0, 2, INF, -4, INF},
                          {INF, 0, -2, 1, 3},
                          {INF, INF, 0, INF, 1},
                          {INF, INF, INF, 0, 4},
                          {INF, INF, INF, INF, 0}
                        };
        FWA.PrintNodes(graph3);
        FWA.Solve(graph3);
        FWA.PrintRoutesMatrix();
    }
}
