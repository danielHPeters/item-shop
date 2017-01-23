package com.company.models.items;

import com.company.models.people.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel on 09.01.2017.
 */
public class Shop {

    /**
     *
     */
    private List<Item> stock;

    /**
     *
     */
    private List<Consumable> consumableStock;

    /**
     *
     */
    private List<Employee> employees;

    /**
     *
     */
    public Shop() {

        this.stock = new ArrayList<>();
        this.consumableStock = new ArrayList<>();
        this.employees = new ArrayList<>();

    }

    /**
     * @return
     */
    public List<Item> getStock() {
        return stock;
    }

    /**
     * @return
     */
    public List<Consumable> getConsumableStock() {
        return consumableStock;
    }

    /**
     * @return
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param stock
     */
    public void setStock(List<Item> stock) {
        this.stock = stock;
    }

    /**
     * @param consumableStock
     */
    public void setConsumableStock(List<Consumable> consumableStock) {
        this.consumableStock = consumableStock;
    }
}