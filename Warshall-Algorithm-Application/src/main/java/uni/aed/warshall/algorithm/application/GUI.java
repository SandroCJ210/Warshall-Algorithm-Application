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
 * @author Albert
 */
public class GUI extends javax.swing.JFrame {
    
    List<Vertex<Integer>> vertices = new ArrayList<>();
    List<Edge<Integer>> edges = new ArrayList<>();
    int[][] matrix;
            
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
        PathsButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        PathsRepresentation = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("NODOS");

        jLabel2.setText("ARISTAS");

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

        AdyacencyButton.setText("M. Adyacencia");
        AdyacencyButton.setFocusPainted(false);
        AdyacencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdyacencyButtonActionPerformed(evt);
            }
        });

        PathsButton.setText("M. Rutas");
        PathsButton.setFocusPainted(false);
        PathsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PathsButtonActionPerformed(evt);
            }
        });

        PathsRepresentation.setColumns(20);
        PathsRepresentation.setRows(5);
        jScrollPane5.setViewportView(PathsRepresentation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel4))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel5))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AdyacencyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PathsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdyacencyButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNodeButton)
                    .addComponent(PathsButton))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OriginNodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DestinyNodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WeightEdgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(AddEdgeButton)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NodeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NodeInputActionPerformed
        
    }//GEN-LAST:event_NodeInputActionPerformed

    private void AddEdgeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEdgeButtonActionPerformed
        try{
            int node1Value = Integer.parseInt(OriginNodeInput.getText());
            int node2Value = Integer.parseInt(DestinyNodeInput.getText());
            int cost = Integer.parseInt(WeightEdgeInput.getText());
            Vertex<Integer> vertex1 = new Vertex<>(node1Value);
            Vertex<Integer> vertex2 = new Vertex<>(node2Value);
            System.out.println(vertices.contains(vertex1));
            System.out.println(vertices.contains(vertex2));
            if(vertices.contains(vertex1) && vertices.contains(vertex2)){
                
                Vertex<Integer> v1 = vertices.get(vertices.indexOf(vertex1));
                Vertex<Integer> v2 = vertices.get(vertices.indexOf(vertex2));
                
                Edge<Integer> edge = new Edge<>(cost, v1, v2);
                if(!edges.contains(edge)){
                    edges.add(edge);
                    v1.addEdge(edge);
                    EdgesRepresentation.setText(edges.toString());
                    System.out.println(edges.toString());
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
            int nodeValue = Integer.parseInt(NodeInput.getText());
            Vertex<Integer> vertex = new Vertex<>(nodeValue);
            if(!vertices.contains(vertex)){
                vertices.add(vertex);
                NodesRepresentation.setText(vertices.toString());
                System.out.println(vertices.toString());
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
        FWAlgorithm FWA = new FWAlgorithm(dimension);
        matrix = new int[dimension][dimension];
        //int INF = 9999999;
        
        //Rellenando la matriz con infinito y cero en la diagonal por defecto
        for(int i=0; i < dimension; i++){
            for(int j=0; j < dimension; j++){
                if(i==j) matrix[i][j] = 0;
                else matrix[i][j] = FWAlgorithm.INF;
            }
        }
        
        //Rellenando la matriz con los costos de cada nodo
        for(int i=0; i < dimension; i++){
            Vertex<Integer> from = vertices.get(i);
            for(Edge<Integer> e: from.getEdges()){
                int j = e.getToVertex().getValue() - 1;
                matrix[i][j] = e.getCost();
            }                  
        }
        
        /*for(Edge<Integer> e : edges){
            System.out.println(e.toString());
        }*/
        
        //Imprimiendo la matriz en consola y en la GUI
        AdyacencyMatrixRepresentation.setTabSize​(3);
        for(int i=0; i < dimension; i++){
            for(int j=0; j < dimension; j++){
                if(matrix[i][j] == FWAlgorithm.INF){
                    AdyacencyMatrixRepresentation.append("INF" +"\t");
                    System.out.print( "INF  "); 
                }else{
                    AdyacencyMatrixRepresentation.append(matrix[i][j] + "\t");
                   System.out.print(matrix[i][j] + "    ");
                }
            }
            AdyacencyMatrixRepresentation.append("\n");
            System.out.println();
        }
        
        for(Vertex<Integer> v : vertices){
            System.out.println(v.toString());
        }
        
    }//GEN-LAST:event_AdyacencyButtonActionPerformed

    private void PathsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PathsButtonActionPerformed
        // TODO add your handling code here:
        int dimension = vertices.size();
        FWAlgorithm FWA = new FWAlgorithm(dimension);
        int[][] solutionMatrix = FWA.Solve(matrix);
        
        WarshallRepresentation.setTabSize​(3);
        for(int i=0; i < dimension; i++){
            for(int j=0; j < dimension; j++){
                if(solutionMatrix[i][j] == FWAlgorithm.INF){
                   WarshallRepresentation.append("INF" + "\t");
                }else{
                   WarshallRepresentation.append(solutionMatrix[i][j] + "\t");
                }
            }
            WarshallRepresentation.append("\n");
        }
        
    }//GEN-LAST:event_PathsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
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
    private javax.swing.JTextArea WarshallRepresentation;
    private javax.swing.JTextField WeightEdgeInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
