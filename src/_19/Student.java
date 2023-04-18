package _19;

public class Student {
    private String name;
    private String surname;
    private int freshman;
    private int age;
    private String placeOfProvenience;


    public Student (String name, String surname, int freshman, int age, String placeOfProvenience){
        this.name = name;
        this.surname = surname;
        this.freshman = freshman;
        this.age = age;
        this.placeOfProvenience = placeOfProvenience;
    }

    public String getName (){
        return this.name;
    }

    public void setName(String name){
        if(name.length() == 0){
            System.out.println("La stringa e' vuota!");
        } else {
            this.name = name;
        }
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        if(surname.length() == 0){
            System.out.println("La stringa e' vuota!");
        } else {
            this.surname = surname;
        }
    }

    public int getFreshman(){
        return this.freshman;
    }

    public void setFreshman (int freshman){
        // la matricola deve avere 5 cifre
        if(freshman <= 10_000 || freshman >= 99_999){
            System.out.println("Freshman: Errore!!" );
        } else {
            this.freshman = freshman;
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age < 0 || age <= 18){
            System.out.println("Eta: Errore!!!");
        } else {
            this.age = age;
        }
    }

    public String getPlaceOfProvenience(){
        return this.placeOfProvenience;
    }

    public void setPlaceOfProvenience(String placeOfProvenience){
        if(placeOfProvenience.length() == 0){
            System.out.println("La stringa e' vuota!");
        } else {
            this.placeOfProvenience = placeOfProvenience;
        }
    }

}
