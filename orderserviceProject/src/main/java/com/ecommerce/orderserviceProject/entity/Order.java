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
public class Order{

    @Id
    @GeneratedValue
    private Integer order_id;

    @ApiModelProperty(notes="Name should have atleast 2 characters")
    private String order_status;

    private Integer order_customer_id;

    private Double order_subtotal;

    private Double order_tax;

    private Double order_shipping_charges;

    private Double order_total;

    private Date create_date;

    private Date modified_date;

    @OneToMany(mappedBy="order_id")
    private Set<Items> items;

}