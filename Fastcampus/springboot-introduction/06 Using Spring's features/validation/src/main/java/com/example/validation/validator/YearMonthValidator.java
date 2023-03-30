package com.example.validation.validator;

import com.example.validation.annotation.YearMonth;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearMonthValidator implements ConstraintValidator<YearMonth, String> {

    private String pattern;

    @Override
    public void initialize(YearMonth constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // yyyyMM
        // + "01"을 하는 이유 >> yyyyMMdd패턴으로 값을 받기 때문에 dd를 01로 default
        try {
            LocalDate localDate = LocalDate.parse(value + "01", DateTimeFormatter.ofPattern("this.pattern"));
        }catch (Exception e){
            return false;
        }

        return true;
    }
}
