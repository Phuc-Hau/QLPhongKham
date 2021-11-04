/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlpk.dao;

import java.util.List;


public abstract class PhongKhamDao<E,K> {

    
    
    abstract public void insert(E entity);
    
    abstract public void update(E entity);
    
    abstract public void detele(K id);
    
    abstract public E selectByID(K id);
    
    abstract public List<E> selectAll();
    
    abstract protected List<E> selectBySql(String sql, Object...args);
}
