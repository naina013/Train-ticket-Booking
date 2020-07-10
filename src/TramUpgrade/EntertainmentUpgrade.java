/**
 * A Decorator class, which adds new functionality into TramTicketRoute object.
 * This Decorator class modifies price() method to implement
 * new behaviour.
 * Class is a type of Tram Ticket Upgrade
 * adds an additional fee onto a ticket
 */
package TramUpgrade;

public class EntertainmentUpgrade extends TramTicketUpgrade
{

    /**
     *
     *
     * @param t
     */
    public EntertainmentUpgrade(TramTicketRoute t)
    {
        super(t);
        cost = 100;
        upgrade = "E";
    }
}
