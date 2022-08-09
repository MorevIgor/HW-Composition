package manager.afisha;

public class AfishaManager {

    private int limit;

    private String[] films = new String[0];

    public AfishaManager() {
        this.limit = 10;

    }

    public AfishaManager(int limit) {
        this.limit = limit;


    }

    public String[] addAfishaManager(String film) {

        String[] tmpFilm = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmpFilm[i] = films[i];
        }
        tmpFilm[tmpFilm.length - 1] = film;
        films = tmpFilm;
        return films;
    }

    public String[] findAll() {
        String[] tmpFilm = new String[films.length];
        for (int i = 0; i < tmpFilm.length; i++) {
            tmpFilm[i] = films[films.length - 1 - i];
        }
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (limit <= films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] tmpFilm = new String[resultLength];
        for (int i = 0; i < tmpFilm.length; i++) {
            tmpFilm[i] = films[films.length - 1 - i];
        }
        return tmpFilm;

    }

}
