/**
 *
 * Class is a type of Tram Ticket Upgrade
 * adds an additional fee onto a ticket
 */
package TramUpgrade;

public class RefreshmentUpgrade extends TramTicketUpgrade
{

    /**
     *
     *
     * @param t
     */
    public RefreshmentUpgrade(TramTicketRoute t)
    {
        super(t);
        cost = 2;
        upgrade = "R";
    }
}
