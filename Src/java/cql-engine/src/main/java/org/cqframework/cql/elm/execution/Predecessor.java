//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 08:52:42 PM MDT 
//


package org.cqframework.cql.elm.execution;

import org.cqframework.cql.execution.Context;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Collection;


/**
 * The Predecessor operator returns the predecessor of the argument. For example, the predecessor of 2 is 1. If the argument is already the minimum value for the type, a run-time error is thrown.
 * 			
 * The Predecessor operator is defined for the Integer, Decimal, DateTime, and Time types.
 * 
 * For Integer, Predecessor is equivalent to subtracting 1.
 * 
 * For Decimal, Predecessor is equivalent to subtracting the minimum precision value for the Decimal type, or 10^-08.
 * 
 * For DateTime and Time values, Predecessor is equivalent to subtracting a time-unit quantity for the lowest specified precision of the value. For example, if the DateTime is fully specified, Predecessor is equivalent to subtracting 1 millisecond; if the DateTime is specified to the second, Predecessor is equivalent to subtracting one second, etc.
 * 
 * If the argument is null, the result is null.
 * 
 * <p>Java class for Predecessor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Predecessor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}UnaryExpression"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Predecessor", namespace = "urn:hl7-org:elm:r1")
public class Predecessor
    extends UnaryExpression
    implements Equals, HashCode, ToString
{


    @Override
    public Predecessor withOperand(Expression value) {
        setOperand(value);
        return this;
    }

    @Override
    public Predecessor withAnnotation(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public Predecessor withAnnotation(Collection<Object> values) {
        if (values!= null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public Predecessor withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Predecessor)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        Expression expression = getOperand();
        if(expression == null) return null;

        Object value = expression.evaluate(context);

        if (value == null) {
            return null;
        }

        //Integer, Decimal, DateTime, and Time
        if(value instanceof Integer){
            Integer val =(Integer)value;
            if(val == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Value must be larger than the MIN_VALUE");
            }

            return Math.decrementExact(val);
        }

        if(value instanceof Long){
            Long val =(Long)value;
            if(val == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Value must be larger than the MIN_VALUE");
            }

            return Math.decrementExact(val);
        }

        if(value instanceof Number){
            Double val =((Number)value).doubleValue();

            if(val == Double.MIN_VALUE) {
                throw new IllegalArgumentException("Value must be larger than the MIN_VALUE");
            }

            return Math.nextDown(val);
        }

        if(value instanceof Time){
            Time val =(Time)value;
            //TODO: Add MIN_Value Check.

            return val;
        }

        if(value instanceof DateTime){
            DateTime val =(DateTime)value;
            //TODO: Add MIN_Value Check.

            return val;
        }

        throw new IllegalArgumentException(String.format("Cannot %s with argument of type '%s'.",this.getClass().getSimpleName(), value.getClass().getName()));
    }
}
