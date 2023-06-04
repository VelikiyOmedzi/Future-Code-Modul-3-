package view;

import java.util.ArrayList;

public abstract class AppView {//дефолтное отображение информации.
    public final String title;//название окошка.
    public final ArrayList<AppView> children;//список дочерних отображений.

    public AppView(String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }
    public abstract void action();//отображает информацию.

    public void displayChildren() {//выводит детей.
        System.out.println(title);
        System.out.println("Choose from 1 to " + (children.size() + 1));
        for (int i = 0; i < children.size(); i++) {
            System.out.println((i + 1) + " - " + children.get(i).title);
        }
        System.out.println((children.size()+1) + " - Back");
    }
}
