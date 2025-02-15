package com.example.emailverification.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class MessagePost {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @NotEmpty(message = "Message is empty")
    private String message;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
