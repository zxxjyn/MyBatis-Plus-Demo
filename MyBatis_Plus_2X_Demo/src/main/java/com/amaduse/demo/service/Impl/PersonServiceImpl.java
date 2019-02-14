package com.amaduse.demo.service.Impl;

import com.amaduse.demo.entity.Person;
import com.amaduse.demo.dao.PersonDao;
import com.amaduse.demo.service.PersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yezifeng
 * @since 2019-02-12
 */
@Service("PersonService")
@Transactional
public class PersonServiceImpl extends ServiceImpl<PersonDao, Person> implements PersonService {


}
