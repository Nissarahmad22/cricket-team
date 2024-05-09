package com.example.player;

public class Player {
    private int playerId;
    private String PlayerName;
    private int jerserNumber;
    private String role;

    public Player(int playerId, String PlayerName, int jerseyNumber, String role) {
        this.playerId = playerId;
        this.PlayerName = PlayerName;
        this.jerserNumber = jerseyNumber;
        this.role = role;

    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int PlayerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName() {
        this.PlayerName = Player.Name;
    }

    public int getJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerserNumber = jerseyNumber;
    }

    public String getrRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}