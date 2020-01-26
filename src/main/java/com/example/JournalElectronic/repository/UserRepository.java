package com.example.JournalElectronic.repository;

import com.example.JournalElectronic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
