package ru.geekbrains.dungeon.game;

import lombok.Data;

import java.util.HashMap;

@Data
public class Weapon {
    public enum Type {
        SPEAR, SWORD, MACE, AXE, BOW
    }

    Type type;
    String title;
    int level;
    int damage;
    int radius;
    int fxIndex;

    // title,level,type,damage,range
    public Weapon(String line) {
        String[] tokens = line.split(",");
        this.title = tokens[0].trim();
        this.level = Integer.parseInt(tokens[1].trim());
        this.type = Type.valueOf(tokens[2].trim());
        this.damage = Integer.parseInt(tokens[3].trim());
        this.radius = Integer.parseInt(tokens[4].trim());
    }
}
