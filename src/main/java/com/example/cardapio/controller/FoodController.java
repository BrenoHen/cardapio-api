package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);
    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

    @GetMapping("/{id}")
    public Optional<Food> getById(@PathVariable(value = "id") Long id){
        return foodRepository.findById(id);
    }

    @DeleteMapping
    public void deleteFood(@RequestBody FoodResponseDTO data){
        Food foodData = new Food(data.id(), data.title(), data.image(), data.price());
        foodRepository.delete((foodData));
    }

    @PutMapping
    public void updateFood(@RequestBody FoodResponseDTO data){
        Food foodData = new Food(data.id(), data.title(), data.image(), data.price());
        foodRepository.save((foodData));
    }

}
