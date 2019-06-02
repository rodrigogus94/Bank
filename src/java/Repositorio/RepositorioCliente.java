/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import InterfaceRepositorio.Interface;
import Negocio.Cliente;
import java.util.List;
import dao.DaoManagerHiber;

/**
 *
 * @author Rodri
 */
public class RepositorioCliente implements Interface<Cliente, String> {

    @Override
    public void inserir(Cliente g) {
        dao.DaoManagerHiber.persist(g);
    }

    @Override
    public void alterar(Cliente g) {
        dao.DaoManagerHiber.update(g);
    }

    @Override
    public void deletar(Cliente g) {
        dao.DaoManagerHiber.delete(g);
    }

    @Override
    public Cliente recuperar(int id) {
        return (Cliente) dao.DaoManagerHiber.recover("from cliente where id=" + id).get(0);
    }

    @Override
    public List<Cliente> recuperarTodos() {
        return dao.DaoManagerHiber.recover("from cliente");
    }

}
