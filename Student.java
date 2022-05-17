public class Student {
    private String name;
    private int old;
    private String school;
    Student (String name,int old,String school){
        this.name=name;
        this.old=old;
        this.school=school;
    }
    public String getName(){
        return this.name;
    }
    public String getSchool(){
        return this.school;
    }
    public int getOld(){
        return this.old;
    }
}
