package com.me;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Kayuu-LOCAL-PC on 2016/12/20.
 */
@Data
@AllArgsConstructor
@ToString
public class Book implements Serializable {
    private String bookName;
    private double amount;
    private String auther;
    private Date startDate;
}
