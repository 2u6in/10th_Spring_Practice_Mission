package umc.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.domain.member.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
