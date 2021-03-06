package com.qmdx00.entity;

import com.qmdx00.util.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author yuanweimin
 * @date 19/06/11 08:54
 * @description 所有账户的账号密码存储
 */
@Entity
@Table(name = "t_account")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    // 账号ID
    @Id
    private String id;
    // 账号名称
    private String name;
    // 密码
    private String password;
    // 角色
    @Enumerated(EnumType.STRING)
    private Role role;
}