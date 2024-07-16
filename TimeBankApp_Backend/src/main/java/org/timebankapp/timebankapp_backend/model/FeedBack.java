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
public class  FeedBack {
    @Id
    @GeneratedValue
    private Integer feedBackId;
    private String feedBackTitle;
    private String feedBackContent;
    private  String feedBackSender;
    @ManyToOne
    @JoinColumn(
            name = "member_id"
    )@JsonBackReference
    private Member feedbackRecipient;
}
