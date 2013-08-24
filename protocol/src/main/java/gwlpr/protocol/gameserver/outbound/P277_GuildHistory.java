
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P277_GuildHistory
    extends GWMessage
{

    private long date;
    private String entry;

    @Override
    public short getHeader() {
        return  277;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P277_GuildHistory[");
        sb.append("date=").append(this.date).append(",entry=").append(this.entry.toString()).append("]");
        return sb.toString();
    }

}