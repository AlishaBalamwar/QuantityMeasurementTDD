package com.MeasurrementLength;

import org.junit.Assert;
import org.junit.Test;


public class QuantityMeasurementTest {
    @Test
    public void whenGivenTwoSameFeetValueObject_ifEqual_shouldReturnTrue() {
    	QuantityMeasurement feet = new QuantityMeasurement(QuantityMeasurementUnit.FEET,0.0);
        Assert.assertEquals(feet,new QuantityMeasurement(QuantityMeasurementUnit.FEET,0.0));
    }
}