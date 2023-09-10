package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    private String orgUniCode;

    private String orgChiName;

    private String induSmaPar;

    private String orgDele;

    private BigDecimal regCap;

    private Date orgEstDate;
}
