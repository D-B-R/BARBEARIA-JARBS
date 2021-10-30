
package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

// Nao esquecer de importar o classe 
public class Main {
    
  public static void main(String[] args){
      String nome = "tiago";
      System.out.println(nome);
      Servico servico = new Servico(1, "barba", 30);
      
      System.out.println(servico.getDescricao());
      System.out.println(servico.getValor());
      
      
    Cliente cliente = new Cliente(1, "daniel", "rua nome", "787888");
      System.out.println(cliente.getNome());
      
      Usuario usuario = new Usuario(1, "barbeiro", "senha");
      System.out.println(usuario.getNome());
  } 
  

    
    
}
