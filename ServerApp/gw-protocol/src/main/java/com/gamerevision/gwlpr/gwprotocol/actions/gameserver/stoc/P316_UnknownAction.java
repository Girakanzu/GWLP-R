/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-05-28
 */

package com.gamerevision.gwlpr.gwprotocol.actions.gameserver.stoc;

import com.realityshard.shardlet.GenericAction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P316_UnknownAction extends GenericAction
{

    private short unknown1;
    private byte unknown2;
    private short unknown3;
    private byte unknown4;
    private int unknown5;


    public short getHeader()
    {
        return 316;
    }


    public void setUnknown1(short newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(byte newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(short newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(byte newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(int newValue)
    {
        unknown5 = newValue;
    }


    private int getSize()
    {
        return 12;
    }


    @Override
    public boolean serialize()
    {
        int size = getSize();

        if (size == 0)
        {
            return false;
        }

        ByteBuffer buffer = ByteBuffer.allocate(size).order(ByteOrder.LITTLE_ENDIAN);

        try
        {
            buffer.putShort(getHeader());

            buffer.putShort(unknown1);
            buffer.put(unknown2);
            buffer.putShort(unknown3);
            buffer.put(unknown4);
            buffer.putInt(unknown5);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}