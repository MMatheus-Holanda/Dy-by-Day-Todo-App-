/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.ButtonColumnCell;
import util.DeadlineColumnCell;
import util.TaskTableModel;


public class MainScreen extends javax.swing.JFrame {

    ProjectController projectController;
    TaskController taskController;
    
    DefaultListModel projectModel;
    TaskTableModel tasksModel;
    
    public MainScreen() {
        initComponents();                
        initDataController();
        initComponentesModel(); 
        decorateTableTask(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableTask = new javax.swing.JTable();
        PainelToolBar = new javax.swing.JPanel();
        ToolBarTitle = new javax.swing.JLabel();
        ToolBarSubTitle = new javax.swing.JLabel();
        PainelProjetos = new javax.swing.JPanel();
        TitleProjeto = new javax.swing.JLabel();
        AddProjeto = new javax.swing.JLabel();
        PainelTarefas = new javax.swing.JPanel();
        TitleTarefas = new javax.swing.JLabel();
        AddTarefas = new javax.swing.JLabel();
        PainelLista = new javax.swing.JPanel();
        ScrollProjetosLista = new javax.swing.JScrollPane();
        ProjectsList = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        ListaVazia = new javax.swing.JPanel();
        ListaVaziaIcon = new javax.swing.JLabel();
        ListaVaziaTitle = new javax.swing.JLabel();
        ListaVaziaSubTitle = new javax.swing.JLabel();

        TableTask.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableTask.setGridColor(new java.awt.Color(255, 255, 255));
        TableTask.setRowHeight(40);
        TableTask.setSelectionBackground(new java.awt.Color(0, 153, 102));
        TableTask.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TableTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTaskMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableTask);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        PainelToolBar.setBackground(new java.awt.Color(0, 153, 102));

        ToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
        ToolBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        ToolBarTitle.setText("Day By Day");

        ToolBarSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ToolBarSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        ToolBarSubTitle.setText("Lembre-se de tudo!");

        javax.swing.GroupLayout PainelToolBarLayout = new javax.swing.GroupLayout(PainelToolBar);
        PainelToolBar.setLayout(PainelToolBarLayout);
        PainelToolBarLayout.setHorizontalGroup(
            PainelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ToolBarSubTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PainelToolBarLayout.setVerticalGroup(
            PainelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelToolBarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(ToolBarTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ToolBarSubTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelProjetos.setBackground(new java.awt.Color(255, 255, 255));
        PainelProjetos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TitleProjeto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleProjeto.setForeground(new java.awt.Color(0, 153, 102));
        TitleProjeto.setText("Projetos");

        AddProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-button.png"))); // NOI18N
        AddProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddProjetoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelProjetosLayout = new javax.swing.GroupLayout(PainelProjetos);
        PainelProjetos.setLayout(PainelProjetosLayout);
        PainelProjetosLayout.setHorizontalGroup(
            PainelProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(AddProjeto)
                .addContainerGap())
        );
        PainelProjetosLayout.setVerticalGroup(
            PainelProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelProjetosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TitleProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PainelTarefas.setBackground(new java.awt.Color(255, 255, 255));
        PainelTarefas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TitleTarefas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TitleTarefas.setForeground(new java.awt.Color(0, 153, 102));
        TitleTarefas.setText("Tarefas");

        AddTarefas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-button.png"))); // NOI18N
        AddTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddTarefasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelTarefasLayout = new javax.swing.GroupLayout(PainelTarefas);
        PainelTarefas.setLayout(PainelTarefasLayout);
        PainelTarefasLayout.setHorizontalGroup(
            PainelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddTarefas)
                .addContainerGap())
        );
        PainelTarefasLayout.setVerticalGroup(
            PainelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TitleTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        PainelLista.setBackground(new java.awt.Color(255, 255, 255));
        PainelLista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ProjectsList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ProjectsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ProjectsList.setToolTipText("");
        ProjectsList.setFixedCellHeight(50);
        ProjectsList.setSelectionBackground(new java.awt.Color(0, 153, 102));
        ProjectsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProjectsListMouseClicked(evt);
            }
        });
        ScrollProjetosLista.setViewportView(ProjectsList);

