package learnedma.generated.valuedomains.impl;

import learnedma.generated.valuedomains.Email;
import learnedma.generated.valuedomains.Mobile;
import learnedma.generated.valuedomains.Name;
import learnedma.generated.valuedomains.Person;
import learnedma.generated.valuedomains.Person.PersonBuilderEmail;
import learnedma.generated.valuedomains.Person.PersonBuilderFirstName;
import learnedma.generated.valuedomains.Person.PersonBuilderLastName;
import learnedma.generated.valuedomains.Person.PersonBuilderMiddleName;
import learnedma.generated.valuedomains.Person.PersonBuilderPhoneNumber;
import learnedma.generated.valuedomains.impl.EmailImpl;
import learnedma.generated.valuedomains.impl.MobileImpl;
import learnedma.generated.valuedomains.impl.NameImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class PersonBuilderImpl implements PersonBuilderEmail, PersonBuilderFirstName, PersonBuilderLastName, PersonBuilderMiddleName, PersonBuilderPhoneNumber
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public PersonBuilderImpl()
    {
        edma_value = new Object[5];
    }

    /**
     * sets the firstName field.
     * @param firstName  The value to assign to the firstName field
     * @return           Builder interface for setting the middleName field
     */
    public PersonBuilderMiddleName firstName(Name firstName)
    {
        if(firstName == null) throw new NullPointerException("The field firstName in the Person ValueDomain may not be null");
        edma_value[0] = ((IValueInstance) firstName).edma_getValue();
        return this;
    }

    /**
     * sets the firstName field.
     * @param firstName  The value to assign to the firstName field
     * @return           Builder interface for setting the middleName field
     */
    public PersonBuilderMiddleName firstName(String firstName) throws InvalidValueException
    {
        if(firstName != null) NameImpl.edma_validate(firstName);
        if(firstName == null) throw new NullPointerException("The field firstName in the Person ValueDomain may not be null");
        edma_value[0] = NameImpl.edma_create(firstName);
        return this;
    }

    /**
     * sets the middleName field.
     * @param middleName  The value to assign to the middleName field
     * @return            Builder interface for setting the lastName field
     */
    public PersonBuilderLastName middleName(Name middleName)
    {
        edma_value[1] = (middleName == null ? null : (((IValueInstance) middleName).edma_getValue()));
        return this;
    }

    /**
     * sets the middleName field.
     * @param middleName  The value to assign to the middleName field
     * @return            Builder interface for setting the lastName field
     */
    public PersonBuilderLastName middleName(String middleName) throws InvalidValueException
    {
        if(middleName != null) NameImpl.edma_validate(middleName);
        edma_value[1] = (middleName == null ? null : (NameImpl.edma_create(middleName)));
        return this;
    }

    /**
     * sets the fieldmiddleName to null.
     * @return  Builder interface for setting the lastName field
     */
    public PersonBuilderLastName noMiddleName()
    {
        edma_value[1] = null;
        return this;
    }

    /**
     * sets the lastName field.
     * @param lastName  The value to assign to the lastName field
     * @return          Builder interface for setting the email field
     */
    public PersonBuilderEmail lastName(Name lastName)
    {
        if(lastName == null) throw new NullPointerException("The field lastName in the Person ValueDomain may not be null");
        edma_value[2] = ((IValueInstance) lastName).edma_getValue();
        return this;
    }

    /**
     * sets the lastName field.
     * @param lastName  The value to assign to the lastName field
     * @return          Builder interface for setting the email field
     */
    public PersonBuilderEmail lastName(String lastName) throws InvalidValueException
    {
        if(lastName != null) NameImpl.edma_validate(lastName);
        if(lastName == null) throw new NullPointerException("The field lastName in the Person ValueDomain may not be null");
        edma_value[2] = NameImpl.edma_create(lastName);
        return this;
    }

    /**
     * sets the email field.
     * @param email  The value to assign to the email field
     * @return       Builder interface for setting the phoneNumber field
     */
    public PersonBuilderPhoneNumber email(Email email)
    {
        if(email == null) throw new NullPointerException("The field email in the Person ValueDomain may not be null");
        edma_value[3] = ((IValueInstance) email).edma_getValue();
        return this;
    }

    /**
     * sets the email field.
     * @param email  The value to assign to the email field
     * @return       Builder interface for setting the phoneNumber field
     */
    public PersonBuilderPhoneNumber email(String email) throws InvalidValueException
    {
        if(email != null) EmailImpl.edma_validate(email);
        if(email == null) throw new NullPointerException("The field email in the Person ValueDomain may not be null");
        edma_value[3] = EmailImpl.edma_create(email);
        return this;
    }

    /**
     * sets the phoneNumber field.
     * @param phoneNumber  The value to assign to the phoneNumber field
     * @return             The created Person value
     */
    public Person phoneNumber(Mobile phoneNumber)
    {
        if(phoneNumber == null) throw new NullPointerException("The field phoneNumber in the Person ValueDomain may not be null");
        edma_value[4] = ((IValueInstance) phoneNumber).edma_getValue();
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }

    /**
     * sets the phoneNumber field.
     * @param phoneNumber  The value to assign to the phoneNumber field
     * @return             The created Person value
     */
    public Person phoneNumber(String phoneNumber) throws InvalidValueException
    {
        if(phoneNumber != null) MobileImpl.edma_validate(phoneNumber);
        if(phoneNumber == null) throw new NullPointerException("The field phoneNumber in the Person ValueDomain may not be null");
        edma_value[4] = MobileImpl.edma_create(phoneNumber);
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }
}
