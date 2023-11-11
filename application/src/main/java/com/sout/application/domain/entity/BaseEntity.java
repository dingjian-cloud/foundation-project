package com.sout.application.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity<Type> extends IdEntity<Type> {

    @Serial
    private static final long serialVersionUID = 2986805496818836581L;
}
