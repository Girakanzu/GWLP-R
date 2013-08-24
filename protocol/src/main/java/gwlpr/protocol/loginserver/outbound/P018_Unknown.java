
package gwlpr.protocol.loginserver.outbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P018_Unknown
    extends GWMessage
{

    private long unknown1;
    private long unknown2;
    @IsArray(constant = true, size = 16, prefixLength = -1)
    private byte[] unknown3;
    private String unknown4;
    private String unknown5;
    private String unknown6;

    @Override
    public short getHeader() {
        return  18;
    }

    public void setUnknown1(long unknown1) {
        this.unknown1 = unknown1;
    }

    public void setUnknown2(long unknown2) {
        this.unknown2 = unknown2;
    }

    public void setUnknown3(byte[] unknown3) {
        this.unknown3 = unknown3;
    }

    public void setUnknown4(String unknown4) {
        this.unknown4 = unknown4;
    }

    public void setUnknown5(String unknown5) {
        this.unknown5 = unknown5;
    }

    public void setUnknown6(String unknown6) {
        this.unknown6 = unknown6;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P018_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(Arrays.toString(this.unknown3)).append(",unknown4=").append(this.unknown4 .toString()).append(",unknown5=").append(this.unknown5 .toString()).append(",unknown6=").append(this.unknown6 .toString()).append("]");
        return sb.toString();
    }

}