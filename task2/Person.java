package examJanuary.task2;

public class Person {
    private String name;
    private String surname;
    private String thirdname;

    public Person(String name, String surname, String thirdname) {
        this.name = name;
        this.surname = surname;
        this.thirdname = thirdname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getThirdname() {
        return thirdname;
    }

    public void setThirdname(String thirdname) {
        this.thirdname = thirdname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", thirdname='" + thirdname + '\'' +
                '}';
    }
}
