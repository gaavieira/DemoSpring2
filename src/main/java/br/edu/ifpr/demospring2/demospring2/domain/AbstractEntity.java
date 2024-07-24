package br.edu.ifpr.demospring2.demospring2.domain;



import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AbstractEntity <ID extends Serializable> implements Serializable {
    private ID id;
}
