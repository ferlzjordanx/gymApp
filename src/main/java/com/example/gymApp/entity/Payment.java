package com.example.gymApp.entity;


import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class Payment {
    double amount;
    LocalDate paymentDate;
    Member member;

    public boolean updatePayment(Member member){

        member.fee = member.fee - this.amount;
        paymentDate = LocalDate.now();
        return true;

    }

}
