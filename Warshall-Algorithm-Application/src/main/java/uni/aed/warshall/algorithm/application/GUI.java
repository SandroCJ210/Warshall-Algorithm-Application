/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uni.aed.warshall.algorithm.application;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import uni.aed.graphs.Edge;
import uni.aed.graphs.Graph;
import uni.aed.graphs.Vertex;

/**
 *
 * @author Sandro, Gabriel, Albert
 */
public class GUI extends javax.swing.JFrame {
    
    List<Vertex<Integer>> vertices = new ArrayList<>(); //Lista de vertices
    List<Edge<Integer>> edges = new ArrayList<>();  //Lista de aristas
    double[][] adyacencyMatrix;  //Matriz de adyacencia
    int nodesCounter = 1;
    FWAlgorithm FWA;
    
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NodeInput = new javax.swing.JTextField();
        AddNodeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AddEdgeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        NodesRepresentation = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        WeightEdgeInput = new javax.swing.JTextField();
        OriginNodeInput = new javax.swing.JTextField();
        DestinyNodeInput = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        EdgesRepresentation = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        WarshallRepresentation = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        AdyacencyMatrixRepresentation = new javax.swing.JTextArea();
        AdyacencyButton = new javax.swing.JButton();
        WarshallButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        PathsRepresentation = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PathsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("CIUDAD");

        jLabel2.setText("CAMINO");

