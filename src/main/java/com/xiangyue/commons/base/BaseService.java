package com.xiangyue.commons.base;

public interface BaseService<T> {

	void update(T t);

	void insert(T t);

	T getById(Long id);

	void delete(Long id);
}
