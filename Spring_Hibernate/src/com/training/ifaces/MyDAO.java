package com.training.ifaces;

import java.util.*;

public interface MyDAO<T> {

	public Object add(T t);
	public T find(Object obj);
	public List<T> findAll();
	public T update(T obj);
	public boolean delete(Object obj);
	
}
