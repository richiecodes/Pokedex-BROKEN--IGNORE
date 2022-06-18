package com.richiecodes.pokedex.model;

public class PokemonDTO {
    private String num;
    private String name;
    private String type1;
    private String type2;
    private String total;
    private String hp;
    private String att;
    private String def;
    private String spatk;
    private String spdef;
    private String speed;
    private String gen;
    private String legendary;

    public PokemonDTO(){}

    public PokemonDTO(String num, String name, String type1, String type2,
                   String total, String hp, String att, String def,
                   String spatk, String spdef, String speed, String gen,
                   String legendary) {
        this.num = num;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.att = att;
        this.def = def;
        this.spatk = spatk;
        this.spdef = spdef;
        this.speed = speed;
        this.gen = gen;
        this.legendary = legendary;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getSpatk() {
        return spatk;
    }

    public void setSpatk(String spatk) {
        this.spatk = spatk;
    }

    public String getSpdef() {
        return spdef;
    }

    public void setSpdef(String spdef) {
        this.spdef = spdef;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getLegendary() {
        return legendary;
    }

    public void setLegendary(String legendary) {
        this.legendary = legendary;
    }
}
