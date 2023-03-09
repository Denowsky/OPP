/*1. Реализовать, с учетом ооп подхода, приложение для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
* модель человека
* компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, 
брат, свекровь, сестра и т. д.++
* компонент для проведения исследований ???
* дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, 
получение\построение отдельных моделей человека
Под “проведением исследования” можно понимать получение всех детей выбранного человека.++
2. Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек. Какие члены(??) должны быть 
у каждого из классов?++
3. Подумать как описать логику взаимодействия человека и домашнего питомца. Сценарий: “Человек “зовёт” котика “кис-кис”, 
котик отзывается. Какое ещё взаимодействие может быть? ++
Продумать какие проблемы могут возникнуть в том, коде, который они написали. 
Например в первой задаче (с генеалогическим древом) мы можем знать о двух людях, но не знаем в каких
 “отношениях” они были - двоюродные или троюродные, или мы точно знаем как звали прапрабабушку, 
 но совершенно не знаем прабабушку - как хранить такие связи или что будет если в компоненту обхода передать ссылку 
 на null-дерево.*/

 import Applications.Notepad;
 import Format.*;
 

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", "female");
        Person vasya = new Person("Вася", "male");
        Person masha = new Person("Маша", "female");
        Person jane = new Person("Женя", "female");
        Person ivan = new Person("Ваня", "male");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.appendSibling(vasya, masha);
        gt.append(ivan, masha);
        gt.append(ivan, vasya);
        gt.appendSibling(ivan, jane);
        Animal cat = new Cat("Барски");


        System.out.println(new Reserch(gt).spend(ivan,Relationship.father));
        System.out.println(new Reserch(gt).spend(ivan,Relationship.brother));
        System.out.println(new Reserch(gt).spend(irina,Relationship.mother));
        System.out.println(new Reserch(gt).spend(masha,Relationship.daughter));
        System.out.println(new Reserch(gt).spend(masha,Relationship.sister));
        Person.voice(ivan,"Кот");
        System.out.println(cat.voice());
        Person.voice(masha, "Шкаф");

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());
    }

}
