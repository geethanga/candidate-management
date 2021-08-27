package com.example.candidatemanagement.models;

import com.example.candidatemanagement.models.enums.Track;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String surName;
    private String email;
    private String phoneNumber;
    private String referredBy;
    private String cvLink;
    private Track track;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReferredBy() { return referredBy; }

    public void setReferredBy(String referredBy) { this.referredBy = referredBy; }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public String getCvLink() { return cvLink; }

    public void setCvLink(String cvLink) { this.cvLink = cvLink; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candidate candidate = (Candidate) o;

        if (!id.equals(candidate.id)) return false;
        if (!firstName.equals(candidate.firstName)) return false;
        if (!surName.equals(candidate.surName)) return false;
        if (!email.equals(candidate.email)) return false;
        return phoneNumber.equals(candidate.phoneNumber);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + surName.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        return result;
    }
}
