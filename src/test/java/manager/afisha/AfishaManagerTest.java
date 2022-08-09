package manager.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AfishaManagerTest {

    @Test
    public void addFilm() {  //добавление фильмов, вывод по лимит 10
        AfishaManager film = new AfishaManager();

        film.addAfishaManager("film1");
        film.addAfishaManager("film3");
        film.addAfishaManager("film4");

        String[] expected = {"film1", "film3", "film4"};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmNull() {// не добавляется не один фильм, вывод лимит 10

        AfishaManager film = new AfishaManager();

        String[] expected = {};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmFindLast() { // добавление фильмов, вывод последних 10
        AfishaManager film = new AfishaManager();

        film.addAfishaManager("film1");
        film.addAfishaManager("film2");
        film.addAfishaManager("film3");
        film.addAfishaManager("film4");
        film.addAfishaManager("film5");
        film.addAfishaManager("film6");
        film.addAfishaManager("film7");
        film.addAfishaManager("film8");
        film.addAfishaManager("film9");
        film.addAfishaManager("film10");
        film.addAfishaManager("film11");

        String[] expected = {"film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3", "film2"};
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmFindLastMin() {
        AfishaManager film = new AfishaManager();

        film.addAfishaManager("film1");
        film.addAfishaManager("film2");
        film.addAfishaManager("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void addFilmLimit() {  //добавление фильмов, вывод всех фильмов
        AfishaManager film = new AfishaManager(5);

        film.addAfishaManager("film1");
        film.addAfishaManager("film3");
        film.addAfishaManager("film4");

        String[] expected = {"film1", "film3", "film4"};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmNullLimit() {// не добавляется не один фильм, вывод всех фильмов

        AfishaManager film = new AfishaManager(5);

        String[] expected = {};
        String[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmFindLastLimit() { // добавление фильмов, вывод по лимиту
        AfishaManager film = new AfishaManager(5);

        film.addAfishaManager("film1");
        film.addAfishaManager("film2");
        film.addAfishaManager("film3");
        film.addAfishaManager("film4");
        film.addAfishaManager("film5");
        film.addAfishaManager("film6");
        film.addAfishaManager("film7");
        film.addAfishaManager("film8");
        film.addAfishaManager("film9");
        film.addAfishaManager("film10");
        film.addAfishaManager("film11");

        String[] expected = {"film11", "film10", "film9", "film8", "film7"};
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmFindLastLimitMin() {
        AfishaManager film = new AfishaManager(5);

        film.addAfishaManager("film1");
        film.addAfishaManager("film2");
        film.addAfishaManager("film3");

        String[] expected = {"film3", "film2", "film1"};
        String[] actual = film.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
