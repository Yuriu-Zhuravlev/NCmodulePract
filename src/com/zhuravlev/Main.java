package com.zhuravlev;

public class Main {

    public static void main(String[] args) {
        Human[] humans = new Human[13];
        humans[0] = new Dean("Vasiliev");
        humans[1] = new Lecturer("Shelehov",humans[0],"ITT");
        humans[2] = new Lecturer("Kuzikov",humans[0],"BD");
        humans[3] = new Student("Kotelevsky",humans[1]);
        humans[4] = new Student("Chechil",humans[1]);
        humans[5] = new Student("Trusov",humans[1]);
        humans[6] = new Student("Zhuravlev",humans[1]);
        humans[7] = new Student("Isaev",humans[1]);
        humans[8] = new Student("Logutov",humans[2]);
        humans[9] = new Student("Goncharova",humans[2]);
        humans[10] = new Student("Belym",humans[2]);
        humans[11] = new Student("Birincev",humans[2]);
        humans[12] = new Student("Mishenko",humans[2]);
        for (Human human: humans) {
            human.tellAboutMe();
        }
    }
}
