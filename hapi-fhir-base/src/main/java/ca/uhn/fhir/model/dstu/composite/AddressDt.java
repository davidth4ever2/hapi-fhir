















package ca.uhn.fhir.model.dstu.composite;

import java.util.*;
import ca.uhn.fhir.model.api.*;
import ca.uhn.fhir.model.api.annotation.*;

import ca.uhn.fhir.model.dstu.valueset.AddressUseEnum;
import ca.uhn.fhir.model.dstu.composite.CodingDt;
import ca.uhn.fhir.model.dstu.valueset.ContactSystemEnum;
import ca.uhn.fhir.model.dstu.valueset.ContactUseEnum;
import ca.uhn.fhir.model.dstu.valueset.EventTimingEnum;
import ca.uhn.fhir.model.dstu.valueset.IdentifierUseEnum;
import ca.uhn.fhir.model.dstu.valueset.NameUseEnum;
import ca.uhn.fhir.model.dstu.resource.Organization;
import ca.uhn.fhir.model.dstu.composite.PeriodDt;
import ca.uhn.fhir.model.dstu.valueset.QuantityCompararatorEnum;
import ca.uhn.fhir.model.dstu.composite.QuantityDt;
import ca.uhn.fhir.model.dstu.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu.valueset.UnitsOfTimeEnum;
import ca.uhn.fhir.model.dstu.resource.ValueSet;
import ca.uhn.fhir.model.primitive.Base64BinaryDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IntegerDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.UriDt;

/**
 * HAPI/FHIR <b>Address</b> Datatype
 * (A postal address)
 *
 * <p>
 * <b>Definition:</b>
 * There is a variety of postal address formats defined around the world. This format defines a superset that is the basis for all addresses around the world
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Need to be able to record postal addresses, along with notes about their use
 * </p> 
 */
