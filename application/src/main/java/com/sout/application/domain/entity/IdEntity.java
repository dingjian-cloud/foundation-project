package com.sout.application.domain.entity;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class IdEntity<Type> implements Serializable {

    @Serial
    private static final long serialVersionUID = 7671275747966895068L;

    private Type id;
}
