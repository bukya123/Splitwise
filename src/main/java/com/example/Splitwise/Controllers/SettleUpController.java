package com.example.Splitwise.Controllers;

import com.example.Splitwise.DTO.SettleUpRequestDTO;
import com.example.Splitwise.DTO.SettleUpResponseDTO;
import com.example.Splitwise.Services.SettleupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SettleUpController {
    private SettleupUserService settleupUserService;

    @Autowired
    public SettleUpController(SettleupUserService settleupUserService){
        this.settleupUserService=settleupUserService;
    }
    SettleUpResponseDTO settleUser(SettleUpRequestDTO settleUpRequestDTO){
        SettleUpResponseDTO settleUpResponseDTO=new SettleUpResponseDTO();

    }

}
