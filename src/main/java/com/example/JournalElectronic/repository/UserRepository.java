package com.example.JournalElectronic.repository;

import com.example.JournalElectronic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

}
