/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Negocio.Cliente;
import Repositorio.RepositorioCliente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Rodri
 */

@ManagedBean
@SessionScoped
public class ControladorCliente {
    
    private RepositorioCliente rc = null;
    private Cliente selectCliente = null;

    public Cliente getSelectCliente() {
        return selectCliente;
    }

    public void setSelectCliente(Cliente selectCliente) {
        this.selectCliente = selectCliente;
    }
  
    
    public ControladorCliente() {
        this.rc = new RepositorioCliente();
    }

    public String inserirCliente(Cliente c){
        
        this.rc.inserir(c);
        return "ApresentaCliente.xhtml";
    }
    
    public String alterarCliente(Cliente c){
        
        this.rc.alterar(c);
        return "ApresentaCliente.xhtml";
    }
    
    public void deletarCliente(Cliente c){
        this.rc.deletar(c);
    }
    
    public Cliente recuperarCliente(int id){
        return this.rc.recuperar(id);
    }
    
    public List<Cliente> recuperarTodosClientes(){
        return this.rc.recuperarTodos();
    }
}
