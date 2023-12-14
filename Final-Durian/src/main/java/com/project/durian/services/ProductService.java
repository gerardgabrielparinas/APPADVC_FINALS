package com.project.durian.services;

import com.project.durian.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> list();

    void add(ProductDTO productDTO);

    ProductDTO get(Long id);

    void update(ProductDTO productDTO);

    void delete(Long id);

}
