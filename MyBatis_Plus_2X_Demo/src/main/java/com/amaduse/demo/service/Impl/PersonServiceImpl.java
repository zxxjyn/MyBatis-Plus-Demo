package com.amaduse.demo.service.Impl;

import com.amaduse.demo.entity.Person;
import com.amaduse.demo.dao.PersonDao;
import com.amaduse.demo.service.PersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yezifeng
 * @since 2019-02-12
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonDao, Person> implements PersonService {


}
