package com.odac.tmfapi.tmf634.util;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

public class CustomPageable extends PageRequest {
    private int offset;
    public CustomPageable(int offset, int limit){
        super(offset, limit, Sort.unsorted());
        this.offset=offset;
    }    
    protected CustomPageable(int pageNumber, int pageSize, Sort sort) {
        super(pageNumber, pageSize, sort);
    }
    
    @Override
    public long getOffset () {
        return this.offset;
    }
}