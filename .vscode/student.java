class main {
    public static void main(String[] args) {
        Student player = new Student(65022342, "wave", 9 / 04 / 2546, 3.25);
        player.Showdeatails();
        player.UpdateName("wave");
        player.Updateaddmisstionyear(9 / 04 / 2546);
        player.UpdateGPA(3.25);
        player.Showdeatails();

    }
}

class Student {
    private int ID;
    private String Name;
    private int addmisstionyear;
    private double GPA;

    Student(int ID, String Name, int addmisstionyear, double GPA) {
        this.ID = ID;
        this.Name = Name;
        this.addmisstionyear = addmisstionyear;
        this.GPA = GPA;

    }

    public void Showdeatails() {
        System.out.println("ID" + this.ID);
        System.out.println("Name" + this.Name);
        System.out.println("addmissionyear" + this.addmisstionyear);
        System.out.println("GPA" + this.GPA);

    }

    public void Setting(int ID, String Name, int addmissionyear, double GPA) {
        this.ID = ID;
        this.Name = Name;
        this.addmisstionyear = addmissionyear;
        this.GPA = GPA;
    }

    public void UpdateName(String newName) {
        Name = newName;
    }

    public void Updateaddmisstionyear(int newaddmissionyear) {
        addmisstionyear = newaddmissionyear;
    }

    public void UpdateGPA(double newGPA) {
        GPA = newGPA;
    }
}
