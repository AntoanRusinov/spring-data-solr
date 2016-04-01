package application.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import application.model.Product;

public interface CustomSolrRepository {

	Page<Product> findProductsByCustomImplementation(String value, Pageable page);

	void updateProductCategory(String productId, List<String> categories);

}