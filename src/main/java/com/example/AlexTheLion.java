package com.example;
import java.util.List;

public class AlexTheLion extends Lion {
    public AlexTheLion(Feline feline, String sex) throws Exception {
        super(feline, sex);
    }

    public List<String> getFriends() {
        return (List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман"));
    }

    public String getPlaceOfLiving() {
        return "Нью-Йорский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }
}
