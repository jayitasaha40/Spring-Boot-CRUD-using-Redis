package com.api.redis.models;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//Object should be serializable
public class User implements Serializable {
    private  String userId;
    private String name;
    private String phone;
    private String email;

}
