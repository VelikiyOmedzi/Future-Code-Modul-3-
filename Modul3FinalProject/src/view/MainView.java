package view;

import java.util.ArrayList;

public class MainView extends AppView {//класс, отвечающий за отображение приветственного окна.

    public MainView(ArrayList<AppView> children) {
        super("Shop", children);
    }

    @Override
    public void action() {//выводит информацию о приветственном окне.
        System.out.println("Welcome to my shop");
    }
}
