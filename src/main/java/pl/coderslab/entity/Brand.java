package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "brands")
@Setter
@Getter
@ToString(exclude = "items")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @OneToMany(mappedBy = "brand")
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)
    private List<Item> items = new ArrayList<>();
}