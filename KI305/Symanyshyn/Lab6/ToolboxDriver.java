package KI305.Symanyshyn.Lab6;

public class ToolboxDriver {
    public static void main(String[] args) {
        Toolbox<Tool> toolbox = new Toolbox<>();

        // Додавання інструментів
        toolbox.addTool(new Hammer("Hammer", 1500));
        toolbox.addTool(new Screwdriver("Screwdriver", 300));
        toolbox.addTool(new Hammer("Small hammer", 800));

        // Виведення інструменту з найменшою характеристикою
        Tool minTool = toolbox.findMin();
        if (minTool != null) {
            System.out.println("Min instrument: " + minTool.getName());
        }

        // Видалення інструменту
        toolbox.removeTool(1);
    }
}
