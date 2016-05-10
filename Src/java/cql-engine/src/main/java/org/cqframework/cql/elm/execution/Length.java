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
 * The Length operator returns the length of its argument.
 * <p>
 * For strings, the length is the number of characters in the string.
 * <p>
 * For lists, the length is the number of elements in the list.
 * <p>
 * If the argument is null, the result is null.
 * <p>
 * <p>Java class for Length complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="Length"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}UnaryExpression"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Length", namespace = "urn:hl7-org:elm:r1")
public class Length
        extends UnaryExpression
        implements Equals, HashCode, ToString {


    @Override
    public Length withOperand(Expression value) {
        setOperand(value);
        return this;
    }

    @Override
    public Length withAnnotation(Object... values) {
        if (values != null) {
            for (Object value : values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public Length withAnnotation(Collection<Object> values) {
        if (values != null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public Length withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Length)) {
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
        if (expression == null) return null;

        Object value = expression.evaluate(context);

        if (value == null) {
            return null;
        }

        if (value instanceof String) {
            return ((String) value).length();
        }

        throw new IllegalArgumentException(String.format("Cannot %s of type '%s'.", this.getClass().getSimpleName(), value.getClass().getName()));
    }
}
