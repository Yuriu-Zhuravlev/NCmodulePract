package com.zhuravlev;

public class Dean extends Human {


    public Dean(String name) {
        super(name,"dean");
    }

    @Override
    public void teaches() throws UniversityException {
        throw new UniversityException("Deans don't teach");
    }

    @Override
    public void studies() throws UniversityException {
        throw new UniversityException("Deans don't study");
    }

    @Override
    public void tellAboutDepends() {
        System.out.println("Dean " + getName() + " depend on no one");
    }
}
