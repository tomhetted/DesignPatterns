package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class CatholicChurch implements Observable {

    private List<Observer> parishioners;
    private String news;

    public CatholicChurch() {
        parishioners = new ArrayList<>();
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        parishioners.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        parishioners.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : parishioners) {
            o.update(news);
        }
    }

    public static void main(String[] args) {
        var catholicChurch = new CatholicChurch();

        new Parishioner("Мартин Лютер", catholicChurch);
        new Parishioner("Жан Кальвин", catholicChurch);

        catholicChurch.setNews("Инквизиция была ошибкой... месса Mea Culpa 12 марта 2000 года");
    }

}
