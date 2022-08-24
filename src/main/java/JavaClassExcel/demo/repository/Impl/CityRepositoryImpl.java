package JavaGroup.City.repository.Impl;

import JavaGroup.City.dto.CityDto;
import JavaGroup.City.dto.ResponseDto;
import JavaGroup.City.entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

//@Repository
@RequiredArgsConstructor
public class CityRepositoryImpl {
    private final EntityManager entityManager;
    public List<City> findAll(){
        Query query = entityManager.createQuery("select c from City c left join fetch c.regionList");
        return query.getResultList();
    }

    public List<City> findById(Integer id) {
        Query query = entityManager.createQuery("select c from City c left join fetch c.regionList where c.id = :id");
        query.setParameter("id", id);
        return query.getResultList();
    }
}
