/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;

/**
 *
 * @author Renee
 */
public class RoleService {
    
    public List<Role> getAll() throws Exception {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAll();
        return roles;
    }
    
    public int get(Role role) throws Exception {
        String name = role.getName();
        if (name.equals("system admin")) {
            return 1;
        } else {
            return 2;
        }
    }
}
