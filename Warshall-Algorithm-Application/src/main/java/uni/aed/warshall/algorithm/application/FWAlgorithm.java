/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni.aed.warshall.algorithm.application;

import java.util.List;
import javax.swing.JTextArea;
import uni.aed.graphs.Vertex;

/**
 *
 * @author Sandro, Gabriel, Albert
 */
public class FWAlgorithm {
    final static double INF = Double.POSITIVE_INFINITY;
    public int V;
    public double[][] routesMatrix;
    public double[][] warshallMatrix;
    
    //Constructor
    public FWAlgorithm(int nodes){
        this.V = nodes;
    }
    
    //Algoritmo Floyd-Warshall
    public double[][] Solve(double adyacencyMatrix[][]) {
        warshallMatrix = new double[V][V];
        routesMatrix = new double[V][V];
        int i, j, k;

        // Inicializar la matriz de distancias
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                warshallMatrix[i][j] = adyacencyMatrix[i][j];
        
        //Inicializar la matriz de rutas
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                routesMatrix[i][j] = j + 1;

        // Actualizar la matriz de distancias
        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {
                    if (warshallMatrix[i][k] + warshallMatrix[k][j] < warshallMatrix[i][j]){
                        warshallMatrix[i][j] = warshallMatrix[i][k] + warshallMatrix[k][j];
                        routesMatrix[i][j] = k + 1;
                    }
                }
            }
        }

        // Imprimir la matriz de distancias
        PrintSolution(warshallMatrix);
        PrintSolution(routesMatrix);
        PrintRoutesMatrix();
        return warshallMatrix;
    }
    
    //Imprime la matriz solucion
    public void PrintSolution(double matrix[][]) {
        System.out.println("La matriz de distancias más cortas entre cada par de vértices es:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (matrix[i][j] == INF)
                    System.out.print("INF  ");
                else
                    System.out.print((int)matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
    
    //Imprime la matriz de rutas
    public void PrintRoutesMatrix(){
        System.out.println("Matriz de rutas:");
        for(int i=0; i < V; i++){
            for(int j=0; j < V; j++)
                System.out.print((int)routesMatrix[i][j] + "    ");
            System.out.println();
        }
    }
    
    public void Routes(int i, int j){
        int k = (int)routesMatrix[i][j];
        if(k-1==j){
            return;
        }
        Routes(i,k-1);
        System.out.print(k + "  ");
        Routes(k-1,j);
    }
    
    public void Routes(int i, int j, List<Vertex<Integer>> vertices, JTextArea textArea){
        int k = (int)routesMatrix[i][j];
        if(k-1==j){
            return;
        }
        Routes(i,k-1,vertices,textArea);
        Vertex<Integer> v = SearchVertexByValue(k,vertices);
        System.out.print(v.getCityName() + "  ");
        textArea.append(v.getCityName() + " -> ");
        Routes(k-1,j,vertices,textArea);
    }
    
    private Vertex<Integer> SearchVertexByValue(Integer value, List<Vertex<Integer>> vertices){
        for(Vertex<Integer> v : vertices){
            if(v.getValue().equals(value)) return v;
        }
        return null;
    }
}
