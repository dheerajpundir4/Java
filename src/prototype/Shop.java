package prototype;

import java.awt.print.Book;
import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Books> arrayList;

    public ArrayList<Books> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Books> arrayList) {
        this.arrayList = arrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void loadData(){
        ArrayList<Books> a1=new ArrayList<>();
        for (int i=1;i<=8;i++){
            a1.add(new Books(1,"Books"+1));
        }
        setArrayList(a1);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", arrayList=" + arrayList +
                '}';
    }
}
