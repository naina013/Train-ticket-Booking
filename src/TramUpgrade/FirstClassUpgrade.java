/**
 *
 * Class is a type of Tram Ticket Upgrade
 * adds an additional fee onto a ticket
 */
package TramUpgrade;

public class FirstClassUpgrade extends TramTicketUpgrade
{
    /**
     *
     * @param t
     */
    public FirstClassUpgrade(TramTicketRoute t)
    {
        super(t);
        cost = 217;
        upgrade = "FC";
        t.getUpgrade();
        System.out.println(t.upgrade);
    }
}
