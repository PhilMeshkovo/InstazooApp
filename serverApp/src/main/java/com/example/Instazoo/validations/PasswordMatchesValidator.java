package com.example.Instazoo.validations;

import com.example.Instazoo.annotations.PasswordMatches;
import com.example.Instazoo.payload.request.SignupRequest;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public void initialize(PasswordMatches constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext constraintValidatorContext) {
        SignupRequest userSighupRequest = (SignupRequest) obj;
        return userSighupRequest.getPassword().equals(userSighupRequest.getConfirmPassword());
    }
}
