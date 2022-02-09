package br.com.alura.mvc.mudi.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    public String username;
    public String password;
    public Boolean enable;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user", fetch = FetchType.LAZY)
    private List<Pedido> pedidos;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }
}
