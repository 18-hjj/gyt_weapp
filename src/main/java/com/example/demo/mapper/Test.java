package com.example.demo.mapper;

import com.example.demo.bean.Dict;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Test {
    List<Dict> test1();
}
