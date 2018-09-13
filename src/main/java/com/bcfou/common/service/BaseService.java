package com.bcfou.common.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: 编程否
 * @Date: 2018/9/12 20:55
 */
public interface BaseService<T> {
    List<T> findAll();
    Page<T> findAll(Pageable pageable);
    T findById(Object obj);
    T save(T obj);
    void delete(T obj);
}
