
package gwlpr.protocol.gameserver.outbound;

import gwlpr.protocol.serialization.GWMessage;


/**
 * Auto-generated by PacketCodeGen.
 * 
 */
public final class P308_ItemLocation
    extends GWMessage
{

    private int itemStreamID;
    private long itemLocalID;
    private int pageID;
    private short slot;

    @Override
    public short getHeader() {
        return  308;
    }

    public void setItemStreamID(int itemStreamID) {
        this.itemStreamID = itemStreamID;
    }

    public void setItemLocalID(long itemLocalID) {
        this.itemLocalID = itemLocalID;
    }

    public void setPageID(int pageID) {
        this.pageID = pageID;
    }

    public void setSlot(short slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("P308_ItemLocation[");
        sb.append("itemStreamID=").append(this.itemStreamID).append(",itemLocalID=").append(this.itemLocalID).append(",pageID=").append(this.pageID).append(",slot=").append(this.slot).append("]");
        return sb.toString();
    }

}
