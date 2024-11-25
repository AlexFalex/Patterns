public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String adress;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("No name specified");
        } else this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("No surname specified");
        } else this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("The age cannot be negative");
        } else this.age = age;
        return this;
    }
    public PersonBuilder setAdress(String adress) {
        this.adress = adress;
        return this;
    }
    public Person build() throws IllegalArgumentException {
        Person person;
        if (name ==null || surname == null)
            throw new IllegalArgumentException("the first or last name is not specified");
        if (age < 0) {
            person = new Person(name, surname);
        } else person = new Person(name, surname, age);
        person.setAdress(adress);
        return person;
    }
}
