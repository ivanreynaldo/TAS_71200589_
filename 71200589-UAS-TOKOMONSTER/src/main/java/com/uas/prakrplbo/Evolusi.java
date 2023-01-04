package com.uas.prakrplbo;

public class Evolusi extends Monster{
    private Monster monster1;
    private Monster monster2;

    public Evolusi(Monster monster1, Monster monster2) {
        super(monster1.getNama()+" "+monster2.getNama());
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    @Override
    public String bergerak() {
        return monster2.bergerak();
    }

    @Override
    public String bersuara() {
        String suara1 = monster1.bersuara();
        String suara2 = monster2.bersuara();
        String suara_evolusi = "";
        for (int x = 0;x < suara1.length();x++){
            if (x % 2 == 0){
                suara_evolusi = suara_evolusi + String.valueOf(suara2.charAt(x));
            }else {
                suara_evolusi = suara_evolusi+ String.valueOf(suara1.charAt(x));
            }
        }
        return suara_evolusi;
    }
}
