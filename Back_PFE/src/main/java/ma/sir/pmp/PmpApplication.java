package ma.sir.pmp;

import ma.sir.pmp.zynerator.security.bean.Permission;
import ma.sir.pmp.zynerator.security.bean.Role;
import ma.sir.pmp.zynerator.security.bean.User;
import ma.sir.pmp.zynerator.security.common.AuthoritiesConstants;
import ma.sir.pmp.zynerator.security.service.facade.RoleService;
import ma.sir.pmp.zynerator.security.service.facade.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;
import java.util.List;

//@EnableFeignClients("ma.zsmart.engflexy.required.facade")
@SpringBootApplication
public class PmpApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(PmpApplication.class, args);

    }


    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
        return (args) -> {
            if(true){

// Role admin

                User userForAdmin = new User("admin");

                Role roleForAdmin = new Role();
                roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
                List<Permission> permissionsForAdmin = new ArrayList<>();
                addPermissionForAdmin(permissionsForAdmin);
                roleForAdmin.setPermissions(permissionsForAdmin);
                if(userForAdmin.getRoles()==null)
                    userForAdmin.setRoles(new ArrayList<>());

                userForAdmin.getRoles().add(roleForAdmin);
                userService.save(userForAdmin);
            }
        };
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("Student.edit"));
        permissions.add(new Permission("Student.list"));
        permissions.add(new Permission("Student.view"));
        permissions.add(new Permission("Student.add"));
        permissions.add(new Permission("Student.delete"));
        permissions.add(new Permission("Module.edit"));
        permissions.add(new Permission("Module.list"));
        permissions.add(new Permission("Module.view"));
        permissions.add(new Permission("Module.add"));
        permissions.add(new Permission("Module.delete"));
        permissions.add(new Permission("Payment.edit"));
        permissions.add(new Permission("Payment.list"));
        permissions.add(new Permission("Payment.view"));
        permissions.add(new Permission("Payment.add"));
        permissions.add(new Permission("Payment.delete"));
        permissions.add(new Permission("ExamGrade.edit"));
        permissions.add(new Permission("ExamGrade.list"));
        permissions.add(new Permission("ExamGrade.view"));
        permissions.add(new Permission("ExamGrade.add"));
        permissions.add(new Permission("ExamGrade.delete"));
        permissions.add(new Permission("Exam.edit"));
        permissions.add(new Permission("Exam.list"));
        permissions.add(new Permission("Exam.view"));
        permissions.add(new Permission("Exam.add"));
        permissions.add(new Permission("Exam.delete"));
        permissions.add(new Permission("SemesterAverage.edit"));
        permissions.add(new Permission("SemesterAverage.list"));
        permissions.add(new Permission("SemesterAverage.view"));
        permissions.add(new Permission("SemesterAverage.add"));
        permissions.add(new Permission("SemesterAverage.delete"));
        permissions.add(new Permission("Semester.edit"));
        permissions.add(new Permission("Semester.list"));
        permissions.add(new Permission("Semester.view"));
        permissions.add(new Permission("Semester.add"));
        permissions.add(new Permission("Semester.delete"));
        permissions.add(new Permission("SemesterModule.edit"));
        permissions.add(new Permission("SemesterModule.list"));
        permissions.add(new Permission("SemesterModule.view"));
        permissions.add(new Permission("SemesterModule.add"));
        permissions.add(new Permission("SemesterModule.delete"));
        permissions.add(new Permission("Training.edit"));
        permissions.add(new Permission("Training.list"));
        permissions.add(new Permission("Training.view"));
        permissions.add(new Permission("Training.add"));
        permissions.add(new Permission("Training.delete"));
        permissions.add(new Permission("ModuleGrade.edit"));
        permissions.add(new Permission("ModuleGrade.list"));
        permissions.add(new Permission("ModuleGrade.view"));
        permissions.add(new Permission("ModuleGrade.add"));
        permissions.add(new Permission("ModuleGrade.delete"));
        permissions.add(new Permission("Diploma.edit"));
        permissions.add(new Permission("Diploma.list"));
        permissions.add(new Permission("Diploma.view"));
        permissions.add(new Permission("Diploma.add"));
        permissions.add(new Permission("Diploma.delete"));
    }

    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }
}