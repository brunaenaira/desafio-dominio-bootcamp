package br.com.brunaenaira.challenge.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate beginDate = LocalDate.now();
    private final LocalDate endDate = beginDate.plusDays(45);
    private Set<Dev> subscribeDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();


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

    public LocalDate getBeginDate() {
        return beginDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Dev> getSubscribeDevs() {
        return subscribeDevs;
    }

    public void setSubscribeDevs(Set<Dev> subscribeDevs) {
        this.subscribeDevs = subscribeDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(beginDate, bootcamp.beginDate) && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(subscribeDevs, bootcamp.subscribeDevs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, beginDate, endDate, subscribeDevs, contents);
    }
}
