package org.jeeqb.framework.core;

import java.lang.annotation.Annotation;
import java.util.List;

/**
 * 类扫描器
 * Created by rocky on 2017/12/27.
 */
public interface ClassScanner {

    /**
     * 获取指定包名中的所有类
     * @param packageName
     * @return
     */
    List<Class<?>> getClassList(String packageName);

    /**
     * 获取指定包名的指定注解的相关类
     * @param packageName
     * @param annotationClass
     * @return
     */
    List<Class<?>> getClassListByAnnotation(String packageName, Class<? extends Annotation> annotationClass);


    /**
     * 获取指定包名的指定父类或接口的相关类
     * @param packageName
     * @param superClass
     * @return
     */
    List<Class<?>> getClassListBySuper(String packageName, Class<?> superClass);


}
