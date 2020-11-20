package com.zhuravlev;

public class Lecturer extends Human {

    private Human dependOn;

    public Lecturer(String name, Human dependOn, String subject) {
        super(name,"lecturer");
        this.dependOn = dependOn;
        setSubject(subject);
    }

    @Override
    public void teaches() {
        System.out.println("Lecturer " + getName() + " teaches subject " + getSubject());
    }

    @Override
    public void studies() throws UniversityException {
        throw new UniversityException("Lecturers don't study");
    }

    @Override
    public void tellAboutDepends() {
        System.out.println("Lecturer " + getName() + " depends on dean " + dependOn.getName());
    }
}
