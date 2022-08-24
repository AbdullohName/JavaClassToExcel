package JavaGroup.City.repository.Impl;

import JavaGroup.City.entity.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
//@Repository
@RequiredArgsConstructor
public class DistrictRepositoryImpl {
    private final EntityManager entityManager;
    public List<District> findAll() {
        Query query = entityManager.createQuery("select d from District d left join fetch d.homes");
        return query.getResultList();
    }
}
