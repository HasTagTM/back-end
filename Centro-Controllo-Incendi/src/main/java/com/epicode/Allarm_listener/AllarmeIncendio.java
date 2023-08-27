package com.epicode.Allarm_listener;

public class AllarmeIncendio {
    private int sondaId;
    private int smokeLevel;

    public AllarmeIncendio(int sondaId, int smokeLevel) {
        this.sondaId = sondaId;
        this.smokeLevel = smokeLevel;
    }

    public int getSondaId() {
        return sondaId;
    }

    public int getSmokeLevel() {
        return smokeLevel;
    }
}

