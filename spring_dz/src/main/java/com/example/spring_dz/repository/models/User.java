package com.example.spring_dz.repository.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "users")
@Entity// це як @controller тіки з моделю
@Data// упрощає жизнь getter, setter, toString, equals-порівнює
@NoArgsConstructor// генерація конструктора пустого
@AllArgsConstructor// генерація конструктора з всіма полями
public class User {
    @Id // ід який створює в майскюл
    @GeneratedValue(strategy = GenerationType.IDENTITY)//автоматично записує правильне ід
    private Long id;

    @Column(name = "first_name" , nullable = false)// nullable- чи може бути 0(неможе)
    private String firstName;

    @Column(name = "last_name" , nullable = false)
    private String lastName;

    @Column(name = "email")
    private String email;




}
