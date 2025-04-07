package main;

import Builder.clase.AbstractAirQualitySensor;
import Builder.clase.Builder;
import Builder.clase.Sensor;
import Builder.clase.SensorBuilder;
import SimpleFactory.clase.AbstractAirQualityReport;
import SimpleFactory.factory.FactoryRaport;

public class Main {
    public static void main(String[] args) {
        FactoryRaport factory =  new FactoryRaport();
        AbstractAirQualityReport raport1 = factory.createAirQualityReport(45);
        raport1.afiseazaRaport();

        AbstractAirQualityReport raport2 = factory.createAirQualityReport(12);
        raport2.afiseazaRaport();

        AbstractAirQualityReport raport3 = factory.createAirQualityReport(80);
        raport3.afiseazaRaport();

        System.out.println("\n");


        SensorBuilder builder1 = new SensorBuilder();
        AbstractAirQualitySensor sensor1 = builder1.setAreNivelCO(true).setAreNivelCO2(true).build(25.4, 12.5);
        sensor1.afiseazaDetalii();

        SensorBuilder builder2 = new SensorBuilder();
        AbstractAirQualitySensor sensor2 = builder2.setAreNivelPM1O(true).build(27.0, 31.4);
        sensor2.afiseazaDetalii();

        SensorBuilder builder3 = new SensorBuilder();
        AbstractAirQualitySensor sensor3 = builder3.setAreNivelCO2(true).setAreNivelCO2(true).build(23.0, 0.4);
        sensor3.afiseazaDetalii();
    }
}