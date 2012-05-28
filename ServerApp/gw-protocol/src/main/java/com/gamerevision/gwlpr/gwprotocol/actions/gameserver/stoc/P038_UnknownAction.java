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
public final class P038_UnknownAction extends GenericAction
{

    private List<Short> unknown1;


    public short getHeader()
    {
        return 38;
    }


    public void setUnknown1(List<Short> newValue)
    {
        unknown1 = newValue;
    }


    private int getSize()
    {
        int size = 4;

        if (unknown1 == null)
        {
            return 0;
        }
        
        size += 2 * unknown1.size();

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

            short prefix_unknown1 = (short) unknown1.size();
            buffer.putShort(prefix_unknown1);
            
            for (int i = 0; i < prefix_unknown1; i++)
            {
                buffer.putShort(unknown1.get(i));
            }
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}