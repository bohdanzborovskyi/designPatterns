package org.example.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator  implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String msg, Colleague colleague) {
        for (Colleague c : colleagues) {
            // message should not be relayed back to the sender
            if (c != colleague) {
                c.receive(msg);
            }
        }
    }
}
