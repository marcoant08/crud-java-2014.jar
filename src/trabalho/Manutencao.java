package trabalho;

import java.awt.Frame;
import java.util.ArrayList;
  
import javax.swing.*; 
import javax.swing.table.DefaultTableModel;
    
public class Manutencao {
    ArrayList<Cliente>  listaCliente = new ArrayList<>();
    private JTable tabela;  
      
    private static final long serialVersionUID = 1L;  
      
    
   public void addCliente(Cliente c)
   {
     listaCliente.add(c);
   }
   
   public void pesquisar(Cliente c, String nome)
   {
       for(int i=0; i<listaCliente.size(); i++)
       {
          if(nome.equals(listaCliente.get(i).getNome()))
          {
    
              
          }
       }
   }
   
   public int totalAdicinado()
   {
         return listaCliente.size();
   }
}
