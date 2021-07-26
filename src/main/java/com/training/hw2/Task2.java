package com.training.hw2;

import com.training.hw2.model.*;

import java.util.*;
import java.util.stream.Collectors;

public class Task2 {
    private Scanner sc = new Scanner(System.in);
    ArrayList<Car> cList = new ArrayList();
    private Car car;

    public void consoleMenu() {
        MenuOptions menuOptions = MenuOptions.z;
        Car car = new Car();

        while (menuOptions != MenuOptions.q)
            try {
                menu();
                menuOptions = MenuOptions.valueOf(sc.nextLine());
                switch (menuOptions) {
                    case a:
                        inputCar();
                        break;
                    case b:
                        removeCar();
                        System.out.println("Car removed");
                        break;
                    case c:
                        showCar2(cList);
                        System.out.println("Car showed");
                        break;
                    case d:
                        sortedCar(cList);
                        System.out.println("Car sorted");
                        break;
                    case e:
                        showCarBrand(cList);
                        System.out.println("Car showed by model");
                        break;
                    case q:
                        System.out.println("Goodbye.");
                        break;
                    default:
                        System.out.println("Selection out of range. Try again");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Selection out of range. Try again:");
            }
    }

    private void sortedCar(ArrayList<Car> cList) {
        System.out.println("List of cars: ");
        cList.sort(Comparator.comparing(Car::getBrand));
        System.out.println(cList.size());
        for (Car car : cList) {
            System.out.println("\tBrand - " + car.getBrand() + ";" + " Model - " + car.getModel() + ";" + " Year - " + car.getYear() + ";");
        }
    }

    private void showCarBrand(ArrayList<Car> cList) {
        System.out.println("Brand: ");
        String brand = sc.nextLine().toUpperCase(Locale.ROOT);
        List<Car> found = cList.stream()
                .filter(u -> u.getBrand().equals(brand))
                .collect(Collectors.toList());
        for (Car car : found) {
            System.out.println("\tBrand - " + car.getBrand() + ";" + " Model - " + car.getModel() + ";" + " Year - " + car.getYear() + ";");
        }
    }

    private void showCar2(ArrayList<Car> cList) {
        System.out.println("List of cars: ");
        for (Car car : cList) {
            System.out.println("\tBrand - " + car.getBrand() + ";" + " Model - " + car.getModel() + ";" + " Year - " + car.getYear() + ";");
        }
    }

    private void removeCar() {
        System.out.println("Brand: ");
        String brand = sc.nextLine().toUpperCase(Locale.ROOT);
        List<Car> targetCar = cList.stream()
                .filter(car -> car.getBrand().equals(brand))
                .collect(Collectors.toList());
        cList.removeAll(targetCar);
    }

    private Car inputCar() {
        System.out.println("Please enter brand car (BMV or Mercedes): ");
        Car car;
        System.out.println("Brand:");
        Brand brand = Brand.valueOf(sc.nextLine().toUpperCase(Locale.ROOT));
        if (brand == Brand.MERCEDES) {
            car = new Mercedes();
            cList.add(car);
        } else if (brand == Brand.BMV) {
            car = new Bmw();
            cList.add(car);
        } else {
            return null;
        }
        System.out.println("Model: ");
        car.setModel(sc.nextLine());
        System.out.println("Year: ");
        car.setYear(Integer.parseInt(sc.nextLine()));
        System.out.println("Car added");
        return car;
    }

    public void menu() {
        System.out.println("\nEnter:");
        System.out.println("\ta. Add car");
        System.out.println("\tb. Remove car");
        System.out.println("\tc. Show car");
        System.out.println("\td. Sort car");
        System.out.println("\te. Show car by brand");
        System.out.println("\tq. Quit Application.");
        System.out.print("\nSelection -> ");
    }
}