@DatatypeDef(name="Address") 
public class AddressDt 
        extends  BaseElement         implements ICompositeDatatype  {


	@Child(name="use", type=CodeDt.class, order=0, min=0, max=1)	
	@Description(
		shortDefinition="home | work | temp | old - purpose of this address",
		formalDefinition="The purpose of this address"
	)
	private BoundCodeDt<AddressUseEnum> myUse;
	
	@Child(name="text", type=StringDt.class, order=1, min=0, max=1)	
	@Description(
		shortDefinition="Text representation of the address",
		formalDefinition="A full text representation of the address"
	)
	private StringDt myText;
	
	@Child(name="line", type=StringDt.class, order=2, min=0, max=Child.MAX_UNLIMITED)	
	@Description(
		shortDefinition="Street name, number, direction & P.O. Box etc",
		formalDefinition="This component contains the house number, apartment number, street name, street direction, P.O. Box number, delivery hints, and similar address information"
	)
	private java.util.List<StringDt> myLine;
	
	@Child(name="city", type=StringDt.class, order=3, min=0, max=1)	
	@Description(
		shortDefinition="Name of city, town etc.",
		formalDefinition="The name of the city, town, village or other community or delivery center."
	)
	private StringDt myCity;
	
	@Child(name="state", type=StringDt.class, order=4, min=0, max=1)	
	@Description(
		shortDefinition="Sub-unit of country (abreviations ok)",
		formalDefinition="Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes)."
	)
	private StringDt myState;
	
	@Child(name="zip", type=StringDt.class, order=5, min=0, max=1)	
	@Description(
		shortDefinition="Postal code for area",
		formalDefinition="A postal code designating a region defined by the postal service."
	)
	private StringDt myZip;
	
	@Child(name="country", type=StringDt.class, order=6, min=0, max=1)	
	@Description(
		shortDefinition="Country (can be ISO 3166 3 letter code)",
		formalDefinition="Country - a nation as commonly understood or generally accepted"
	)
	private StringDt myCountry;
	
	@Child(name="period", type=PeriodDt.class, order=7, min=0, max=1)	
	@Description(
		shortDefinition="Time period when address was/is in use",
		formalDefinition="Time period when address was/is in use"
	)
	private PeriodDt myPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUse,  myText,  myLine,  myCity,  myState,  myZip,  myCountry,  myPeriod);
	}
	
	@Override
	public java.util.List<IElement> getAllPopulatedChildElements() {
		return getAllPopulatedChildElementsOfType(null);
	}

	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUse, myText, myLine, myCity, myState, myZip, myCountry, myPeriod);
	}

	/**
	 * Gets the value(s) for <b>use</b> (home | work | temp | old - purpose of this address).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The purpose of this address
     * </p> 
	 */
	public BoundCodeDt<AddressUseEnum> getUse() {  
		if (myUse == null) {
			myUse = new BoundCodeDt<AddressUseEnum>(AddressUseEnum.VALUESET_BINDER);
		}
		return myUse;
	}

	/**
	 * Sets the value(s) for <b>use</b> (home | work | temp | old - purpose of this address)
	 *
     * <p>
     * <b>Definition:</b>
     * The purpose of this address
     * </p> 
	 */
	public void setUse(BoundCodeDt<AddressUseEnum> theValue) {
		myUse = theValue;
	}


	/**
	 * Sets the value(s) for <b>use</b> (home | work | temp | old - purpose of this address)
	 *
     * <p>
     * <b>Definition:</b>
     * The purpose of this address
     * </p> 
	 */
	public void setUse(AddressUseEnum theValue) {
		getUse().setValueAsEnum(theValue);
	}

  
	/**
	 * Gets the value(s) for <b>text</b> (Text representation of the address).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A full text representation of the address
     * </p> 
	 */
	public StringDt getText() {  
		if (myText == null) {
			myText = new StringDt();
		}
		return myText;
	}

	/**
	 * Sets the value(s) for <b>text</b> (Text representation of the address)
	 *
     * <p>
     * <b>Definition:</b>
     * A full text representation of the address
     * </p> 
	 */
	public void setText(StringDt theValue) {
		myText = theValue;
	}


 	/**
	 * Sets the value for <b>text</b> (Text representation of the address)
	 *
     * <p>
     * <b>Definition:</b>
     * A full text representation of the address
     * </p> 
	 */
	public void setText( String theString) {
		myText = new StringDt(theString); 
	}

 
	/**
	 * Gets the value(s) for <b>line</b> (Street name, number, direction & P.O. Box etc).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This component contains the house number, apartment number, street name, street direction, P.O. Box number, delivery hints, and similar address information
     * </p> 
	 */
	public java.util.List<StringDt> getLine() {  
		if (myLine == null) {
			myLine = new java.util.ArrayList<StringDt>();
		}
		return myLine;
	}

	/**
	 * Sets the value(s) for <b>line</b> (Street name, number, direction & P.O. Box etc)
	 *
     * <p>
     * <b>Definition:</b>
     * This component contains the house number, apartment number, street name, street direction, P.O. Box number, delivery hints, and similar address information
     * </p> 
	 */
	public void setLine(java.util.List<StringDt> theValue) {
		myLine = theValue;
	}

	/**
	 * Adds and returns a new value for <b>line</b> (Street name, number, direction & P.O. Box etc)
	 *
     * <p>
     * <b>Definition:</b>
     * This component contains the house number, apartment number, street name, street direction, P.O. Box number, delivery hints, and similar address information
     * </p> 
	 */
	public StringDt addLine() {
		StringDt newType = new StringDt();
		getLine().add(newType);
		return newType; 
	}

 	/**
	 * Adds a new value for <b>line</b> (Street name, number, direction & P.O. Box etc)
	 *
     * <p>
     * <b>Definition:</b>
     * This component contains the house number, apartment number, street name, street direction, P.O. Box number, delivery hints, and similar address information
     * </p> 
	 */
	public void addLine( String theString) {
		if (myLine == null) {
			myLine = new java.util.ArrayList<StringDt>();
		}
		myLine.add(new StringDt(theString)); 
	}

 
	/**
	 * Gets the value(s) for <b>city</b> (Name of city, town etc.).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the city, town, village or other community or delivery center.
     * </p> 
	 */
	public StringDt getCity() {  
		if (myCity == null) {
			myCity = new StringDt();
		}
		return myCity;
	}

	/**
	 * Sets the value(s) for <b>city</b> (Name of city, town etc.)
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the city, town, village or other community or delivery center.
     * </p> 
	 */
	public void setCity(StringDt theValue) {
		myCity = theValue;
	}


 	/**
	 * Sets the value for <b>city</b> (Name of city, town etc.)
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the city, town, village or other community or delivery center.
     * </p> 
	 */
	public void setCity( String theString) {
		myCity = new StringDt(theString); 
	}

 
	/**
	 * Gets the value(s) for <b>state</b> (Sub-unit of country (abreviations ok)).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
     * </p> 
	 */
	public StringDt getState() {  
		if (myState == null) {
			myState = new StringDt();
		}
		return myState;
	}

	/**
	 * Sets the value(s) for <b>state</b> (Sub-unit of country (abreviations ok))
	 *
     * <p>
     * <b>Definition:</b>
     * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
     * </p> 
	 */
	public void setState(StringDt theValue) {
		myState = theValue;
	}


 	/**
	 * Sets the value for <b>state</b> (Sub-unit of country (abreviations ok))
	 *
     * <p>
     * <b>Definition:</b>
     * Sub-unit of a country with limited sovereignty in a federally organized country. A code may be used if codes are in common use (i.e. US 2 letter state codes).
     * </p> 
	 */
	public void setState( String theString) {
		myState = new StringDt(theString); 
	}

 
	/**
	 * Gets the value(s) for <b>zip</b> (Postal code for area).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A postal code designating a region defined by the postal service.
     * </p> 
	 */
	public StringDt getZip() {  
		if (myZip == null) {
			myZip = new StringDt();
		}
		return myZip;
	}

	/**
	 * Sets the value(s) for <b>zip</b> (Postal code for area)
	 *
     * <p>
     * <b>Definition:</b>
     * A postal code designating a region defined by the postal service.
     * </p> 
	 */
	public void setZip(StringDt theValue) {
		myZip = theValue;
	}


 	/**
	 * Sets the value for <b>zip</b> (Postal code for area)
	 *
     * <p>
     * <b>Definition:</b>
     * A postal code designating a region defined by the postal service.
     * </p> 
	 */
	public void setZip( String theString) {
		myZip = new StringDt(theString); 
	}

 
	/**
	 * Gets the value(s) for <b>country</b> (Country (can be ISO 3166 3 letter code)).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Country - a nation as commonly understood or generally accepted
     * </p> 
	 */
	public StringDt getCountry() {  
		if (myCountry == null) {
			myCountry = new StringDt();
		}
		return myCountry;
	}

	/**
	 * Sets the value(s) for <b>country</b> (Country (can be ISO 3166 3 letter code))
	 *
     * <p>
     * <b>Definition:</b>
     * Country - a nation as commonly understood or generally accepted
     * </p> 
	 */
	public void setCountry(StringDt theValue) {
		myCountry = theValue;
	}


 	/**
	 * Sets the value for <b>country</b> (Country (can be ISO 3166 3 letter code))
	 *
     * <p>
     * <b>Definition:</b>
     * Country - a nation as commonly understood or generally accepted
     * </p> 
	 */
	public void setCountry( String theString) {
		myCountry = new StringDt(theString); 
	}

 
	/**
	 * Gets the value(s) for <b>period</b> (Time period when address was/is in use).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time period when address was/is in use
     * </p> 
	 */
	public PeriodDt getPeriod() {  
		if (myPeriod == null) {
			myPeriod = new PeriodDt();
		}
		return myPeriod;
	}

	/**
	 * Sets the value(s) for <b>period</b> (Time period when address was/is in use)
	 *
     * <p>
     * <b>Definition:</b>
     * Time period when address was/is in use
     * </p> 
	 */
	public void setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
	}


  



}