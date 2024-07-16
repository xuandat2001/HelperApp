package org.timebankapp.timebankapp_backend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    @Id
    @GeneratedValue
    private Integer requestId;
    private String requestTitle;
    private String requestContent;
    private org.timebankapp.timebankapp_backend.model.statusRequest statusRequest;
    @ManyToOne
    @JoinColumn(
            name = "member_id"
    )@JsonBackReference
    private Member member;
}