        javax.swing.GroupLayout PainelListaLayout = new javax.swing.GroupLayout(PainelLista);
        PainelLista.setLayout(PainelListaLayout);
        PainelListaLayout.setHorizontalGroup(
            PainelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollProjetosLista)
        );
        PainelListaLayout.setVerticalGroup(
            PainelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollProjetosLista)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new java.awt.BorderLayout());

        ListaVazia.setBackground(new java.awt.Color(255, 255, 255));

        ListaVaziaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListaVaziaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paper-list.png"))); // NOI18N

        ListaVaziaTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListaVaziaTitle.setForeground(new java.awt.Color(0, 153, 102));
        ListaVaziaTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListaVaziaTitle.setText("Nenhuma tarefa por aqui :)");

        ListaVaziaSubTitle.setForeground(new java.awt.Color(153, 153, 153));
        ListaVaziaSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListaVaziaSubTitle.setText("Clique no botao + para adicionar uma tarefa");

        javax.swing.GroupLayout ListaVaziaLayout = new javax.swing.GroupLayout(ListaVazia);
        ListaVazia.setLayout(ListaVaziaLayout);
        ListaVaziaLayout.setHorizontalGroup(
            ListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ListaVaziaLayout.createSequentialGroup()
                .addGroup(ListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ListaVaziaSubTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                    .addComponent(ListaVaziaTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListaVaziaIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ListaVaziaLayout.setVerticalGroup(
            ListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaVaziaLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(ListaVaziaIcon)
                .addGap(27, 27, 27)
                .addComponent(ListaVaziaTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListaVaziaSubTitle)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jPanel5.add(ListaVazia, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PainelProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddProjetoMouseClicked
        // TODO add your handling code here:
     ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled); 
     projectDialogScreen.setVisible(true);
     
     projectDialogScreen.addWindowListener(new WindowAdapter(){
      @Override
      public void windowClosed(WindowEvent e){
          loadProjects();
      }
     });
    }//GEN-LAST:event_AddProjetoMouseClicked

    private void AddTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddTarefasMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        
        int projectIndex = ProjectsList.getSelectedIndex();
        Project project = (Project)projectModel.get(projectIndex);
        taskDialogScreen.setProject(project);
        
        taskDialogScreen.setVisible(true);
        taskDialogScreen.addWindowListener(new WindowAdapter(){
        
            public void windowClosed(WindowEvent e){
             int projectIndex = ProjectsList.getSelectedIndex();
             Project project = (Project) projectModel.get(projectIndex);
             loadTasks(project.getId());
             
            }
            
        });
        
    
    }//GEN-LAST:event_AddTarefasMouseClicked

    private void TableTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTaskMouseClicked
        // TODO add your handling code here:
       int rowIndex = TableTask.rowAtPoint(evt.getPoint()); 
       int columnIndex = TableTask.columnAtPoint(evt.getPoint()); 
       Task task = tasksModel.getTasks().get(rowIndex);
       
       switch(columnIndex){                    
           case 3:               
               taskController.update(task);
               break;
           case 4:
               break;
           case 5:               
               taskController.removeByid(task.getId());
               tasksModel.getTasks().remove(task);
               
               int projectIndex = ProjectsList.getSelectedIndex();
               Project project = (Project) projectModel.get(projectIndex);
               loadTasks(project.getId());
               break;
           default:    
           
              
       }
               
    }//GEN-LAST:event_TableTaskMouseClicked

    private void ProjectsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectsListMouseClicked
        // TODO add your handling code here:
        int projectIndex = ProjectsList.getSelectedIndex();
        Project project = (Project)projectModel.get(projectIndex);
      loadTasks(project.getId());  
    }//GEN-LAST:event_ProjectsListMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddProjeto;
    private javax.swing.JLabel AddTarefas;
    private javax.swing.JPanel ListaVazia;
    private javax.swing.JLabel ListaVaziaIcon;
    private javax.swing.JLabel ListaVaziaSubTitle;
    private javax.swing.JLabel ListaVaziaTitle;
    private javax.swing.JPanel PainelLista;
    private javax.swing.JPanel PainelProjetos;
    private javax.swing.JPanel PainelTarefas;
    private javax.swing.JPanel PainelToolBar;
    private javax.swing.JList<String> ProjectsList;
    private javax.swing.JScrollPane ScrollProjetosLista;
    private javax.swing.JTable TableTask;
    private javax.swing.JLabel TitleProjeto;
    private javax.swing.JLabel TitleTarefas;
    private javax.swing.JLabel ToolBarSubTitle;
    private javax.swing.JLabel ToolBarTitle;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  public void decorateTableTask(){
  //Customizando o header da table de tarefas    
  TableTask.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
  TableTask.getTableHeader().setBackground(new Color(0,153,102));
  TableTask.getTableHeader().setForeground(new Color(255,255,255));
  
  TableTask.getColumnModel().getColumn(2)
          .setCellRenderer(new DeadlineColumnCell()); 
  
  TableTask.getColumnModel().getColumn(4).setCellRenderer(
          new ButtonColumnCell("edit"));
  TableTask.getColumnModel().getColumn(5).setCellRenderer(
          new ButtonColumnCell("remove"));



  // Criando um sort automatico p/ as colunas da table
  //TableTask.setAutoCreateRowSorter(true);
  }

public void initDataController(){
  projectController = new ProjectController();
  taskController = new TaskController();
}
  
public void initComponentesModel(){
  projectModel = new DefaultListModel();
  loadProjects();
  
  tasksModel = new TaskTableModel();
  TableTask.setModel(tasksModel);
  
  
  if(!projectModel.isEmpty()){
   ProjectsList.setSelectedIndex(0);
   Project project = (Project) projectModel.get(0);
   loadTasks(project.getId());
  }
}

public void loadTasks(int idProject){
List<Task> tasks = taskController.getAll(idProject);
tasksModel.setTasks(tasks);

showTableTask(!tasks.isEmpty());
}

public void showTableTask(boolean hasTasks){
 if (hasTasks){
  if(ListaVazia.isVisible()){
   ListaVazia.setVisible(false);
   jPanel5.remove(ListaVazia);
  } 
   
   jPanel5.add(jScrollPane1);
   jScrollPane1.setVisible(true);
   jScrollPane1.setSize(jPanel5.getWidth(), jPanel5.getHeight());
 } else {
  if(jScrollPane1.isVisible()){
     jScrollPane1.setVisible(false);
     jPanel5.remove(jScrollPane1);
  }
  
  jPanel5.add(ListaVazia);
  ListaVazia.setVisible(true);
  ListaVazia.setSize(jPanel5.getWidth(), jPanel5.getHeight());
 } 
}



public void loadProjects(){
  List<Project> projects = projectController.getAll();
  
  projectModel.clear();
  
  for (int i = 0; i < projects.size(); i++){    
      Project project = projects.get(i);
      projectModel.addElement(project);
  }
  ProjectsList.setModel(projectModel);  
  }

}
