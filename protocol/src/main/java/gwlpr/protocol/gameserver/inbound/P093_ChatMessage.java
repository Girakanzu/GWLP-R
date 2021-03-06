
package gwlpr.protocol.gameserver.inbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P093_ChatMessage
    extends GWMessage
{

    /**
     * 
     * First char is the chat channel prefix. See the
     * chat channel enum for all available chars.
     * 
     */
    private String prefixedMessage;
    private long agentID1;

    @Override
    public short getHeader() {
        return  93;
    }

    public String getPrefixedMessage() {
        return prefixedMessage;
    }

    public long getAgentID1() {
        return agentID1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P093_ChatMessage[");
        sb.append("prefixedMessage=").append(this.prefixedMessage.toString()).append(",agentID1=").append(this.agentID1).append("]");
        return sb.toString();
    }

}
