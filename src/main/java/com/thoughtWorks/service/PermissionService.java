package com.thoughtWorks.service;

import com.thoughtWorks.entity.ActiveUser;
import com.thoughtWorks.entity.Permission;

import java.util.List;
import java.util.Map;

public interface PermissionService {

    ActiveUser getSysUserByUserName(String userName) throws Exception;

    List<Permission> findMenuListByRoleId(int roleId) throws Exception;

    List<Permission> findPermissionListByRoleId(int roleId) throws Exception;

    List<Map<String, String>> getTopMenus(int roleId) throws Exception;

    List<Map<String, String>> getSideMenus(String parentId, String roleId) throws Exception;

    Map<String,Object> getMenus(int roleId) throws Exception;
}