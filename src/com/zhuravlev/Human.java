package com.zhuravlev;

public abstract class Human implements Scientist{
    private String name;
    private String position;
    private String subject;

    public Human(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public abstract void tellAboutDepends();
    public void tellAboutMe() {
        System.out.println("Name = "+name+", position = "+position);
        tellAboutDepends();
        try {
            teaches();
        } catch (UniversityException e){
            System.out.println("Called exception with method teaches: "+e.getMessage());
        }
        try {
            studies();
        } catch (UniversityException e){
            System.out.println("Called exception with method studies: "+e.getMessage());
        }
    }
}