        NodeInput.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        NodeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NodeInputActionPerformed(evt);
            }
        });

        AddNodeButton.setText("Agregar");
        AddNodeButton.setFocusPainted(false);
        AddNodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNodeButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Origen:");

        jLabel4.setText("Destino:");

        AddEdgeButton.setText("Agregar");
        AddEdgeButton.setFocusPainted(false);
        AddEdgeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEdgeButtonActionPerformed(evt);
            }
        });

        NodesRepresentation.setEditable(false);
        NodesRepresentation.setColumns(20);
        NodesRepresentation.setRows(5);
        jScrollPane1.setViewportView(NodesRepresentation);

        jLabel5.setText("Peso:");

        WeightEdgeInput.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        WeightEdgeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightEdgeInputActionPerformed(evt);
            }
        });

        OriginNodeInput.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        OriginNodeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OriginNodeInputActionPerformed(evt);
            }
        });

        DestinyNodeInput.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        EdgesRepresentation.setEditable(false);
        EdgesRepresentation.setColumns(20);
        EdgesRepresentation.setRows(5);
        jScrollPane2.setViewportView(EdgesRepresentation);

        WarshallRepresentation.setEditable(false);
        WarshallRepresentation.setColumns(20);
        WarshallRepresentation.setRows(5);
        jScrollPane3.setViewportView(WarshallRepresentation);

        AdyacencyMatrixRepresentation.setEditable(false);
        AdyacencyMatrixRepresentation.setColumns(20);
        AdyacencyMatrixRepresentation.setRows(5);
        jScrollPane4.setViewportView(AdyacencyMatrixRepresentation);

        AdyacencyButton.setText("Calcular");
        AdyacencyButton.setFocusPainted(false);
        AdyacencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdyacencyButtonActionPerformed(evt);
            }
        });

        WarshallButton.setText("Aplicar");
        WarshallButton.setFocusPainted(false);
        WarshallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarshallButtonActionPerformed(evt);
            }
        });

        PathsRepresentation.setEditable(false);
        PathsRepresentation.setColumns(20);
        PathsRepresentation.setRows(5);
        jScrollPane5.setViewportView(PathsRepresentation);

        jLabel6.setText("Ciudades");

        jLabel7.setText("Distancias");

        jLabel8.setText("Matriz de adyacencia");

        jLabel9.setText("Matriz de distancias mínimas");

        jLabel10.setText("OPCIONES");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setText("Rutas de distancia mínima entre cada ciudad");

        jLabel12.setText("Matriz de adyacencia");

        jLabel13.setText("Algoritmo Floyd-Warshall");

        jLabel14.setText("Rutas mínimas");

        PathsButton.setText("Mostrar");
        PathsButton.setFocusPainted(false);
        PathsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PathsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddNodeButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NodeInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(OriginNodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DestinyNodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(WeightEdgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AddEdgeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(jLabel5))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(14, 14, 14)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(33, 33, 33)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(AdyacencyButton))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(WarshallButton)
                                    .addComponent(PathsButton))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(55, 55, 55))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AdyacencyButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WarshallButton)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PathsButton)
                                .addGap(108, 108, 108))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddNodeButton)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OriginNodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DestinyNodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(WeightEdgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AddEdgeButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NodeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeInputActionPerformed
        
    }//GEN-LAST:event_NodeInputActionPerformed

    private void AddEdgeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEdgeButtonActionPerformed
        try{
            String cityName1 = OriginNodeInput.getText();
            String cityName2 = DestinyNodeInput.getText();
            //int node1Value = Integer.parseInt(OriginNodeInput.getText());
            //int node2Value = Integer.parseInt(DestinyNodeInput.getText());
            int cost = Integer.parseInt(WeightEdgeInput.getText());
            Vertex<Integer> vertex1 = new Vertex<>(cityName1);
            Vertex<Integer> vertex2 = new Vertex<>(cityName2);
            /*System.out.println(vertices.contains(vertex1));
            System.out.println(vertices.contains(vertex2));*/
            if(vertices.contains(vertex1) && vertices.contains(vertex2)){
                
                Vertex<Integer> v1 = vertices.get(vertices.indexOf(vertex1));
                Vertex<Integer> v2 = vertices.get(vertices.indexOf(vertex2));
                
                Edge<Integer> edge = new Edge<>(cost, v1, v2);
                if(!edges.contains(edge)){
                    edges.add(edge);
                    v1.addEdge(edge);
                    EdgesRepresentation.setText(PrintEdges());
                    System.out.println(PrintEdges());
                }else{
                    JOptionPane.showMessageDialog(null,"La arista ya existe","Error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Alguno de los vertices no existe","Error",JOptionPane.ERROR_MESSAGE);
            }
            OriginNodeInput.setText("");
            DestinyNodeInput.setText("");
            WeightEdgeInput.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Entrada invalida","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddEdgeButtonActionPerformed

    private void OriginNodeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OriginNodeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OriginNodeInputActionPerformed

    private void AddNodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNodeButtonActionPerformed
        try{
            int nodeValue = nodesCounter;
            nodesCounter += 1;
            String city = NodeInput.getText();
            Vertex<Integer> vertex = new Vertex<>(nodeValue,city);
            if(!vertices.contains(vertex)){
                vertices.add(vertex);
                NodesRepresentation.setText(PrintNodes());
                System.out.println(PrintNodes());
            }else{
                JOptionPane.showMessageDialog(null,"El nodo ya existe","Error",JOptionPane.ERROR_MESSAGE);
            }
            NodeInput.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Entrada invalida","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_AddNodeButtonActionPerformed

    private void WeightEdgeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeightEdgeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WeightEdgeInputActionPerformed

    private void AdyacencyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdyacencyButtonActionPerformed
        int dimension = vertices.size();
        adyacencyMatrix = new double[dimension][dimension];
        
        //Rellenando la matriz con infinito y cero en la diagonal por defecto
        for(int i=0; i < dimension; i++){
            for(int j=0; j < dimension; j++){
                if(i==j) adyacencyMatrix[i][j] = 0;
                else adyacencyMatrix[i][j] = FWAlgorithm.INF;
            }
        }
        
        //Rellenando la matriz con los costos de cada nodo
        for(int i=0; i < dimension; i++){
            Vertex<Integer> from = vertices.get(i);
            for(Edge<Integer> e: from.getEdges()){
                int j = e.getToVertex().getValue() - 1;
                adyacencyMatrix[i][j] = e.getCost();
            }                  
        }
        
        //Imprimiendo la matriz en consola y en la GUI
        String formatted ;
        AdyacencyMatrixRepresentation.setTabSize​(3);
        for(int i=0; i < dimension; i++){
            for(int j=0; j < dimension; j++){
                if(adyacencyMatrix[i][j] == FWAlgorithm.INF){
                    formatted = String.format("%5s","INF");
                    AdyacencyMatrixRepresentation.append(formatted+"\t");
                    System.out.print(formatted + " "); 
                }else{
                    formatted = String.format("%5s", (int)adyacencyMatrix[i][j]);
                    AdyacencyMatrixRepresentation.append(formatted + "\t");
                   System.out.print(formatted + "    ");
                }
            }
            AdyacencyMatrixRepresentation.append("\n");
            System.out.println();
        }
        
    }//GEN-LAST:event_AdyacencyButtonActionPerformed

    private void WarshallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarshallButtonActionPerformed

        int dimension = vertices.size();
        FWA = new FWAlgorithm(dimension);
        double[][] warshallMatrix = FWA.Solve(adyacencyMatrix);
        String formatted;
        
        WarshallRepresentation.setTabSize​(3);
        for(int i=0; i < dimension; i++){
            for(int j=0; j < dimension; j++){
                if(warshallMatrix[i][j] == FWAlgorithm.INF){
                    formatted = String.format("%5s", "INF");
                    WarshallRepresentation.append(formatted + "\t");
                }else{
                    formatted = String.format("%5s",(int)warshallMatrix[i][j]);
                   WarshallRepresentation.append(formatted + "\t");
                }
            }
            WarshallRepresentation.append("\n");
        }
        
    }//GEN-LAST:event_WarshallButtonActionPerformed

    private void PathsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PathsButtonActionPerformed
        // TODO add your handling code here:
        double[][] routesMatrix = FWA.routesMatrix;
        double[][] warshallMatrix = FWA.warshallMatrix;
        
        //String minimumRoutes = "";
        for(int i=0; i < vertices.size(); i++){
            for(int j=0; j < vertices.size(); j++){
                Vertex<Integer> originVertex = SearchVertexByValue(i+1);
                Vertex<Integer> destinyVertex = SearchVertexByValue(j+1);
                PathsRepresentation.append(originVertex.getCityName() + " -> ");
                //minimumRoutes += (originVertex.getCityName() + " -> ");
                FWA.Routes(i,j,vertices,PathsRepresentation);
                //minimumRoutes += (destinyVertex.getCityName() + " = " + FWA.warshallMatrix[i][j] + "\n");
                PathsRepresentation.append(destinyVertex.getCityName() + " = " + (int)FWA.warshallMatrix[i][j] + "\n");

            }
            PathsRepresentation.append("\n");
        }
        
        
    }//GEN-LAST:event_PathsButtonActionPerformed

    private String PrintNodes(){
        String result = "";
        for(Vertex<Integer> v : vertices)
            result += v.toString();
        return result;
    }
    
    private String PrintEdges(){
        String result = "";
        for(Edge<Integer> e : edges)
            result += e.toString();
        return result;
    }
    
    private Vertex<Integer> SearchVertexByValue(Integer value){
        for(Vertex<Integer> v : vertices){
            if(v.getValue().equals(value)) return v;
        }
        return null;
    }
    
    public static void main(String[] args){
        GUI gui = new GUI();
        gui.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEdgeButton;
    private javax.swing.JButton AddNodeButton;
    private javax.swing.JButton AdyacencyButton;
    private javax.swing.JTextArea AdyacencyMatrixRepresentation;
    private javax.swing.JTextField DestinyNodeInput;
    private javax.swing.JTextArea EdgesRepresentation;
    private javax.swing.JTextField NodeInput;
    private javax.swing.JTextArea NodesRepresentation;
    private javax.swing.JTextField OriginNodeInput;
    private javax.swing.JButton PathsButton;
    private javax.swing.JTextArea PathsRepresentation;
    private javax.swing.JButton WarshallButton;
    private javax.swing.JTextArea WarshallRepresentation;
    private javax.swing.JTextField WeightEdgeInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
