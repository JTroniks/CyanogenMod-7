package dalvik.annotation;
@java.lang.annotation.Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Target(value={java.lang.annotation.ElementType.ANNOTATION_TYPE})
public @interface TestTarget
{
java.lang.String methodName() default "";
java.lang.String conceptName() default "";
java.lang.Class<?>[] methodArgs() default {};
}
