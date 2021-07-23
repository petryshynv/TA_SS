package com.training.hw2;


import com.training.hw2.model.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Task2 {
    private Scanner sc = new Scanner(System.in);

    public void consoleMenu() {
        MenuOptions menuOptions = MenuOptions.z;
        Car car = new Car();
        ArrayList<Car> cList = new ArrayList();
        while (menuOptions != MenuOptions.q)
            try {
                menu();
                menuOptions = MenuOptions.valueOf(sc.nextLine());
                switch (menuOptions) {
                    case a:
                        car = inputCar();
                        if (car != null) {
                            cList.add(inputCar());
                        } else {
                            System.out.println("Brand was not found");
                        }
                        break;
                    case b:
                        System.out.println("Car removed");
                        break;
                    case c:
                        showCar(cList);
                        break;
                    case d:
                        System.out.println("Car sorted");
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

    private void showCar(ArrayList<Car> cList) {
        System.out.println("Model: ");
        String model = sc.nextLine();
        Optional<Car> foundCar = cList.stream().filter(c -> c.getModel().equals(model)).findFirst();
        if (foundCar.isPresent()) {
            System.out.println(foundCar);
        } else {
            System.out.println("Car not found");
        }
        System.out.println("Car showed");
    }

    private Car inputCar() {
        System.out.println("Please afasfasfas");
        Car car;
        System.out.println("Brand:");
        Brand brand = Brand.valueOf(sc.nextLine());
        if (brand == Brand.MERCEDES) {
            car = new Mercedes();
        } else if (brand == Brand.BMV) {
            car = new Bmw();
        } else {
            return null;
        }
        System.out.println("Model: ");
        car.setModel(sc.nextLine());
        System.out.println("Year");
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
        System.out.println("\tq. Quit Application.");
        System.out.print("\nSelection -> ");

    }


}
