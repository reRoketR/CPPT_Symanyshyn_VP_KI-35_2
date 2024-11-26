package KI305.Symanyshyn.Lab6;

import java.util.ArrayList;

/**
 * Параметризований клас, що представляє коробку для інструментів.
 *
 * @param <T> Тип інструментів, які зберігаються в коробці. Тип повинен реалізовувати
 *           інтерфейс Tool.
 */
public class Toolbox<T extends Tool> {
    private ArrayList<T> tools;

    /**
     * Конструктор за замовчуванням. Ініціалізує порожню коробку для інструментів.
     */
    public Toolbox() {
        tools = new ArrayList<>();
    }

    /**
     * Додає інструмент до коробки.
     *
     * @param tool Інструмент для додавання.
     */
    public void addTool(T tool) {
        tools.add(tool);
        System.out.println("Інструмент додано: " + tool.getName());
    }

    /**
     * Видаляє інструмент з коробки за індексом.
     *
     * @param index Індекс інструменту для видалення.
     */
    public void removeTool(int index) {
        if (index >= 0 && index < tools.size()) {
            System.out.println("Інструмент видалено: " + tools.get(index).getName());
            tools.remove(index);
        } else {
            System.out.println("Некоректний індекс.");
        }
    }

    /**
     * Повертає інструмент з коробки за індексом.
     *
     * @param index Індекс інструменту.
     * @return Інструмент або null, якщо індекс некоректний.
     */
    public T getTool(int index) {
        if (index >= 0 && index < tools.size()) {
            return tools.get(index);
        }
        System.out.println("Некоректний індекс.");
        return null;
    }

    /**
     * Знаходить інструмент з найменшим значенням характеристик.
     *
     * @return Інструмент з найменшим значенням або null, якщо коробка порожня.
     */
    public T findMin() {
        if (tools.isEmpty()) {
            return null;
        }
        T minTool = tools.get(0);
        for (T tool : tools) {
            if (tool.compareTo(minTool) < 0) {
                minTool = tool;
            }
        }
        return minTool;
    }
}

/**
 * Інтерфейс, який повинен реалізовувати кожен інструмент.
 */
interface Tool extends Comparable<Tool> {
    String getName();
    int getValue(); // Характеристика для порівняння.
}
