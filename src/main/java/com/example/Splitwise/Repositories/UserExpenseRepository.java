package com.example.Splitwise.Repositories;

import com.example.Splitwise.Modules.User;
import com.example.Splitwise.Modules.UserExpense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserExpenseRepository extends JpaRepository<UserExpense,Long > {
    List<UserExpense> findByUser (User user);
}
