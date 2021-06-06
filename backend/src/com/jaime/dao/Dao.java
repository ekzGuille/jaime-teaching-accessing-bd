package com.jaime.dao;

import java.util.ArrayList;

public interface Dao<E, I> {

    /*
        CRUD
            Create
            Read
            Update
            Delete
     */

  int create(E bean);

  ArrayList<E> findAll();

  E findById(I id);

  int update(E bean);

  int delete(I id);

}
