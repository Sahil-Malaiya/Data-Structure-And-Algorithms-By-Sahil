import java.util.Scanner;

class Father {
    static String SurName = "Malaiya";
}

class Sahil extends Father {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name + " " + SurName;
    }
}

class Rishabh extends Father {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name + " " + SurName;
    }
}

public class FamilyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Son1 Name: ");
        String son1Name = sc.nextLine();

        System.out.print("Enter your Son2 Name: ");
        String son2Name = sc.nextLine();

        Sahil s = new Sahil();
        s.setName(son1Name);

        Rishabh r = new Rishabh();
        r.setName(son2Name);

        System.out.println("Name of Son1 is: " + s.getName());
        System.out.println("Name of Son2 is: " + r.getName());

        sc.close();
    }
}
