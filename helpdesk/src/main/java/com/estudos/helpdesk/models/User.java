package com.estudos.helpdesk.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="User", schema = "seguranca")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email(message = "please provide a valid email")
    @NotEmpty(message = "Can not be blank")
    private String email;
    @NotEmpty(message = "Can not be blank")
    private String name;
    @NotEmpty(message = "Can not be blank")
    private String lasname;

    private Boolean active;

    @NotEmpty(message = "Can not be blank")
    @Length(min = 5, message = "You need to provide a password that contains at least 5 characters")
    private String password;
}
