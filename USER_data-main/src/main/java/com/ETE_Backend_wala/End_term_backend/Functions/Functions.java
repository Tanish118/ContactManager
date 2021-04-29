package com.ETE_Backend_wala.End_term_backend.Functions;

import com.ETE_Backend_wala.End_term_backend.CreateDB.User;
import com.ETE_Backend_wala.End_term_backend.Respository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Functions {


    @Autowired
    public UserRepo userrepo;

    public boolean adduser(User user)
    {

        if(this.userrepo.existsById(user.getEmail())){
            return false;
        }
        else{
            try {
                this.userrepo.save(user);
            }
            catch (Exception e)
            {
                return false;
            }
            return true;
        }

    }
    public List<User> getallusers()
    {
//        List<User> userlist=userrepo.findAll();
//
        return (List<User>) this.userrepo.findAll();
    }

    public void deleteuser(String email)
    {
         this.userrepo.deleteById(email);
    }

    public void update(User user)
    {
            this.userrepo.save(user);


    }
}

