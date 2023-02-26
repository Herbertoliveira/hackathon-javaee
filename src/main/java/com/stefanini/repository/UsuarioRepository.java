package com.stefanini.repository;

import com.stefanini.dao.GenericDAO;
import com.stefanini.model.Usuario;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioRepository extends GenericDAO<Usuario, Long> {

}