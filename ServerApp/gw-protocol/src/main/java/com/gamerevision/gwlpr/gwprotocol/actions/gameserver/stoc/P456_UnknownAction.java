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
public final class P456_UnknownAction extends GenericAction
{

    public final class NestedUnknown2
    {
    
        private int unknown3;
        private int unknown4;
        private int unknown5;


        public void setUnknown3(int newValue)
        {
            unknown3 = newValue;
        }


        public void setUnknown4(int newValue)
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


        public boolean serialize(ByteBuffer buffer)
        {
            try
            {
                buffer.putInt(unknown3);
                buffer.putInt(unknown4);
                buffer.putInt(unknown5);
            }
            catch (BufferOverflowException e)
            {
                return false;
            }

            return true;
        }
    }


    private List<Short> unknown1;
    private List<NestedUnknown2> unknown2;


    public short getHeader()
    {
        return 456;
    }


    public void setUnknown1(List<Short> newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(List<NestedUnknown2> newValue)
    {
        unknown2 = newValue;
    }


    private int getSize()
    {
        int size = 5;

        if (unknown1 == null)
        {
            return 0;
        }
        
        size += 2 * unknown1.size();
        if (unknown2 == null)
        {
            return 0;
        }
        
        for (NestedUnknown2 entry : unknown2)
        {
            int nextSize = entry.getSize();
        
            if (nextSize == 0)
            {
                return 0;
            }
        
            size += entry.getSize();
        }

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
            byte prefix_unknown2 = (byte) unknown2.size();
            buffer.put(prefix_unknown2);
            
            for (int i = 0; i < prefix_unknown2; i++)
            {
                if (!unknown2.get(i).serialize(buffer))
                {
                    return false;
                }
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