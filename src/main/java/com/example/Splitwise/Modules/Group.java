package com.example.Splitwise.Modules;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name="groups")
public class Group extends BaseModel{
    private String groupName;
    @ManyToMany
    private List<User> userList;
    @OneToMany
    private List<Expense> expenseList;
}
