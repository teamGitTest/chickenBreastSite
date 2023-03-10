package kr.co.chikenbreastsite.service.product;

import kr.co.chikenbreastsite.domain.dto.product.UpdateProductDto;
import kr.co.chikenbreastsite.domain.entity.product.Product;
import kr.co.chikenbreastsite.exception.product.ProductNotFoundException;
import kr.co.chikenbreastsite.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateProductService {

    private final ProductRepository productRepository;

    public void updateProduct(UpdateProductDto updateProductDto){
        Product product = productRepository.findByName(updateProductDto.getName())
                .orElseThrow(() -> new ProductNotFoundException());

        product.updateProduct(updateProductDto.getName(), updateProductDto.getPrice());

        productRepository.save(product);
    }
}
