package com.jkxy.car.api.service.Impl;

import com.jkxy.car.api.dao.CarDao;
import com.jkxy.car.api.pojo.Car;
import com.jkxy.car.api.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("carService")
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> findAll() {
        return carDao.findAll();
    }

    @Override
    public Car findById(int id) {
        return carDao.findById(id);
    }

    @Override
    public List<Car> findByCarName(String carName) {
        return carDao.findByCarName(carName);
    }

    @Override
    public void deleteById(int id) {
        carDao.deleteById(id);
    }

    @Override
    public void updateById(Car car) {
        carDao.updateById(car);
    }

    @Override
    public void insertCar(Car car) {
        carDao.insertCar(car);
    }

    @Override
    public Car findByCarNameAndCarSeries(String carName, String carSeries) {
        return carDao.findByCarNameAndCarSeries(carName, carSeries);
    }

    @Override
    public List<Car> findCarInfoByWhere(String carName, Integer page, Integer size) {
        return carDao.findCarInfoByWhere(carName, page, size);
    }
}
