package com.indianStateCensus;

import com.opencsv.bean.CsvBindByName;

public class CSVStateCensus {
	@CsvBindByName(column = "State")
	public String state;

	@CsvBindByName(column = "Population", required = true)
	public int population;

	@CsvBindByName(column = "AreaInSqKm")
	public int areaInSqKm;

	@CsvBindByName(column = "DensityPerSqKm", required = true)
	public int densityPerSqKm;
	
	@Override
	public String toString() {
		return "CSVStateCensus [state=" + state + ", population=" + population + ", areaInSqKm=" + areaInSqKm
				+ ", densityPerSqKm=" + densityPerSqKm + "]";
	}
}
