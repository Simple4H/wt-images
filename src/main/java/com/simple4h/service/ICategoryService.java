package com.simple4h.service;

import com.simple4h.dto.CommonResponseDto;
import com.simple4h.dto.SaveCategoryInputDto;

/**
 * @author Create By Simple4H
 * @date 2019-12-31 10:32
 */
public interface ICategoryService {

    /**
     * @param inputDto 输入
     * @return 通用返回对象
     */
    CommonResponseDto saveCategory(SaveCategoryInputDto inputDto);
}
