package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "items")
@Setter
@Getter
@ToString
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Size(max = 100)
    private String description;

    @NotBlank
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Brand brand;

    @Min(5)
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Category category;
}