package com.feige.springcloud.service;

import com.feige.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
     boolean addDept(Dept dept);
     Dept queryById(Long id);
     List<Dept> queryAll();
}
