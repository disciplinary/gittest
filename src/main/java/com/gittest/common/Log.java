package com.gittest.common;

import java.lang.annotation.*;

/**
 * <p>todo</p>
 *
 * @author syw
 * @version $Id: Log, v 0.1 2018/12/26 15:40 syw Exp $
 */
@Target({ ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {


    /** 模块 */
    String title() default "";

    /** 功能 */
    String action() default "";

}