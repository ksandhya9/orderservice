package com.ecommerce.orderserviceProject.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All details about the user.")
@Entity
@Table(name="orders")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Item{

    @Id
    @GeneratedValue
    private Integer item_id;

    @ApiModelProperty(notes="Name should have atleast 2 characters")
    private String item_name;

    private Integer item_qty;

    private Double item_subtotal;

    private Date returnby;

    private Integer order_id;

    @ManyToOne
    @JoinColumn(name="order_id", nullable=false)
    private Order order;

}