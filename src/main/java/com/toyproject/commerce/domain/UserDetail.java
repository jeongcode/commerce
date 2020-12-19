package com.toyproject.commerce.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Table(name = "USER_DETAIL")
@Data
@Entity
@RequiredArgsConstructor
public class UserDetail {
    @Id
    @Column(name="USER_DETAIL_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userDetailNo;

}
