import java.util.*;

public class Condutor {
    float media, volta1, volta2, volta3, volta4, volta5;
    String nome, sobrenome;

    //construtores
    public Condutor() {
    }
    //getters e setters
    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getVolta1() {
        return volta1;
    }

    public void setVolta1(float volta1) {
        this.volta1 = volta1;
    }

    public float getVolta2() {
        return volta2;
    }

    public void setVolta2(float volta2) {
        this.volta2 = volta2;
    }

    public float getVolta3() {
        return volta3;
    }

    public void setVolta3(float volta3) {
        this.volta3 = volta3;
    }

    public float getVolta4() {
        return volta4;
    }

    public void setVolta4(float volta4) {
        this.volta4 = volta4;
    }

    public float getVolta5() {
        return volta5;
    }

    public void setVolta5(float volta5) {
        this.volta5 = volta5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public float Media(){
        return (this.volta1+this.volta2+this.volta3+this.volta4+this.volta5)/5;
    }
    public float Max(){
        return Math.max(Math.max(Math.max(Math.max(this.volta1,this.volta2),this.volta3),this.volta4),this.volta5);
    }
    public float Min(){
        return Math.min(Math.max(Math.max(Math.max(this.volta1,this.volta2),this.volta3),this.volta4),this.volta5);
    }
}
