
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P011_Unknown
    extends GWMessage
{

    private String unknown1;

    @Override
    public short getHeader() {
        return  11;
    }

    public void setUnknown1(String unknown1) {
        this.unknown1 = unknown1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P011_Unknown[");
        sb.append("unknown1=").append(this.unknown1 .toString()).append("]");
        return sb.toString();
    }

}
