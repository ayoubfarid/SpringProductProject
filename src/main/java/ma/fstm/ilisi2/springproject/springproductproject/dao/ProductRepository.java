package ma.fstm.ilisi2.springproject.dao;

import ma.fstm.ilisi2.springproject.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
