package com.zhuravlev;

public class Student extends Human {
    private Human dependOn;

    public Student(String name, Human dependOn) {
        super(name,"student");
        this.dependOn = dependOn;
        setSubject( dependOn.getSubject());

    }

    @Override
    public void teaches() throws UniversityException {
        throw new UniversityException("Students don't teach");
    }

    @Override
    public void studies() {
        System.out.println("Student " + getName() + " studies subject " + getSubject());
    }

    @Override
    public void tellAboutDepends() {
        System.out.println("Student " + getName() + " depends on lecturer " + dependOn.getName());
    }
}
