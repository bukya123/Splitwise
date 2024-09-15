package com.example.Splitwise.Modules;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserExpense extends BaseModel{
    @ManyToOne
    private Expense expense;
    @ManyToOne
    private User user;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private UserExpenseType userExpenseType;
}
