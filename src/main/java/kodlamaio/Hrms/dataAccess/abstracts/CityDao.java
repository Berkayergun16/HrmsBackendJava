package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.ettities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer>{

}
