package com.example.productservice.fasada;
import org.springframework.web.bind.annotation.*;
import com.example.productservice.entity.ProductFormDTO;
import com.example.productservice.entity.Response;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.productservice.mediator.ProductMediator;
@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductMediator productMediator;
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> get(@RequestParam(required = false) String name_like,
                                 @RequestParam(required = false) String data,
                                 @RequestParam(required = false) String _category,
                                 @RequestParam(required = false) Float price_min,
                                 @RequestParam(required = false) Float price_max,
                                 @RequestParam(required = false,defaultValue = "1") int _page,
                                 @RequestParam(required = false, defaultValue = "10") int _limit,
                                 @RequestParam(required = false, defaultValue = "price") String _sort,
                                 @RequestParam(required = false,defaultValue = "asc") String _order ){

                        return productMediator.getProduct(_page,_limit,name_like,_category,price_min,price_max,data,_sort,_order);
        }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Response> save(@RequestBody ProductFormDTO productFormDTO){
        return productMediator.saveProduct(productFormDTO);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@RequestParam String uuid){
        return productMediator.deleteProduct(uuid);
    }
    @RequestMapping(value = "getExternal",method = RequestMethod.GET)
    public ResponseEntity<?> getProduct(@RequestParam String uuid){
        return productMediator.getProductExtend(uuid);
    }

}


