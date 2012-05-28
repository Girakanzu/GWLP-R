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
public final class P344_UnknownAction extends GenericAction
{

    public final class NestedUnknown13
    {
    
        private int unknown14;


        public void setUnknown14(int newValue)
        {
            unknown14 = newValue;
        }


        private int getSize()
        {
            return 4;
        }


        public boolean serialize(ByteBuffer buffer)
        {
            try
            {
                buffer.putInt(unknown14);
            }
            catch (BufferOverflowException e)
            {
                return false;
            }

            return true;
        }
    }


    private int unknown1;
    private int unknown2;
    private byte unknown3;
    private byte unknown4;
    private short unknown5;
    private short unknown6;
    private byte unknown7;
    private int unknown8;
    private int unknown9;
    private int unknown10;
    private int unknown11;
    private List<Short> unknown12;
    private List<NestedUnknown13> unknown13;


    public short getHeader()
    {
        return 344;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(int newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(byte newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(byte newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(short newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(short newValue)
    {
        unknown6 = newValue;
    }


    public void setUnknown7(byte newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(int newValue)
    {
        unknown8 = newValue;
    }


    public void setUnknown9(int newValue)
    {
        unknown9 = newValue;
    }


    public void setUnknown10(int newValue)
    {
        unknown10 = newValue;
    }


    public void setUnknown11(int newValue)
    {
        unknown11 = newValue;
    }


    public void setUnknown12(List<Short> newValue)
    {
        unknown12 = newValue;
    }


    public void setUnknown13(List<NestedUnknown13> newValue)
    {
        unknown13 = newValue;
    }


    private int getSize()
    {
        int size = 36;

        if (unknown12 == null)
        {
            return 0;
        }
        
        size += 2 * unknown12.size();
        if (unknown13 == null)
        {
            return 0;
        }
        
        for (NestedUnknown13 entry : unknown13)
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

            buffer.putInt(unknown1);
            buffer.putInt(unknown2);
            buffer.put(unknown3);
            buffer.put(unknown4);
            buffer.putShort(unknown5);
            buffer.putShort(unknown6);
            buffer.put(unknown7);
            buffer.putInt(unknown8);
            buffer.putInt(unknown9);
            buffer.putInt(unknown10);
            buffer.putInt(unknown11);
            short prefix_unknown12 = (short) unknown12.size();
            buffer.putShort(prefix_unknown12);
            
            for (int i = 0; i < prefix_unknown12; i++)
            {
                buffer.putShort(unknown12.get(i));
            }
            byte prefix_unknown13 = (byte) unknown13.size();
            buffer.put(prefix_unknown13);
            
            for (int i = 0; i < prefix_unknown13; i++)
            {
                if (!unknown13.get(i).serialize(buffer))
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