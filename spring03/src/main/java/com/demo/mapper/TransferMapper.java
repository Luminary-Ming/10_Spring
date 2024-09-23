package com.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
@Mapper
public interface TransferMapper {
    /**
     * 某人收钱
     */
    @Update("update account set money = money + #{money} where name = #{name}")
    public void add(@Param("name") String name, @Param("money") int money);

    /**
     * 给某人转钱
     */
    @Update("update account set money = money - #{money} where name = #{name}")
    public void less(@Param("name") String name, @Param("money") int money);
}
