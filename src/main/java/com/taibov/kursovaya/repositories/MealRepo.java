package com.taibov.kursovaya.repositories;

import com.taibov.kursovaya.entities.MealTime;
import com.taibov.kursovaya.entities.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MealRepo extends JpaRepository<Meal, Integer>
{
    Meal findMealById(Integer id);
    List<Meal> findMealsByMealtime(MealTime mealtime);
    Meal findMealByName(String name);
}
