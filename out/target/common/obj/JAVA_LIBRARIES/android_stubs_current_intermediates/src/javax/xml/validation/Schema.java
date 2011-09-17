package javax.xml.validation;
public abstract class Schema
{
protected  Schema() { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.validation.Validator newValidator();
public abstract  javax.xml.validation.ValidatorHandler newValidatorHandler();
}
