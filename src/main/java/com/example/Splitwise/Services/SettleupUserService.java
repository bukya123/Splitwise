package com.example.Splitwise.Services;

import com.example.Splitwise.Exceptions.UserNotFoundException;
import com.example.Splitwise.Modules.Expense;
import com.example.Splitwise.Modules.User;
import com.example.Splitwise.Modules.UserExpense;
import com.example.Splitwise.Repositories.UserExpenseRepository;
import com.example.Splitwise.Repositories.UserRepository;
import com.example.Splitwise.Strategy.SettleUpStratergy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;


@Service
public class SettleupUserService {
    private UserRepository userRepository;
    private UserExpenseRepository userExpenseRepository;
    private SettleUpStratergy settleUpStratergy;

    @Autowired
    public SettleupUserService (UserRepository userRepository,UserExpenseRepository userExpenseRepository,SettleUpStratergy settleUpStratergy){
        this.userRepository=userRepository;
        this.userExpenseRepository=userExpenseRepository;
        this.settleUpStratergy=settleUpStratergy;

    }
    public User SettleUserService (long userId) throws UserNotFoundException {
        Optional<User> userOptional=userRepository.findById(userId);
        if(userOptional.isEmpty()){
            throw new UserNotFoundException("user not found");
        }
        User user=userOptional.get();

        List<UserExpense> userExpenseList=userExpenseRepository.findByUser(user);
        if(userExpenseList.isEmpty()){
            return user;
        }

        HashSet<Expense>ExpenseHashSet=new HashSet<>();
        for(UserExpense userExpense:userExpenseList){
            ExpenseHashSet.add(userExpense.getExpense());
        }
        List<Expense>ExpenseListOfUserInvolved=ExpenseHashSet.stream().toList();
        List<Expense>settledUp=settleUpStratergy.Settling(ExpenseListOfUserInvolved);

    }
}
