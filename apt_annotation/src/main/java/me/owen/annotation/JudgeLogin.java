package me.owen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: AndLogin
 * @Package: me.owen.annotation
 * @ClassName: JudgeLogin
 * @Description: java类作用描述
 * @Author: Owen
 * @CreateDate: 2021/10/11 0011 下午 8:23
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/10/11 0011 下午 8:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JudgeLogin {
}
