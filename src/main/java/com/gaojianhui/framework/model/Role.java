package com.gaojianhui.framework.model;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.FetchType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_role")
public class Role extends BaseEntity {
    private static final long serialVersionUID = 2521986567514905795L;

    @Column(length = 50)
    private String rolename;

    @Column(length = 50)
    private String roletype;       //  类型

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_role_protected_resources",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "protected_resources_id")})
    private Set<ProtectedResource> protectedResources = new HashSet<ProtectedResource>();   // 权限

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Set<ProtectedResource> getProtectedResources() {
        return protectedResources;
    }

    public void setProtectedResources(Set<ProtectedResource> protectedResources) {
        this.protectedResources = protectedResources;
    }

    public String getRoletype() {
        return roletype;
    }

    public void setRoletype(String roletype) {
        this.roletype = roletype;
    }


}
