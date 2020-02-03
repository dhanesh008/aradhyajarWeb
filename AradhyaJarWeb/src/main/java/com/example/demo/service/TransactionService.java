package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.TransactionEntity;
import com.example.demo.POJO.ResultVo;
import com.example.demo.POJO.TransCustomerVo;

public interface TransactionService {

	List<TransCustomerVo> getcustomerlist(String areauuid);

	ResultVo newTransaction(String accuuid, int jarpick, int botpick, int jardel, int botdel, int amount);

	List<TransactionEntity> getdayTransactionList();

}
