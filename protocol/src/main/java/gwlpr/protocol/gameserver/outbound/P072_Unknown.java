
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P072_Unknown
    extends GWMessage
{

    private long unknown1;
    private String unknown2;

    @Override
    public short getHeader() {
        return  72;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(String unknown2) {
        this.unknown2 = unknown2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P072_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2 .toString()).append("]");
        return sb.toString();
    }

}
