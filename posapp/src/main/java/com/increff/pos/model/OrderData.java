package com.increff.pos.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class OrderData{
    private Integer id;
    private Date datetime;

    private String invoicePath;

}
