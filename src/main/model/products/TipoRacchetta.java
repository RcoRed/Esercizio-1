package main.model.products;

public enum TipoRacchetta {

    GOCCIA(5,5),
    ROTONDA(2,8),
    DIAMANTE(8,2);

    private int attackPower;
    private int defencePower;
    private int extraWeight;

    private TipoRacchetta(int attackPower,int defencePower){
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    public int getAttackPower(){
        return attackPower+extraWeight/10;
    }
    public int getDefencePowerr(){
        return this.defencePower;
    }
    public int getExtraWeight(){
        return this.extraWeight;
    }

    public void addExtraWeight(int extraWeight){
        this.extraWeight += extraWeight;
    }
}
