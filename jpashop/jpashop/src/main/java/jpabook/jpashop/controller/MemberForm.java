package jpabook.jpashop.controller;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberForm {


    // 이름은 필수로 받기 위해 설정.
    // 값이 비어있으면
    @NotEmpty(message = "회원 이름은 필수입니다")
    private String name;

    private String city;
    private String street;
    private String zipcode;
}
