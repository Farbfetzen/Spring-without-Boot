package farbfetzen.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, K> {

    List<T> list();

    T create(T t);

    Optional<T> get(K id);

    void update(T t, K id);

    void delete(K id);
}
