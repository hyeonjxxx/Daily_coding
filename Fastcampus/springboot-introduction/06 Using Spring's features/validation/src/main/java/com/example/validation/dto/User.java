package com.example.validation.dto;


import com.example.validation.annotation.YearMonth;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class User {

    @NotBlank
    private String name;

    @Max(value = 90)
    private int age;

    private String email;
//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지않습니다. 01x-xxx(x)-xxxx")
//    private  String phoneNumber;

//    @YearMonth
    private String reqYearMonth;    // yyyyMM

    @Valid  // 클래스안에 다른 객체가 있고 object 형태면 반드시 @Valid라고 해주어야 검사가 됨
    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReqYearMonth() {
        return reqYearMonth;
    }

    public void setReqYearMonth(String reqYearMonth) {
        this.reqYearMonth = reqYearMonth;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", reqYearMonth='" + reqYearMonth + '\'' +
                ", cars=" + cars +
                '}';
    }

    /*
    // @AssertTrue 사용시  is라는 키워드로 메소드가 시작해야 한다.
    // 재활용이 불가능 >> 중복코드가 많아짐 >> 어노테이션을 만들어주는 방법
    @AssertTrue(message = "yyyymm의 형식에 맞지 않습니다.")
    public boolean isReqYearMonthValidation(){
        try {
            LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
        }catch (Exception e){
            return false;
        }

        return true;
    }
    */

}
