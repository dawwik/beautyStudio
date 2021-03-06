package com.beautystudio.studio.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "subcategories")
public class SubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private double price;

    @OneToMany(mappedBy = "subCategory")
    private List<Reservation> reservation;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
