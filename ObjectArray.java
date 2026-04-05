class Student{
    int id;
    String name;
    void setData(int id, String name){
        this.id = id;
        this.name = name;
    }
    void Display(){
        System.out.println(id+" name is "+name);
    }
}
class ObjectArray{
    public static void main(String[] args) {
        Student[] s = new Student[3];
        s[0] = new Student();
        s[1] = new Student();
        s[2] = new Student();
        s[0].setData(0, "vinay");
        s[1].setData(1, "varun");
        s[2].setData(2, "Yaswitha");
        s[0].Display();
        s[1].Display();
        s[2].Display();
    }
}