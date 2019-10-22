package eu.epitech.cashmanager31.cashmanager.repository;

import eu.epitech.cashmanager31.cashmanager.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    @Query("SELECT i FROM Item i WHERE i.Name = :name")
    Optional<Item> findByName(@Param("name") String name);
}