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
import java.util.List;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 * Auto generated 
 *
 * @author GWLPR Template Updater
 */
public final class P401_UnknownAction extends GenericAction
{

    private byte unknown1;
    private List<Short> unknown2;
    private List<Short> unknown3;
    private byte unknown4;
    private int unknown5;
    private int unknown6;
    private int unknown7;
    private int unknown8;


    public short getHeader()
    {
        return 401;
    }


    public void setUnknown1(byte newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(List<Short> newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(List<Short> newValue)
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


    public void setUnknown6(int newValue)
    {
        unknown6 = newValue;
    }


    public void setUnknown7(int newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(int newValue)
    {
        unknown8 = newValue;
    }


    private int getSize()
    {
        int size = 24;

        if (unknown2 == null)
        {
            return 0;
        }
        
        size += 2 * unknown2.size();
        if (unknown3 == null)
        {
            return 0;
        }
        
        size += 2 * unknown3.size();

        return size;
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
            short prefix_unknown2 = (short) unknown2.size();
            buffer.putShort(prefix_unknown2);
            
            for (int i = 0; i < prefix_unknown2; i++)
            {
                buffer.putShort(unknown2.get(i));
            }
            short prefix_unknown3 = (short) unknown3.size();
            buffer.putShort(prefix_unknown3);
            
            for (int i = 0; i < prefix_unknown3; i++)
            {
                buffer.putShort(unknown3.get(i));
            }
            buffer.put(unknown4);
            buffer.putInt(unknown5);
            buffer.putInt(unknown6);
            buffer.putInt(unknown7);
            buffer.putInt(unknown8);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}