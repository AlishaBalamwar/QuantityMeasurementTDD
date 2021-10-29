package com.MeasurrementLength;

public class QuantityMeasurement {
	 private final QuantityMeasurementUnit unit;
	 private final double value;

	 public QuantityMeasurement(QuantityMeasurementUnit unit, double value) {
	      this.unit = unit;
	      this.value = value;
	    }

		public boolean compare(QuantityMeasurement quantityMeasurement) {
	        double unitConversionValue = this.unit.getConversionValue(quantityMeasurement.unit);
	        return Double.compare(quantityMeasurement.value,this.value*unitConversionValue) == 0;
	    }

	    public double convertTo(QuantityMeasurementUnit unit){
	        return this.value*this.unit.getConversionValue(unit);
	    }

	    @Override
	    public boolean equals(Object object) {
	        if (this == object)
	        	return true;
	        if (!(object instanceof QuantityMeasurement))
	        	return false;
	        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) object;
	        return compare(quantityMeasurement);
	    }
}
