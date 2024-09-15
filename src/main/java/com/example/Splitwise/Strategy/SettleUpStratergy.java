package com.example.Splitwise.Strategy;

import com.example.Splitwise.Modules.Expense;
import com.example.Splitwise.Modules.User;

import java.util.List;

public interface SettleUpStratergy {
    public List<Expense> Settling(List<Expense>userExpenses);
}
