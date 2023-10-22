package com.plav.user.domain;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

    private long userSeq;
    private String userId;
    private String userPwd;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;

    public User(long userSeq, String userId, String userPwd) {
        this.userSeq = userSeq;
        this.userId = userId;
        this.userPwd = userPwd;
    }
}
