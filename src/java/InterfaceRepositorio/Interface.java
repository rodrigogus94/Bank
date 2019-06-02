/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceRepositorio;

import java.util.List;

/**
 *
 * @author Rodri
 */
public interface Interface<T, G> {
    public void inserir(T g);
    public void alterar(T g);
    public void deletar(T g);
    public T recuperar(int id);
    public List<T> recuperarTodos();
}
