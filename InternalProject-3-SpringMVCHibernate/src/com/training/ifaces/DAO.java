package com.training.ifaces;

public interface DAO<T> {
	public int add(T t);
	public T find(int key);
}
