package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;
@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game Game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list;

    public BelongingPK() {
    }

    public BelongingPK(com.devsuperior.dslist.entities.Game game, GameList list) {
        Game = game;
        this.list = list;
    }

    public com.devsuperior.dslist.entities.Game getGame() {
        return Game;
    }

    public void setGame(com.devsuperior.dslist.entities.Game game) {
        Game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(Game, that.Game) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Game, list);
    }
}
