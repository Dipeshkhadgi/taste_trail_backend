package com.online.test_trail.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(
                name = "UNIQUE_user_email",
                columnNames = "email"
        )
})
public class UserEntity implements UserDetails {

    @Id
    @SequenceGenerator(name = "users_seq_gen", sequenceName = "users_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "users_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name = "first_name", nullable = false) // Changed field: fullName to firstName
    private String firstName;

    @Column(name = "last_name", nullable = false)  // Changed field: mobileNo to lastName
    private String lastName;

    @Column(name = "username", nullable = false)  // New field: username
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    private String forgetPasswordOtp;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
