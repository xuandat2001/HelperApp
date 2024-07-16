package org.timebankapp.timebankapp_backend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private Integer memberId;
    private String userNameMem;
    private String fullNameMem;
    private String passwordMem;
    private String addressMem;
    private String phoneMem;
    private int creditPoint = 0;
    private int skillRatingScore = 0;
    private int supporterRatingScore = 0;
    private boolean availability = false;
    private LocalDate startTime;
    private LocalDate endTime;
    private String skillProvided;
    private int consumingPoint;
    private int minimumRequireHostRatingScore;
    private String comment;
    @OneToMany(
            mappedBy = "member"
    )@JsonManagedReference
    private List<Request> listOfRequest;
    @OneToMany(
            mappedBy = "member"
    )@JsonManagedReference
    private List<Request> listOfFeedback;
}
