
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionDataBase;


public class ProjectController {
    
    public void save(Project project) {
   String sql = "INSERT INTO projects (name, description,"
           + "createdAt,updatedAt) VALUES (?, ?, ?, ?)";
   
   Connection connection = null;
   PreparedStatement statement = null;
   
   try {
    connection = ConnectionDataBase.getConnection();
    statement = connection.prepareStatement(sql);  
    
    statement.setString(1, project.getName());
    statement.setString(2, project.getDescription());
    statement.setDate(3, new java.sql.Date(project.getCreatedAt().getTime()));
    statement.setDate(4, new java.sql.Date(project.getUpdatedAt().getTime()));
    statement.execute();
    
    } catch (SQLException ex) {
    throw new RuntimeException("Erro ao salvar o projeto " 
            + ex.getMessage(), ex);
   } finally {
    ConnectionDataBase.closeConnection(connection, statement);
   }
}
    
public void update(Project project){
   String sql = "UPDATE projects SET  name = ?, description = ?, "
   + "createdAt = ?, updatedAt = ? WHERE id = ?";
   
Connection connection = null;
PreparedStatement statement = null;

try{
    //Estabelecendo a conexão ccom o banco de dados
    connection = ConnectionDataBase.getConnection();
    
    //Preparando a query
    statement = connection.prepareStatement(sql);
    
    //Setando os valores no statement
    statement.setString(1, project.getName());
    statement.setString(2, project.getDescription());
    statement.setDate(3, new java.sql.Date(project.getCreatedAt().getTime()));
    statement.setDate(4, new java.sql.Date(project.getUpdatedAt().getTime()));
    statement.setInt(5, project.getId());
    
    //Executando a query
    statement.execute();      
       
   } catch (SQLException ex){
    throw new RuntimeException("Erro ao atualizar o projeto" 
            + ex.getMessage(), ex);
   }           
 }

public void removeByid(int idProject){
    String sql = "DELETE FROM projeccts WHERE id = ?";
    
    Connection connection = null;
    PreparedStatement statement = null; 
    
    try {
        //Criação da conexão ccom o banco de dados
     connection = ConnectionDataBase.getConnection();
     
     //Preparando a query
     statement = connection.prepareStatement(sql);
     
     //Setando os valores
     statement.setInt(1, idProject);
     
     //Executando a query
     statement.execute();
    } catch (SQLException ex){
     throw new RuntimeException("Erro ao deletar o projeto" 
            + ex.getMessage(), ex);
    } finally {
    ConnectionDataBase.closeConnection(connection, statement);
    }        
  }

public List<Project> getAll(){
    String sql = "SELECT * FROM projects";
    
    List<Project> projects = new ArrayList <>();
    
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;  
        
    try {
        //Criando a cconexão ccom o banco de dados
    connection = ConnectionDataBase.getConnection();
    
    //Preparando a query
    statement = connection.prepareStatement(sql);
    
    //Valor retornado pela execução da query
    resultSet =  statement.executeQuery();
   
    //Enquanto houverem valores a serem percorridos no meu resultSet
   while(resultSet.next()){
       
   Project project = new Project();
   
   project.setId(resultSet.getInt("id"));
   project.setName(resultSet.getString("name"));
   project.setDescription(resultSet.getString("description"));
   project.setCreatedAt(resultSet.getDate("createdAt"));
   project.setUpdatedAt(resultSet.getDate("updatedAt"));  
   
   project.add(project);
   }
    
    } catch (SQLException ex) {
    throw new RuntimeException("Erro ao buscar o projeto" 
            + ex.getMessage(), ex);
    } finally {
    ConnectionDataBase.closeConnection(connection, statement, resultSet);
    }    
    return projects;
  }

}