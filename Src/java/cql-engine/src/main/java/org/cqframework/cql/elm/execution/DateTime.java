//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.04.12 at 08:52:42 PM MDT 
//


package org.cqframework.cql.elm.execution;

import org.cqframework.cql.execution.Context;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.jvnet.jaxb2_commons.lang.*;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Collection;


/**
 * The DateTime operator constructs a date/time value from the given components.
 * <p>
 * At least one component other than timezoneOffset must be specified, and no component may be specified at a precision below an unspecified precision. For example, hour may be null, but if it is, minute, second, and millisecond must all be null as well.
 * <p>
 * If timezoneOffset is not specified, it is defaulted to the timezone offset of the evaluation request.
 * <p>
 * <p>Java class for DateTime complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="DateTime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:hl7-org:elm:r1}Expression"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="year" type="{urn:hl7-org:elm:r1}Expression"/&gt;
 *         &lt;element name="month" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/&gt;
 *         &lt;element name="day" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/&gt;
 *         &lt;element name="hour" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/&gt;
 *         &lt;element name="minute" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/&gt;
 *         &lt;element name="second" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/&gt;
 *         &lt;element name="millisecond" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/&gt;
 *         &lt;element name="timezoneOffset" type="{urn:hl7-org:elm:r1}Expression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateTime", namespace = "urn:hl7-org:elm:r1", propOrder = {
        "year",
        "month",
        "day",
        "hour",
        "minute",
        "second",
        "millisecond",
        "timezoneOffset"
})
public class DateTime
        extends Expression
        implements Equals, HashCode, ToString {

    @XmlElement(namespace = "urn:hl7-org:elm:r1", required = true)
    protected Expression year;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected Expression month;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected Expression day;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected Expression hour;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected Expression minute;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected Expression second;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected Expression millisecond;
    @XmlElement(namespace = "urn:hl7-org:elm:r1")
    protected Expression timezoneOffset;

    /**
     * Gets the value of the year property.
     *
     * @return possible object is
     * {@link Expression }
     */
    public Expression getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     *
     * @param value allowed object is
     *              {@link Expression }
     */
    public void setYear(Expression value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     *
     * @return possible object is
     * {@link Expression }
     */
    public Expression getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     *
     * @param value allowed object is
     *              {@link Expression }
     */
    public void setMonth(Expression value) {
        this.month = value;
    }

    /**
     * Gets the value of the day property.
     *
     * @return possible object is
     * {@link Expression }
     */
    public Expression getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     *
     * @param value allowed object is
     *              {@link Expression }
     */
    public void setDay(Expression value) {
        this.day = value;
    }

    /**
     * Gets the value of the hour property.
     *
     * @return possible object is
     * {@link Expression }
     */
    public Expression getHour() {
        return hour;
    }

    /**
     * Sets the value of the hour property.
     *
     * @param value allowed object is
     *              {@link Expression }
     */
    public void setHour(Expression value) {
        this.hour = value;
    }

    /**
     * Gets the value of the minute property.
     *
     * @return possible object is
     * {@link Expression }
     */
    public Expression getMinute() {
        return minute;
    }

    /**
     * Sets the value of the minute property.
     *
     * @param value allowed object is
     *              {@link Expression }
     */
    public void setMinute(Expression value) {
        this.minute = value;
    }

    /**
     * Gets the value of the second property.
     *
     * @return possible object is
     * {@link Expression }
     */
    public Expression getSecond() {
        return second;
    }

    /**
     * Sets the value of the second property.
     *
     * @param value allowed object is
     *              {@link Expression }
     */
    public void setSecond(Expression value) {
        this.second = value;
    }

    /**
     * Gets the value of the millisecond property.
     *
     * @return possible object is
     * {@link Expression }
     */
    public Expression getMillisecond() {
        return millisecond;
    }

    /**
     * Sets the value of the millisecond property.
     *
     * @param value allowed object is
     *              {@link Expression }
     */
    public void setMillisecond(Expression value) {
        this.millisecond = value;
    }

    /**
     * Gets the value of the timezoneOffset property.
     *
     * @return possible object is
     * {@link Expression }
     */
    public Expression getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Sets the value of the timezoneOffset property.
     *
     * @param value allowed object is
     *              {@link Expression }
     */
    public void setTimezoneOffset(Expression value) {
        this.timezoneOffset = value;
    }

    public DateTime withYear(Expression value) {
        setYear(value);
        return this;
    }

    public DateTime withMonth(Expression value) {
        setMonth(value);
        return this;
    }

    public DateTime withDay(Expression value) {
        setDay(value);
        return this;
    }

    public DateTime withHour(Expression value) {
        setHour(value);
        return this;
    }

    public DateTime withMinute(Expression value) {
        setMinute(value);
        return this;
    }

    public DateTime withSecond(Expression value) {
        setSecond(value);
        return this;
    }

    public DateTime withMillisecond(Expression value) {
        setMillisecond(value);
        return this;
    }

    public DateTime withTimezoneOffset(Expression value) {
        setTimezoneOffset(value);
        return this;
    }

    @Override
    public DateTime withAnnotation(Object... values) {
        if (values != null) {
            for (Object value : values) {
                getAnnotation().add(value);
            }
        }
        return this;
    }

    @Override
    public DateTime withAnnotation(Collection<Object> values) {
        if (values != null) {
            getAnnotation().addAll(values);
        }
        return this;
    }

    @Override
    public DateTime withLocalId(String value) {
        setLocalId(value);
        return this;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DateTime)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DateTime that = ((DateTime) object);
        {
            Expression lhsYear;
            lhsYear = this.getYear();
            Expression rhsYear;
            rhsYear = that.getYear();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "year", lhsYear), LocatorUtils.property(thatLocator, "year", rhsYear), lhsYear, rhsYear)) {
                return false;
            }
        }
        {
            Expression lhsMonth;
            lhsMonth = this.getMonth();
            Expression rhsMonth;
            rhsMonth = that.getMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "month", lhsMonth), LocatorUtils.property(thatLocator, "month", rhsMonth), lhsMonth, rhsMonth)) {
                return false;
            }
        }
        {
            Expression lhsDay;
            lhsDay = this.getDay();
            Expression rhsDay;
            rhsDay = that.getDay();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "day", lhsDay), LocatorUtils.property(thatLocator, "day", rhsDay), lhsDay, rhsDay)) {
                return false;
            }
        }
        {
            Expression lhsHour;
            lhsHour = this.getHour();
            Expression rhsHour;
            rhsHour = that.getHour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hour", lhsHour), LocatorUtils.property(thatLocator, "hour", rhsHour), lhsHour, rhsHour)) {
                return false;
            }
        }
        {
            Expression lhsMinute;
            lhsMinute = this.getMinute();
            Expression rhsMinute;
            rhsMinute = that.getMinute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minute", lhsMinute), LocatorUtils.property(thatLocator, "minute", rhsMinute), lhsMinute, rhsMinute)) {
                return false;
            }
        }
        {
            Expression lhsSecond;
            lhsSecond = this.getSecond();
            Expression rhsSecond;
            rhsSecond = that.getSecond();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "second", lhsSecond), LocatorUtils.property(thatLocator, "second", rhsSecond), lhsSecond, rhsSecond)) {
                return false;
            }
        }
        {
            Expression lhsMillisecond;
            lhsMillisecond = this.getMillisecond();
            Expression rhsMillisecond;
            rhsMillisecond = that.getMillisecond();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "millisecond", lhsMillisecond), LocatorUtils.property(thatLocator, "millisecond", rhsMillisecond), lhsMillisecond, rhsMillisecond)) {
                return false;
            }
        }
        {
            Expression lhsTimezoneOffset;
            lhsTimezoneOffset = this.getTimezoneOffset();
            Expression rhsTimezoneOffset;
            rhsTimezoneOffset = that.getTimezoneOffset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timezoneOffset", lhsTimezoneOffset), LocatorUtils.property(thatLocator, "timezoneOffset", rhsTimezoneOffset), lhsTimezoneOffset, rhsTimezoneOffset)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Expression theYear;
            theYear = this.getYear();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "year", theYear), currentHashCode, theYear);
        }
        {
            Expression theMonth;
            theMonth = this.getMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "month", theMonth), currentHashCode, theMonth);
        }
        {
            Expression theDay;
            theDay = this.getDay();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "day", theDay), currentHashCode, theDay);
        }
        {
            Expression theHour;
            theHour = this.getHour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hour", theHour), currentHashCode, theHour);
        }
        {
            Expression theMinute;
            theMinute = this.getMinute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minute", theMinute), currentHashCode, theMinute);
        }
        {
            Expression theSecond;
            theSecond = this.getSecond();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "second", theSecond), currentHashCode, theSecond);
        }
        {
            Expression theMillisecond;
            theMillisecond = this.getMillisecond();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "millisecond", theMillisecond), currentHashCode, theMillisecond);
        }
        {
            Expression theTimezoneOffset;
            theTimezoneOffset = this.getTimezoneOffset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timezoneOffset", theTimezoneOffset), currentHashCode, theTimezoneOffset);
        }
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
        {
            Expression theYear;
            theYear = this.getYear();
            strategy.appendField(locator, this, "year", buffer, theYear);
        }
        {
            Expression theMonth;
            theMonth = this.getMonth();
            strategy.appendField(locator, this, "month", buffer, theMonth);
        }
        {
            Expression theDay;
            theDay = this.getDay();
            strategy.appendField(locator, this, "day", buffer, theDay);
        }
        {
            Expression theHour;
            theHour = this.getHour();
            strategy.appendField(locator, this, "hour", buffer, theHour);
        }
        {
            Expression theMinute;
            theMinute = this.getMinute();
            strategy.appendField(locator, this, "minute", buffer, theMinute);
        }
        {
            Expression theSecond;
            theSecond = this.getSecond();
            strategy.appendField(locator, this, "second", buffer, theSecond);
        }
        {
            Expression theMillisecond;
            theMillisecond = this.getMillisecond();
            strategy.appendField(locator, this, "millisecond", buffer, theMillisecond);
        }
        {
            Expression theTimezoneOffset;
            theTimezoneOffset = this.getTimezoneOffset();
            strategy.appendField(locator, this, "timezoneOffset", buffer, theTimezoneOffset);
        }
        return buffer;
    }

    @Override
    public Object evaluate(Context context) {
        Expression field = null;
        String year = (field = (Expression) this.getYear()) == null ? null : ((Integer) field.evaluate(context)).toString();
        if (year == null) return null;
        if (year.length() < 4) {
            throw new IllegalArgumentException("Must use 4 digits for year.");
        }

        String month = (field = (Expression) this.getMonth()) == null ? null : ((Integer) field.evaluate(context)).toString();
        String day = (field = (Expression) this.getDay()) == null ? null : ((Integer) field.evaluate(context)).toString();
        String hour = (field = (Expression) this.getHour()) == null ? null : ((Integer) field.evaluate(context)).toString();
        String minute = (field = (Expression) this.getMinute()) == null ? null : ((Integer) field.evaluate(context)).toString();
        String second = (field = (Expression) this.getSecond()) == null ? null : ((Integer) field.evaluate(context)).toString();
        String milliSecond = (field = (Expression) this.getMillisecond()) == null ? null : ((Integer) field.evaluate(context)).toString();
        String tzOffset = (field = (Expression) this.getTimezoneOffset()) == null ? null : ((Integer) field.evaluate(context)).toString();

        StringBuffer timeBuffer = new StringBuffer(year);
        if (month != null) {
            timeBuffer.append("-").append(String.format("%0"+ (2 - month.length() )+"d%s",0 ,month));
        }

        if (day != null) {
            timeBuffer.append("-").append(String.format("%0"+ (2 - day.length() )+"d%s",0 ,day));
        }

        if (hour != null) {
            timeBuffer.append("T").append(hour);
        }

        if (minute != null) {
            timeBuffer.append(":").append(minute);
        }

        if (second != null) {
            timeBuffer.append(":").append(second);
        }

        if (milliSecond != null) {
            timeBuffer.append(".").append(milliSecond);
        }

        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        org.joda.time.DateTime newDate = formatter.parseDateTime(timeBuffer.toString());

        return newDate.toDate();
    }
}
