package com.company;

class Race {
    String race;
    int sGrow;
    int pGrow;
    int eGrow;
    int cGrow;
    int wGrow;
    int aGrow;
    int lGrow;
    private void statgen(int s, int p, int e, int c, int w, int a, int l){
        sGrow = s;
        pGrow = p;
        eGrow = e;
        cGrow = c;
        wGrow = w;
        aGrow = a;
        lGrow = l;
    }
    Race(String i){
        race = i;
        switch (race){
            case "human":
                statgen(100,100,100,100,100,100,100);
                break;
            case "orc":
                statgen(150,80,120,80,80,80,100);
                break;
            default:
                System.out.println("That race was not found, assigning you the default.");
                statgen(100,100,100,100,100,100,100);
                break;
        }
    }
    Race(){
        statgen(100,100,100,100,100,100,100);
    }
    void printGrowth(){
        System.out.println(sGrow + " " + pGrow + " " + eGrow + " " + cGrow + " " + wGrow + " " + aGrow + " " + lGrow);
    }
}
