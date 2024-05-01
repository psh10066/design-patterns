package com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._03_java.spring;

import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Ship;
import com.psh10066.designpatterns._01_creational_patterns._03_abstract_factory._00_common.Whiteship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() {
        return new Whiteship();
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
