package com.MeasurrementLength;

import org.junit.Assert;
import org.junit.Test;


public class QuantityMeasurementTest {
    @Test
    public void whenGivenTwoSameFeetValueObject_ifEqual_shouldReturnTrue() {
    	QuantityMeasurement feet = new QuantityMeasurement(QuantityMeasurementUnit.FEET,0.0);
        Assert.assertEquals(feet,new QuantityMeasurement(QuantityMeasurementUnit.FEET,0.0));
    }
    
    @Test
    public void whenGivenFeetAndInchObjects_shouldNotEquals() {
    	QuantityMeasurement feet = new QuantityMeasurement(QuantityMeasurementUnit.FEET,1.0);
        Assert.assertNotEquals(feet, new QuantityMeasurement(QuantityMeasurementUnit.INCH,1.0));
    }
    
    @Test
    public void whenGivenTwoDifferentFeetValueObject_shouldReturnFalse() {
    	QuantityMeasurement feet = new QuantityMeasurement(QuantityMeasurementUnit.FEET, 0.0);
        Assert.assertNotEquals(feet,new QuantityMeasurement(QuantityMeasurementUnit.FEET,1.0));
    }
    
    @Test
    public void whenGivenTwoSameInchValueObjects_shouldReturnTrue() {
    	QuantityMeasurement inch = new QuantityMeasurement(QuantityMeasurementUnit.INCH, 0.0);
        Assert.assertEquals(inch,new QuantityMeasurement(QuantityMeasurementUnit.INCH, 0.0));
    }

    @Test
    public void whenGivenTwoDifferentInchObjects_shouldReturnFalse() {
    	QuantityMeasurement inch = new QuantityMeasurement(QuantityMeasurementUnit.INCH, 0.0);
        Assert.assertNotEquals(inch,new QuantityMeasurement(QuantityMeasurementUnit.INCH, 1.0));
    }
    
    @Test
    public void whenGiven0FeetAnd0Inch_shouldReturnEquals() {
    	QuantityMeasurement feet = new QuantityMeasurement(QuantityMeasurementUnit.FEET,0.0);
        Assert.assertEquals(feet, new QuantityMeasurement(QuantityMeasurementUnit.INCH,0.0));
    }
    
    @Test
    public void whenGiven1FeetAnd1Feet_shouldReturnEquals() {
    	QuantityMeasurement feet = new QuantityMeasurement(QuantityMeasurementUnit.FEET,1.0);
        Assert.assertEquals(feet,new QuantityMeasurement(QuantityMeasurementUnit.FEET,1.0));
    }
    
    @Test
    public void whenGiven0FeetAnd0Yard_shouldReturnEquals() {
    	QuantityMeasurement feet = new QuantityMeasurement(QuantityMeasurementUnit.FEET, 0.0);
        Assert.assertEquals(feet, new QuantityMeasurement(QuantityMeasurementUnit.YARD, 0.0));
    }
    
    @Test
    public void whenGiven1FeetAnd1Yard_shouldReturnNotEquals() {
    	QuantityMeasurement feet = new QuantityMeasurement(QuantityMeasurementUnit.FEET, 1.0);
        Assert.assertNotEquals(feet, new QuantityMeasurement(QuantityMeasurementUnit.YARD,1.0));
    }
    
    @Test
    public void whenGiven3FeetAnd1Yard_shouldReturnEquals() {
    	QuantityMeasurement feet = new QuantityMeasurement(QuantityMeasurementUnit.FEET,3.0);
        Assert.assertEquals(feet, new QuantityMeasurement(QuantityMeasurementUnit.YARD, 1.0));
    }
    
    @Test
    public void whenGiven1InchAnd1Yard_shouldReturnNotEquals() {
    	QuantityMeasurement inch = new QuantityMeasurement(QuantityMeasurementUnit.INCH,1.0);
        Assert.assertNotEquals(inch, new QuantityMeasurement(QuantityMeasurementUnit.YARD, 1.0));
    }

}