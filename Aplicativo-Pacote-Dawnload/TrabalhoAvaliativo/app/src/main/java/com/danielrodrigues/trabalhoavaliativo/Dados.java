package com.danielrodrigues.trabalhoavaliativo;

public class Dados {
    private String url;
    private String telefone, camera;


    public Dados() {
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "url: " + this.url +
                "\nTelefone:" + this.telefone+
                "\n camera" +this.camera;
    }
}
