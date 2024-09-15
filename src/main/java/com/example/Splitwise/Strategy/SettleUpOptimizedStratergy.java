package com.example.Splitwise.Strategy;

import com.example.Splitwise.Modules.Expense;
import com.example.Splitwise.Modules.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Component
public class SettleUpOptimizedStratergy implements SettleUpStratergy{
    @Override
    public List<Expense> Settling(List<Expense> userExpenses){

        return null;
    }
}
