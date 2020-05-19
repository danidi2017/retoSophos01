package com.metro.www.userinterface;

public enum OpcionPagina {

    WEB("https://www.metro.pe/especiales/cybermetro");
    private final String url;

    OpcionPagina(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
