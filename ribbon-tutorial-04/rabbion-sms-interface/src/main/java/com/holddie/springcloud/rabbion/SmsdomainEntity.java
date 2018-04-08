package com.holddie.springcloud.rabbion;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author HoldDie
 * @version 1.0.0
 * @email holddie@163.com
 * @date 2018/4/6 18:27
 */
@Entity
@Data
@Table(name = "smsdomain", schema = "cloud_tutorial")
public class SmsdomainEntity implements Serializable {
    private int smsId;
    private Integer phone;
    private String content;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "smsId")
    public int getSmsId() {
        return smsId;
    }

    public void setSmsId(int smsId) {
        this.smsId = smsId;
    }

    @Basic
    @Column(name = "phone", nullable = true)
    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 255)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmsdomainEntity that = (SmsdomainEntity) o;
        return smsId == that.smsId &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(content, that.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(smsId, phone, content);
    }
}
