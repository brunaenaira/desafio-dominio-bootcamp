package br.com.brunaenaira.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate mentoringDate;

    @Override
    public double calculatorXp() {
        return XP_DEFAULT + 20d;
    }

    public Mentoring() {
    }

    public LocalDate getMentoringDate() {
        return mentoringDate;
    }

    public void setMentoringDate(LocalDate mentoringDate) {
        this.mentoringDate = mentoringDate;
    }

    @Override
    public String toString() {
        return String.format("Mentoring{title=%s - description=%s - date=%s}", getTitle(), getDescription(), getMentoringDate());
    }
}
