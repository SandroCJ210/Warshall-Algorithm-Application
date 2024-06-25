/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.warshall.algorithm.application;

/**
 *
 * @author Albert
 */
public class FWAlgorithm {
    final static double INF = Double.POSITIVE_INFINITY;
    public int V;
    public double[][] routes;
    public double[][] dist;
    
    //Constructor
    public FWAlgorithm(int nodes){
        V = nodes;
    }
    
    //Algoritmo Floyd-Warshall
    public double[][] Solve(double graph[][]) {
        dist = new double[V][V];
        routes = new double[V][V];
        int i, j, k;

        // Inicializar la matriz de distancias
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        // Actualizar la matriz de distancias
        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                        routes[i][j] = k;
                    }
                }
            }
        }

        // Imprimir la matriz de distancias
        PrintSolution(dist);
        return dist;
    }
    
    //Imprime la matriz solucion
    public void PrintSolution(double dist[][]) {
        System.out.println("La matriz de distancias más cortas entre cada par de vértices es:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (dist[i][j] == INF)
                    System.out.print("INF  ");
                else
                    System.out.print((int)dist[i][j] + "    ");
            }
            System.out.println();
        }
    }
    
    //Imprime los nodos conectados
    public void PrintNodes(double graph[][]){
        for(int i=0; i < V; i++){
            for(int j=0; j < V; j++){
                if(graph[i][j] != INF && graph[i][j] != 0)
                    System.out.println("Node " + i + " -> Node " + j);   
            }
        }
    }
    
    //Imprime la matriz de rutas
    public void PrintRoutesMatrix(){
        System.out.println("Matriz de rutas:");
        for(int i=0; i < V; i++){
            for(int j=0; j < V; j++)
                System.out.print((int)routes[i][j] + "    ");
            System.out.println();
        }
    }
}
