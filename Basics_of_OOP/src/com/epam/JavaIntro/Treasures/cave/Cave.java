package com.epam.JavaIntro.Treasures.cave;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Cave {

    private ArrayList<Treasure> treasures;

    public Cave() {
        this.treasures = new ArrayList<Treasure>();
    }

    public void adder() {
        ArrayList<Treasure> tres = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\Оля\\IdeaProjects\\treasures\\src\\Program\\txtFile\\Treasures.txt"))) {
            String line;
            String separator = ",";
            int count = 1;
            while ((line = read.readLine()) != null) {
                String[] temp = line.split(separator);


                Treasure treasure = null;

                if (temp[1].equals("Украшение")) {
                    if (temp[2].equals("браслет")) {
                        treasure = new Jewellery(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Jewellery.JewelleryType.BRACELET);
                        count++;
                    }
                    if (temp[2].equals("кольцо")) {
                        treasure = new Jewellery(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Jewellery.JewelleryType.RING);
                        count++;
                    }
                    if (temp[2].equals("диадема")) {
                        treasure = new Jewellery(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Jewellery.JewelleryType.DIADEM);
                        count++;
                    }
                }
                if (temp[1].equals("Посуда")) {
                    if (temp[2].equals("кубок")) {
                        treasure = new Utensil(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Utensil.UtensilType.CUP);
                        count++;
                    }
                    if (temp[2].equals("блюдо")) {
                        treasure = new Utensil(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Utensil.UtensilType.DISHES);
                        count++;
                    }
                }
                if (temp[1].equals("Деньги")) {
                    if (temp[2].equals("монета")) {
                        treasure = new Money(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Money.MoneyType.COIN);
                        count++;
                    }
                    if (temp[2].equals("банкнота")) {
                        treasure = new Money(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Money.MoneyType.BANKNOTE);
                        count++;
                    }
                }
                if (temp[1].equals("Камни")) {
                    if (temp[2].equals("рубин")) {
                        treasure = new Gem(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Gem.GemType.RUBY);
                        count++;
                    }
                    if (temp[2].equals("бриллиант")) {
                        treasure = new Gem(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Gem.GemType.DIAMOND);
                        count++;
                    }
                    if (temp[2].equals("изумруд")) {
                        treasure = new Gem(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Gem.GemType.EMERALD);
                        count++;
                    }
                }
                if (temp[1].equals("Слиток")) {
                    if (temp[2].equals("золото")) {
                        treasure = new Bullion(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Bullion.BullionType.GOLD);
                        count++;
                    }
                    if (temp[2].equals("платина")) {
                        treasure = new Bullion(count, temp[1], temp[2], temp[3], Integer.parseInt(temp[4]), Bullion.BullionType.PLATINUM);
                        count++;
                    }
                }
                tres.add(treasure);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        treasures = tres;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cave)) return false;
        Cave cave = (Cave) o;
        return Objects.equals(treasures, cave.treasures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treasures);
    }

    @Override
    public String toString() {
        return "Cave{" +
                "treasures=" + treasures +
                '}';
    }
}
