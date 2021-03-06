
package gwlpr.protocol.gameserver.inbound;

import java.util.Arrays;
import gwlpr.protocol.serialization.GWMessage;
import gwlpr.protocol.util.IsArray;
import gwlpr.protocol.util.NestedMarker;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P070_Unknown
    extends GWMessage
{

    private short unknown1;
    private long unknown2;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    private P070_Unknown.NestedUnknown3 [] unknown3;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    private byte[] unknown4;
    private long unknown5;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    private P070_Unknown.NestedUnknown6 [] unknown6;
    @IsArray(constant = false, size = 16, prefixLength = 2)
    private byte[] unknown7;

    @Override
    public short getHeader() {
        return  70;
    }

    public short getUnknown1() {
        return unknown1;
    }

    public long getUnknown2() {
        return unknown2;
    }

    public P070_Unknown.NestedUnknown3 [] getUnknown3() {
        return unknown3;
    }

    public byte[] getUnknown4() {
        return unknown4;
    }

    public long getUnknown5() {
        return unknown5;
    }

    public P070_Unknown.NestedUnknown6 [] getUnknown6() {
        return unknown6;
    }

    public byte[] getUnknown7() {
        return unknown7;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P070_Unknown[");
        sb.append("unknown1=").append(this.unknown1).append(",unknown2=").append(this.unknown2).append(",unknown3=").append(Arrays.toString(this.unknown3)).append(",unknown4=").append(Arrays.toString(this.unknown4)).append(",unknown5=").append(this.unknown5).append(",unknown6=").append(Arrays.toString(this.unknown6)).append(",unknown7=").append(Arrays.toString(this.unknown7)).append("]");
        return sb.toString();
    }

    public final static class NestedUnknown3
        implements NestedMarker
    {

        private long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown3[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

    public final static class NestedUnknown6
        implements NestedMarker
    {

        private long unknown1;

        public long getUnknown1() {
            return unknown1;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("NestedUnknown6[");
            sb.append("unknown1=").append(this.unknown1).append("]");
            return sb.toString();
        }

    }

}
