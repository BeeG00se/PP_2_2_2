package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class CarsServiceImpl implements CarsService {
    @Override
    public List<Car> getCars(List<Car> cars, int count) {
        if (count == 0) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
