package hello;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface BasketMapRepository extends CrudRepository<BasketMap, Integer> {

//    @Query("select c from Currency c where c.currencyCode=?1")
//    Currency findCurrencyByName(String currency);
}
