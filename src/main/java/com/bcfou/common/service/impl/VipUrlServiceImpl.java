package com.bcfou.common.service.impl;

import com.bcfou.common.entity.VipCrackUrl;
import com.bcfou.common.repository.VipUrlRepository;
import com.bcfou.common.service.VipUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 编程否
 * @Date: 2018/9/12 20:58
 */
@Service
public class VipUrlServiceImpl implements VipUrlService {
    @Autowired
    private VipUrlRepository repository;
    @Override
    public List<VipCrackUrl> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<VipCrackUrl> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public VipCrackUrl findById(Object obj) {
        return repository.getOne((Integer) obj);
    }

    @Override
    public VipCrackUrl save(VipCrackUrl obj) {
        return repository.save(obj);
    }

    @Override
    public void delete(VipCrackUrl obj) {
        repository.delete(obj);
    }


}
