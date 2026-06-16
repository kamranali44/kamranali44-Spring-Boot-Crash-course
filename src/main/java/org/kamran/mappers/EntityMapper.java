package org.kamran.mappers;

public interface EntityMapper<T,U> {
    U map(T entity);
    T reverseMap(U entity);
}
