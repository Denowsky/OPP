/*1. Реализовать, с учетом ооп подхода, приложение для проведения исследований с генеалогическим древом.
Идея: описать некоторое количество компонент, например:
* модель человека
* компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, 
брат, свекровь, сестра и т. д.
* компонент для проведения исследований
* дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, 
получение\построение отдельных моделей человека
Под “проведением исследования” можно понимать получение всех детей выбранного человека.
2. Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек. Какие члены должны быть 
у каждого из классов?
3. Подумать как описать логику взаимодействия человека и домашнего питомца. Сценарий: “Человек “зовёт” котика “кис-кис”, 
котик отзывается. Какое ещё взаимодействие может быть?
Продумать какие проблемы могут возникнуть в том, коде, который они написали. 
Например в первой задаче (с генеалогическим древом) мы можем знать о двух людях, но не знаем в каких
 “отношениях” они были - двоюродные или троюродные, или мы точно знаем как звали прапрабабушку, 
 но совершенно не знаем прабабушку - как хранить такие связи или что будет если в компоненту обхода передать ссылку 
 на null-дерево.*/

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya, Relationship.parent);
        gt.append(irina, masha, Relationship.parent);
        gt.append(masha, vasya, Relationship.brotherOrSister);
        gt.append(vasya, jane, Relationship.parent);
        gt.append(vasya, ivan, Relationship.parent);
        gt.append(jane, ivan, Relationship.brotherOrSister);
        //gt.checkSiblings(irina, Relationship.parent);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println(new Reserch(gt).spend(vasya,
                Relationship.brotherOrSister));
    }

}
