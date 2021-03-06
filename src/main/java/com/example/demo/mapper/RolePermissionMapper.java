package com.example.demo.mapper;

import com.example.demo.model.RolePermission;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface RolePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated
     */
    @Insert({
        "insert into role_permission (role_id, permission_id)",
        "values (#{roleId,jdbcType=INTEGER}, #{permissionId,jdbcType=INTEGER})"
    })
    int insert(RolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "role_id, permission_id",
        "from role_permission"
    })
    @Results({
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.INTEGER),
        @Result(column="permission_id", property="permissionId", jdbcType=JdbcType.INTEGER)
    })
    List<RolePermission> selectAll();
}