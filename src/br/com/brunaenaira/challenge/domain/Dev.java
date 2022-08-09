package br.com.brunaenaira.challenge.domain;

import java.util.*;

public class Dev {
    private String name;
    private Set<Content> subscribeContents = new LinkedHashSet<>();
    private Set<Content> finishedContents = new LinkedHashSet<>();

    public void toSubscribeBootcamp(Bootcamp bootcamp) {
        this.subscribeContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribeDevs().add(this);
    }

    public void toAdvance() {
        Optional<Content> content = this.subscribeContents.stream().findFirst();
        if (content.isPresent()) {
            this.finishedContents.add(content.get());
            this.subscribeContents.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp() {
        //Pode ser feito tambem com for
        return this.finishedContents
                .stream()
                .mapToDouble(Content::calculatorXp)
                .sum();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribeContents() {
        return subscribeContents;
    }

    public void setSubscribeContents(Set<Content> subscribeContents) {
        this.subscribeContents = subscribeContents;
    }

    public Set<Content> getFinishedContents() {
        return finishedContents;
    }

    public void setFinishedContents(Set<Content> finishedContents) {
        this.finishedContents = finishedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribeContents, dev.subscribeContents) && Objects.equals(finishedContents, dev.finishedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribeContents, finishedContents);
    }
}
