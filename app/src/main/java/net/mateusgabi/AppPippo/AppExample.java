package net.mateusgabi.AppPippo;

import ro.pippo.core.Application;

import java.util.ArrayList;

/**
 * @author Mateus Gabi Moreira <mateusgabimoreira@gmail.com>
 *         on 14/09/2017.
 */
public class AppExample extends Application {

    @Override
    protected void onInit() {

        GET("/", routeContext -> routeContext.send("Hello World"));

        GET("/json", routeContext -> {

            Contact contact = new Contact();

            ArrayList<Contact> contacts = new ArrayList<>();

            contact
                    .setId(1)
                    .setName("Mateus Gabi")
                    .setPhone("62621731")
                    .setAddress("dhashdjah");


            contacts.add(contact);
            contacts.add(contact);
            contacts.add(contact);
            contacts.add(contact);
            contacts.add(contact);


            routeContext.json().send(contacts);

        });

    }

}
