package com.home.usefultricks.others.pattervalid;

import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * Валидация значений объекта с помощью
 * аннотации @Pattern
 */
public class RegApp {
    public static void main(String[] args) {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();

        RAModel model = new RAModel();
        model.setName("JOHN");

        Set<ConstraintViolation<RAModel>> constraintViolations = validator
                .validate(model);

        if (!CollectionUtils.isEmpty(constraintViolations)) {
            for (ConstraintViolation<RAModel> cv : constraintViolations) {
                System.out.println(cv.getMessage());
            }
        }
    }
}
