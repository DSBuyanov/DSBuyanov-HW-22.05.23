package ru.geekbrains.lesson3;

import java.util.*;

class Notebook {
    private String brand;
    private int ram;
    private int storage;
    private String operatingSystem;
    private String color;

    public Notebook(String brand, int ram, int storage, String operatingSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

class NotebookStore {
    private Set<Notebook> notebooks;

    public NotebookStore() {
        notebooks = new HashSet<>();
    }

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public List<Notebook> filterNotebooks(Map<String, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            boolean matchesFilter = true;

            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String filterKey = entry.getKey();
                Object filterValue = entry.getValue();

                switch (filterKey) {
                    case "RAM":
                        if (notebook.getRam() < (int) filterValue) {
                            matchesFilter = false;
                        }
                        break;
                    case "Storage":
                        if (notebook.getStorage() < (int) filterValue) {
                            matchesFilter = false;
                        }
                        break;
                    case "OperatingSystem":
                        if (!notebook.getOperatingSystem().equalsIgnoreCase((String) filterValue)) {
                            matchesFilter = false;
                        }
                        break;
                    case "Color":
                        if (!notebook.getColor().equalsIgnoreCase((String) filterValue)) {
                            matchesFilter = false;
                        }
                        break;
                    // Добавьте дополнительные критерии фильтрации, если необходимо
                }

                if (!matchesFilter) {
                    break;
                }
            }

            if (matchesFilter) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

    public void printNotebooks(List<Notebook> notebooks) {
        if (notebooks.isEmpty()) {
            System.out.println("Ноутбуки, удовлетворяющие фильтру, не найдены.");
        } else {
            for (Notebook notebook : notebooks) {
                System.out.println(notebook);
            }
        }
    }
}






