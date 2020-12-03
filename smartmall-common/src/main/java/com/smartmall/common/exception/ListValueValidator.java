package com.smartmall.common.exception;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Miaojiale on 2020/11/28.
 */
public class ListValueValidator implements ConstraintValidator<ListValue, Integer> {

    private Set<Integer> set = new HashSet<>();
    int[] vals;

    @Override
    public void initialize(ListValue constraintAnnotation) {
        vals = constraintAnnotation.vals();
        for (int val : vals) {
            set.add(val);
        }
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(integer);
    }
}
