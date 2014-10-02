package com.company;

import java.util.Scanner;

/**
 * Created by Шушматик on 02.10.2014.
 */
public class Babeshka {
    String answer;
    Scanner scanner = new Scanner(System.in);
    public boolean readAnswer(){
        String answer = scanner.next();
        return answer.equals("да");
    }



    public void wakeUp(){
        System.out.println("Пора просыпаться. Надеюсь сегодня будет хороший день :) Сегодня выходной?\n");
        if (readAnswer()){
            System.out.println("Выспалась?");
            if (readAnswer()){
                System.out.println("*Пол дня провела в душе, пробуя разные шампуньки и кремчики*");
                fitnes();
            }
            else goToBed();
        }
        else goToTheWork();
    }

    public void goToTheWork(){
        System.out.println("*Включен скоростной режим по сбору на работу*\nЯ ОПАЗДЫВАЮ!!!быстрее,быстрее! Блин!Не успела на автобус( \n Оподзала?\n");
        if (readAnswer()){
            System.out.println("Ну вот( опять опоздала... Встречу ли я начальника?\n");
            if (readAnswer())System.out.println("Шеф, такое больше никогда не повториться,честное слово 0:)\n Уф...\n");
            tea_mood();
        }
        else wakeUp();
    }
    public void tea_mood(){
        System.out.println("Пойти что ли чаю попить... Там девченки(*сплетни*) и вкусняшки \n*прошло неопределенное количество времени*\n Надоели уже эти дурынды... Чем заняться..." );
        mood();
    }
    public void mood(){
        System.out.println("Какое у нее настроение?\n" +
                "введите 1 если настроение рабочее\n" +
                "2 если игривое\n" +
                "3 если нет настроения\n" +
                "4 - 'Эти дни'\n");
        int herMood=0;
        try {
            herMood =Integer.parseInt(scanner.next());
        } catch  (Exception e) {
            System.out.println("Input ERROR\nTry again\n");
            mood();
        }
        switch (herMood){
            case 1: workingMood(); break;
            case 2: playfulMood(); break;
            case 3: notInTheMood();break;
            case 4: theseDays();break;
            default:{
                System.out.println("Что-то я не поняла...\n *введите число от 1 до 4 еще раз*\n");
                mood();
            } break;
        }
    }
    public void workingMood(){
        System.out.println("Может уже наконец таки поработать... А задание есть?\n");
        if (readAnswer()){
            System.out.println("Настроение еще рабочее?\n");
            if (readAnswer()){
                System.out.println("Ну что ж... за работу!\n*прошло 15 минут...*\n*поправляет макияж*\n");
                diner();
            }
            else {
                System.out.println("Да ну эту работу, не хочу! Лучше почту проверю. А что там в контакте интересного?...\n");
                diner();
            }
        }
        else {
            System.out.println("Какая жалость... ну и ладно. Не сильно и хотелось.Лучше почту проверю. А что там в контакте интересного?... \n");
            diner();
        }
    }

    public void playfulMood(){
        System.out.println("Какой интересный мужчина...\n *флирт с коллегами*\n");
        diner();
    }

    public void notInTheMood(){
        diner();
    }

    public void theseDays() {
        System.out.println("Привет, дорогой )))...\n" +
                "НЕ ЗВОНИ СЮДА БОЛЬШЕ!!!!!!!\n");
        diner();
    }

    public void diner(){
        System.out.println("Что-то я проголодалась. Не пора ли на обед?\n");
        if (readAnswer()){
            System.out.println("А как же диета?\n *на диете?*\n");
            if (readAnswer()){
                System.out.println("Хочу плоский живот! И вовсе я не голодна. Салатика будет достаточно\n" +
                        "...\nНо я ведь и так красивая...");
            }
            System.out.println("*первое*\n*второе*\n хм...что-то я еще голодна\n*второе и десертик*\n" +
                    "Это мое отражение? Господи!Какая же я ЖИРНАЯ!!! Так,все! С завтрашнего дня сажусь на диету!");
            wantToGoHome();
        }
        else tea_mood();
    }

    public void wantToGoHome(){
        System.out.println("Хочу домой... Может меня пораньше отпустят?");
        if (readAnswer()) goHome();
        else {

            timeToGoHome();
        }
    }

    public void timeToGoHome(){
        System.out.println("Ну и ладно! Все равно ничего делать не буду!");
        System.out.println("Который час... Уже пора домой?");
        if (readAnswer()) goHome();
        else timeToGoHome();
    }

    public void goHome(){
        System.out.println("Ура! Домой!");
        fitnes();
    }

    public void fitnes(){
        System.out.println("А теперь фитнес! Нужно собрать вещи..." +
                "*прошло некоторое время* *устала пока собиралась?*");
        if (readAnswer()) System.out.println("Ну этот фитнес. Останусь дома. Ммм...какие вкусные пирожки");
        else System.out.println("Готово!*фитнес* Уф... теперь домой...");
        timeToSleep();
    }

    public void timeToSleep(){
        System.out.println("Который час... Уже пора спать?");
        if (readAnswer()) {
            do
                System.out.println("Посмотрю только 1 серию...Что? Уже 5 утра?");
            while(!readAnswer());
            goToBed();
        }
        else boyfrendCall();
    }

    public void boyfrendCall(){
        System.out.println("Парень позвонил?");
        if (readAnswer()){
            System.out.println("Хочется поскандалить?");
            if (readAnswer()){
                System.out.println("... БОЛЬШЕ НЕ ЗВОНИ СЮДА!");
                goWithGirls();
            }
            else{
                System.out.println("Свидание? ) с удовольствием...");
                timeToGoHome2();
            }
        }
        else checkToDo();
    }
    public void timeToGoHome2(){
        System.out.println("Который час... Уже пора домой?");
        if (readAnswer()){
            System.out.println("Вот я и дома");
            timeToSleep();
        }
        else checkToDo();
    }

    public void checkToDo(){
        System.out.println("введите 1 если она пойдет гулять с подругами\n" +
                "2 если шопинг\n" +
                "3 если клуб\n" );

        int herCheck=0;
        try {
            herCheck =Integer.parseInt(scanner.next());
        } catch  (Exception e) {
            System.out.println("Input ERROR\nTry again\n");
            checkToDo();
        }
        switch (herCheck){
            case 1: goWithGirls(); break;
            case 2: shoping(); break;
            case 3: club();break;
            default:{
                System.out.println("Что-то я не поняла...\n *введите число от 1 до 3 еще раз*\n");
                checkToDo();
            } break;
        }
    }
    public void goWithGirls(){
        System.out.println("Пойду с подругами гулять");
        timeToGoHome2();
    }

    public void shoping(){
        System.out.println("Пойду по магазинам");
        timeToGoHome2();
    }

    public void club(){
        System.out.println("Пойду в клуб");
        timeToGoHome2();
    }

    public void goToBed(){
        System.out.println("Спааааааааааааать........");
        wakeUp();
    }

}
