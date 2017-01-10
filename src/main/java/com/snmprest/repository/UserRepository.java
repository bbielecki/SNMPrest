package com.snmprest.repository;

import com.snmprest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import static javafx.scene.input.KeyCode.J;

/**
 * Created by Bartłomiej on 28.12.2016.
 */

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
