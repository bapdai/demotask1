package ngoquangdai.demotask1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ngoquangdai.demotask1.validation.ProductIDExisting;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ProductIDExisting
    private Long id;

    @NotNull(message = "{NotNull.name}")
    private String name;

    @Size(max = 100)
    private String description;

    @Min(1)
    private BigDecimal price;
}
