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
public final class P012_UnknownAction extends GenericAction
{

    private byte unknown1;
    private byte unknown2;
    private int unknown3;
    private int unknown4;
    private byte unknown5;


    public short getHeader()
    {
        return 12;
    }


    public void setUnknown1(byte newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(byte newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(int newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(int newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(byte newValue)
    {
        unknown5 = newValue;
    }


    private int getSize()
    {
        return 13;
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

            buffer.put(unknown1);
            buffer.put(unknown2);
            buffer.putInt(unknown3);
            buffer.putInt(unknown4);
            buffer.put(unknown5);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}