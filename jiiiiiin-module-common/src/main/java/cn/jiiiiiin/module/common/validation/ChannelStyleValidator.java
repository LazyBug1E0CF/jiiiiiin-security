package cn.jiiiiiin.module.common.validation;


import cn.jiiiiiin.module.common.enums.common.ChannelEnum;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * {@link ChannelEnum} 校验器
 * @author jiiiiiin
 */
public class ChannelStyleValidator implements ConstraintValidator<ChannelStyle, Object> {
    @Override
    public void initialize(ChannelStyle constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return value instanceof ChannelEnum;
    }

}
