package ru.skypro.lessons.springboot.weblibraryhw.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee1")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int salary;
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "position_id")
    private Position position;
}
