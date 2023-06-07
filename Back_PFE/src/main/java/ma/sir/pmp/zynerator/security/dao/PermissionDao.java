package ma.sir.pmp.zynerator.security.dao;

import ma.sir.pmp.zynerator.security.bean.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionDao extends JpaRepository<Permission, Long> {
    public Permission findByName(String name);
}
