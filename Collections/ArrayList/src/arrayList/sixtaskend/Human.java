package arrayList.sixtaskend;

public class Human {
    String name;
    boolean sex;
    int year;
    Human man;
    Human woman;

    public Human(){}

    public Human(String name, boolean sex, int year){
        this.name = name;
        this.sex = sex;
        this.year = year;
    }

    public Human(String name, boolean sex, int year, Human parent){
        this.name = name;
        this.sex = sex;
        this.year = year;
        if(parent.sex)
            this.man = parent;
        else
            this.woman = parent;
    }

    public Human(String name, boolean sex, int year, Human man, Human woman){
        this.name = name;
        this.sex = sex;
        this.year = year;
        this.man = man;
        this.woman = woman;
    }

    public String toString(){
        String s = "Имя: " + name + ", пол: " + sex + ", yaer: " + year;
        if(man != null) s += ", отец: " + man.name;
        if(woman != null) s += ", мать: " + woman.name;
        return s;
    }
}
