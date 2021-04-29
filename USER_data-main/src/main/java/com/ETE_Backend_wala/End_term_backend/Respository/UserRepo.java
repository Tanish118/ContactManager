package com.ETE_Backend_wala.End_term_backend.Respository;

import com.ETE_Backend_wala.End_term_backend.CreateDB.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {

}
