
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P044_AgentAttributeCreate
    extends GWMessage
{

    private long agentID;
    private short freePts;
    private short maxPts;

    @Override
    public short getHeader() {
        return  44;
    }

    public void setAgentID(long agentID) {
        this.agentID = agentID;
    }

    public void setFreePts(short freePts) {
        this.freePts = freePts;
    }

    public void setMaxPts(short maxPts) {
        this.maxPts = maxPts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P044_AgentAttributeCreate[");
        sb.append("agentID=").append(this.agentID).append(",freePts=").append(this.freePts).append(",maxPts=").append(this.maxPts).append("]");
        return sb.toString();
    }

}
