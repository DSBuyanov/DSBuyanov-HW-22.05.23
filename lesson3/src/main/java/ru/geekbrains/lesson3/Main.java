package ru.geekbrains.lesson3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        NotebookStore notebookStore = new NotebookStore();

        notebookStore.addNotebook(new Notebook("Brand1", 8, 512, "Windows", "Black"));
        notebookStore.addNotebook(new Notebook("Brand2", 16, 1024, "MacOS", "Silver"));
        notebookStore.addNotebook(new Notebook("Brand3", 12, 256, "Linux", "White"));

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        System.out.println("Введите критерии фильтрации:");

        System.out.print("RAM (минимальное значение): ");
        int minRam = scanner.nextInt();
        filters.put("RAM", minRam);

        System.out.print("Storage (минимальное значение): ");
        int minStorage = scanner.nextInt();
        filters.put("Storage", minStorage);

        System.out.print("OperatingSystem: ");
        String operatingSystem = scanner.next();
        filters.put("OperatingSystem", operatingSystem);

        System.out.print("Color: ");
        String color = scanner.next();
        filters.put("Color", color);

        List<Notebook> filteredNotebooks = notebookStore.filterNotebooks(filters);

        System.out.println("\nРезультаты фильтрации:");
        notebookStore.printNotebooks(filteredNotebooks);
    }
}
