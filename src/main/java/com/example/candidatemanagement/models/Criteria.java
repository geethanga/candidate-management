package com.example.candidatemanagement.models;

import com.example.candidatemanagement.models.enums.Track;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Criteria {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String description;
    private Track track;
    @OneToMany(mappedBy = "criteria", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<InterviewFeedback> interviewFeedbacks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Criteria criteria = (Criteria) o;
        return id.equals(criteria.id) && name.equals(criteria.name) && description.equals(criteria.description) && track == criteria.track;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, track);
    }
}
