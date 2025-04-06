package auth_spring.spring_authentication.Seeder;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import auth_spring.spring_authentication.repositories.RoleRepository;

@Component
public class RoleSeeder implements ApplicationListener<ContextRefreshedEvent> {
    private final RoleRepository roleRepository;

    public RoleSeeder(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        this.loadRoles();
    }

    private void loadRoles() {
        // RoleEnum[] roleNames = new RoleEnum[] { RoleEnum.ADMIN,
        // RoleEnum.User };
        // Map<RoleEnum, String> roleDescriptionMap = Map.of(

        // RoleEnum.ADMIN, "Administrator role",
        // RoleEnum.User, "user role");

        // Arrays.stream(roleNames).forEach((roleName) -> {
        // Optional<Role> optionalRole =
        // Optional.ofNullable(roleRepository.findByRole(roleName));

        // optionalRole.ifPresentOrElse(System.out::println, () -> {
        // Role roleToCreate = new Role();

        // roleToCreate.setRole(roleName);
        // roleToCreate.setDescription(roleDescriptionMap.get(roleName));
        // roleRepository.save(roleToCreate);
        // });

        // });
    }
}
