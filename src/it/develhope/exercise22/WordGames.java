package it.develhope.exercise22;

/**
 * @author Jason Di Bartolo
 * This class rapresents a Word Games
 */
public class WordGames {

    public String word;
    public String name;
    public String surname;

    /**
     *This method return a word
     * @param word variable for word
     * @return the return is the concatenation of String "Hello" and word
     */
    public String addHelloWord(String word){
        this.word=word;
        return "Hello " + word;
    }

    /**
     * This method return a full name
     * @param name variable for  name
     * @param surname variable for surname
     * @return the return is the concatenation of name and surname
     */
    public String getFullName(String name, String surname){
        this.name=name;
        this.surname=surname;
        return name + " " + surname;
    }
}
