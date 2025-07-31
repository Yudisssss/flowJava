public class User {
    public String name;
    public int age;

    public User() {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void AgeVerificattion(int age){
        if (age < 18){
            System.out.println("Você não pode trabalhar aqui sendo menor de idade");
        }
    }
}