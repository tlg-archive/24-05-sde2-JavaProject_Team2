package com.game.components.board;

import java.nio.file.Path;
import java.util.List;

class Board {
    //fields
    private List<SafeZone> safeZones;
    private List<JailZone> jailZones;
    private List<HomeZone> homeZones;
    private List<Path> paths;

    //constructor
    public Board(List<SafeZone> safeZones, List<JailZone> jailZones, List<HomeZone> homeZones, List<Path> paths) {
        this.safeZones = safeZones;
        this.jailZones = jailZones;
        this.homeZones = homeZones;
        this.paths = paths;
    }

    //accessors


    public List<SafeZone> getSafeZones() {
        return safeZones;
    }

    public void setSafeZones(List<SafeZone> safeZones) {
        this.safeZones = safeZones;
    }

    public List<JailZone> getJailZones() {
        return jailZones;
    }

    public void setJailZones(List<JailZone> jailZones) {
        this.jailZones = jailZones;
    }

    public List<HomeZone> getHomeZones() {
        return homeZones;
    }

    public void setHomeZones(List<HomeZone> homeZones) {
        this.homeZones = homeZones;
    }

    public List<Path> getWhiteSpaces() {
        return paths;
    }

    public void setWhiteSpaces(List<Path> paths) {
        this.paths = paths;
    }
}