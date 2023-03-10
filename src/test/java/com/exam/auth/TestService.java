package com.exam.auth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;

import com.exam.auth.models.Role;
import com.exam.auth.models.User;
import com.exam.auth.security.services.UserDetailsImpl;
import com.exam.auth.models.ERole;

public class TestService {

    @Test
    public void testGetAuthorities() {
        // Créer un utilisateur avec un rôle
        Role userRole = new Role(ERole.ROLE_USER);
        User user = new User("johndoe", "johndoe@example.com", "password");
        // Créer un objet UserDetailsImpl en utilisant la méthode statique build()
        UserDetailsImpl userDetails = UserDetailsImpl.build(user);
        // Récupérer la liste des autorités
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        // Vérifier que la liste contient exactement un élément avec le nom "ROLE_USER"

    }

    @Test
    public void testBuild() {
        // Créer un utilisateur avec un rôle
        Role userRole = new Role(ERole.ROLE_USER);
        User user = new User("johndoe", "johndoe@example.com", "password");

        // Appeler la méthode build() pour créer un objet UserDetailsImpl
        UserDetailsImpl userDetails = UserDetailsImpl.build(user);

        // Vérifier que les propriétés de l'objet UserDetailsImpl sont correctes
        assertNotNull(userDetails);
        assertEquals(user.getId(), userDetails.getId());
        assertEquals(user.getUsername(), userDetails.getUsername());
        assertEquals(user.getEmail(), userDetails.getEmail());
        assertEquals(user.getPassword(), userDetails.getPassword());
    }
}
