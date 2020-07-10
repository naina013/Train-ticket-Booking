/**
 *
 * Class is a type of Tram Ticket Upgrade
 * adds an additional fee onto a ticket
 */
package TramUpgrade;

public class WifiUpgrade extends TramTicketUpgrade
{

    /**
     *
     * @param t
     */
    public WifiUpgrade(TramTicketRoute t)
    {
        super(t);
        cost = 10;
        upgrade = "W";
    }
}
