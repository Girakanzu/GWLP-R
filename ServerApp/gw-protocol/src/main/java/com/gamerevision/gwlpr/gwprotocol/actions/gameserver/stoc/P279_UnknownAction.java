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
public final class P279_UnknownAction extends GenericAction
{

    private short unknown1;
    private List<Byte> unknown2;
    private List<Short> unknown3;
    private List<Short> unknown4;
    private byte unknown5;
    private byte unknown6;
    private byte unknown7;
    private byte unknown8;
    private byte unknown9;
    private byte unknown10;
    private byte unknown11;
    private short unknown12;
    private byte unknown13;
    private byte unknown14;
    private int unknown15;
    private int unknown16;
    private int unknown17;
    private int unknown18;
    private byte unknown19;


    public short getHeader()
    {
        return 279;
    }


    public void setUnknown1(short newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(List<Byte> newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(List<Short> newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(List<Short> newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(byte newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(byte newValue)
    {
        unknown6 = newValue;
    }


    public void setUnknown7(byte newValue)
    {
        unknown7 = newValue;
    }


    public void setUnknown8(byte newValue)
    {
        unknown8 = newValue;
    }


    public void setUnknown9(byte newValue)
    {
        unknown9 = newValue;
    }


    public void setUnknown10(byte newValue)
    {
        unknown10 = newValue;
    }


    public void setUnknown11(byte newValue)
    {
        unknown11 = newValue;
    }


    public void setUnknown12(short newValue)
    {
        unknown12 = newValue;
    }


    public void setUnknown13(byte newValue)
    {
        unknown13 = newValue;
    }


    public void setUnknown14(byte newValue)
    {
        unknown14 = newValue;
    }


    public void setUnknown15(int newValue)
    {
        unknown15 = newValue;
    }


    public void setUnknown16(int newValue)
    {
        unknown16 = newValue;
    }


    public void setUnknown17(int newValue)
    {
        unknown17 = newValue;
    }


    public void setUnknown18(int newValue)
    {
        unknown18 = newValue;
    }


    public void setUnknown19(byte newValue)
    {
        unknown19 = newValue;
    }


    private int getSize()
    {
        int size = 52;

        if (unknown2 == null)
        {
            return 0;
        }
        
        if (unknown2.size() != 16)
        {
            return 0;
        }
        if (unknown3 == null)
        {
            return 0;
        }
        
        size += 2 * unknown3.size();
        if (unknown4 == null)
        {
            return 0;
        }
        
        size += 2 * unknown4.size();

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

            buffer.putShort(unknown1);
            for (int i = 0; i < 16; i++)
            {
                buffer.put(unknown2.get(i));
            }
            short prefix_unknown3 = (short) unknown3.size();
            buffer.putShort(prefix_unknown3);
            
            for (int i = 0; i < prefix_unknown3; i++)
            {
                buffer.putShort(unknown3.get(i));
            }
            short prefix_unknown4 = (short) unknown4.size();
            buffer.putShort(prefix_unknown4);
            
            for (int i = 0; i < prefix_unknown4; i++)
            {
                buffer.putShort(unknown4.get(i));
            }
            buffer.put(unknown5);
            buffer.put(unknown6);
            buffer.put(unknown7);
            buffer.put(unknown8);
            buffer.put(unknown9);
            buffer.put(unknown10);
            buffer.put(unknown11);
            buffer.putShort(unknown12);
            buffer.put(unknown13);
            buffer.put(unknown14);
            buffer.putInt(unknown15);
            buffer.putInt(unknown16);
            buffer.putInt(unknown17);
            buffer.putInt(unknown18);
            buffer.put(unknown19);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}