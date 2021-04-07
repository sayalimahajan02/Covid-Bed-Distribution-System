/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Gayatri
 */
public class AuthorizationEnterprise extends Enterprise {
    
    public AuthorizationEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Authorization);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
