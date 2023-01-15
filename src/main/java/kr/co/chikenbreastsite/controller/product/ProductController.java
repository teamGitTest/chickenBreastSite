package kr.co.chikenbreastsite.controller.product;

import kr.co.chikenbreastsite.domain.dto.product.AddProductDto;
import kr.co.chikenbreastsite.domain.dto.product.GetProductDto;
import kr.co.chikenbreastsite.domain.dto.product.UpdateProductDto;
import kr.co.chikenbreastsite.service.product.AddProductService;
import kr.co.chikenbreastsite.service.product.DeleteProductService;
import kr.co.chikenbreastsite.service.product.GetProductService;
import kr.co.chikenbreastsite.service.product.UpdateProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final AddProductService addProductService;

    private final GetProductService getProductService;

    private final DeleteProductService deleteProductService;

    private final UpdateProductService updateProductService;
    @PostMapping
    public void AddProduct(@RequestBody @Valid AddProductDto addProductDto){
        addProductService.addProduct(addProductDto);
    }

    @GetMapping//해당 번호 상품 가져오기기능
    public GetProductDto getProduct(@RequestParam("ProductIdentity") String ProductIdentity){
        return getProductService.getProduct(ProductIdentity);
    }

    @DeleteMapping
    public void DeleteProduct(@RequestParam("ProductIdentity") String ProductIdentity){
        deleteProductService.DeleteProduct(ProductIdentity);
    }

    @PutMapping
    public void updateProduct(@RequestBody @Valid UpdateProductDto updateProductDto){
        updateProductService.updateProduct(updateProductDto);
    }
}
