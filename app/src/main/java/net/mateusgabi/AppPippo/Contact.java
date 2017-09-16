package net.mateusgabi.AppPippo;

import java.io.Serializable;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 14/09/2017.
 */
public class Contact implements Serializable {
    private int id;
    private String name;
    private String phone;
    private String address;

    public int getId() {
        return id;
    }

    public Contact setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Contact setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Contact setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Contact setAddress(String address) {
        this.address = address;
        return this;
    }
}
