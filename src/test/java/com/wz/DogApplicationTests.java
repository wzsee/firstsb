package com.wz;

import com.wz.mapper.UserMapper;
import com.wz.pojo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DogApplicationTests {

	@Autowired
	UserMapper userMapper;

	@Test
	public void contextLoads() {

	}
	@Test
	public void findAll(){
		List<Person> list = userMapper.findAll();
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getDate());
	}

}
