package com.bcfou.common.repository;

import com.bcfou.common.entity.VipCrackUrl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

/**
 * @Author: 编程否
 * @Date: 2018/9/12 21:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class VipUrlRepositoryTest {
    @Autowired
    private VipUrlRepository repository;
    @Test
    public void save(){
        VipCrackUrl url = new VipCrackUrl();
        url.setUrl("https://www.jqaaa.com/jx.php?url=");
        VipCrackUrl result = repository.save(url);
        Assert.assertNotNull(result);
    }
    @Test
    @Transactional
    public void delete(){
        VipCrackUrl url = repository.getOne(1);
        Assert.assertNotNull(url);
        repository.delete(url);
    }
}