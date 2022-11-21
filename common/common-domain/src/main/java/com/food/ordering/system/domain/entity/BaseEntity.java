package com.food.ordering.system.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public abstract class BaseEntity<ID> {

    private ID id;
}
