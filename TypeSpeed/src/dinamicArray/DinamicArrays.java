package dinamicArray;

public class DinamicArrays {

    private String[] strings;

    public DinamicArrays() {

        strings = new String[0];
    }
    public void addWords(String randomWord) {
        String[] newrandomWords = new String[strings.length + 1];

        for (int i = 0; i < strings.length; i++) {
            newrandomWords[i] = strings[i];
        }
        newrandomWords[strings.length] = randomWord;
        strings = newrandomWords;
    }
    public void delete(int index) throws IllegalArgumentException {
        if (index < 0 || index >= strings.length) {
            throw new IllegalArgumentException();
        }
        String[] newStrings = new String[strings.length - 1];

        for (int i = 0, k =0; i < strings.length; i++) {
            if (i == index) {
                continue;
            }
            newStrings[k++] = strings[i];
        }
        strings = newStrings;
    }

    public String get(int index) {
        if (index < 0 || index >= strings.length) {
            throw new IllegalArgumentException();
        }
        return strings[index];
    }

    public int getSize() {
        return strings.length;
    }
}

