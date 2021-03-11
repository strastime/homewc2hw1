package ru.class2hw;

public class Main {

    public static void main(String[] args) {

        Object[] participant  = new Object[6];

        participant [0] = new Human("Человек",15, 7);
        participant [1] = new Cat("Кот",10, 10);
        participant [2] = new Robot("Маруся",30, 30);
        participant [3] = new Cat("Котяра",13, 8);
        participant [4] = new Robot("Электрон",25, 25);
        participant [5] = new Human("Человек",16, 8);

        Object[] obstacles = new Object[6];

        obstacles [0] = new Wall(6);
        obstacles [1] = new Treadmill(20);
        obstacles [2] = new Wall(4);
        obstacles [3] = new Treadmill(30);
        obstacles [4] = new Wall(10);
        obstacles [5] = new Treadmill(35);

        for (int i = 0; i < participant.length; i++) {

            for (int j = 0; j < obstacles.length; j++) {

                if (obstacles[j] instanceof Wall){

                    if (participant[i] instanceof Human){

                        Human.Jump(((Human) participant[i]).getName(),((Wall) obstacles[j]).getWall() , ((Human) participant[i]).getJump());
                    }
                    if (participant[i] instanceof Cat){
                        Cat.Jump(((Cat) participant[i]).getName(),((Wall) obstacles[j]).getWall() , ((Cat) participant[i]).getJump());
                    }
                    if (participant[i] instanceof Robot)
                    {
                        Cat.Jump(((Robot) participant[i]).getName(),((Wall) obstacles[j]).getWall() , ((Robot) participant[i]).getJump());
                    }

                }
                else {
                    if (participant[i] instanceof Human){

                        Human.Run(((Human) participant[i]).getName(),((Treadmill) obstacles[j]).getTreadmill() , ((Human) participant[i]).getJump());
                    }
                    if (participant[i] instanceof Cat){
                        Cat.Run(((Cat) participant[i]).getName(),((Treadmill) obstacles[j]).getTreadmill() , ((Cat) participant[i]).getJump());
                    }
                    if (participant[i] instanceof Robot)
                    {
                        Cat.Run(((Robot) participant[i]).getName(),((Treadmill) obstacles[j]).getTreadmill() , ((Robot) participant[i]).getJump());
                    }

                }

            }
            System.out.println("Все участники пробежали.!!!");
        }

    }
}
