package org.homeprog.customerrequestsstat.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "request_stats", uniqueConstraints={@UniqueConstraint(columnNames = {"customer_id" , "time"})})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private DBCustomer dbCustomer;

    @Column(name="time", columnDefinition="DATETIME")
    private LocalDateTime time;

    @Column(name="is_valid")
    private boolean isValid;

    @Transient
    private String remoteIp;

    @Transient
    private String userAgent;
}
