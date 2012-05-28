/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-05-28
 */

package com.gamerevision.gwlpr.gwprotocol.actions.loginserver.stoc;

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
public final class P006_UnknownAction extends GenericAction
{

    private int unknown1;
    private List<Byte> unknown2;
    private List<Byte> unknown3;
    private List<Byte> unknown4;
    private List<Byte> unknown5;
    private int unknown6;


    public short getHeader()
    {
        return 6;
    }


    public void setUnknown1(int newValue)
    {
        unknown1 = newValue;
    }


    public void setUnknown2(List<Byte> newValue)
    {
        unknown2 = newValue;
    }


    public void setUnknown3(List<Byte> newValue)
    {
        unknown3 = newValue;
    }


    public void setUnknown4(List<Byte> newValue)
    {
        unknown4 = newValue;
    }


    public void setUnknown5(List<Byte> newValue)
    {
        unknown5 = newValue;
    }


    public void setUnknown6(int newValue)
    {
        unknown6 = newValue;
    }


    private int getSize()
    {
        int size = 42;

        if (unknown2 == null)
        {
            return 0;
        }
        
        if (unknown2.size() != 8)
        {
            return 0;
        }
        if (unknown3 == null)
        {
            return 0;
        }
        
        if (unknown3.size() != 8)
        {
            return 0;
        }
        if (unknown4 == null)
        {
            return 0;
        }
        
        if (unknown4.size() != 8)
        {
            return 0;
        }
        if (unknown5 == null)
        {
            return 0;
        }
        
        if (unknown5.size() != 8)
        {
            return 0;
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
            for (int i = 0; i < 8; i++)
            {
                buffer.put(unknown2.get(i));
            }
            for (int i = 0; i < 8; i++)
            {
                buffer.put(unknown3.get(i));
            }
            for (int i = 0; i < 8; i++)
            {
                buffer.put(unknown4.get(i));
            }
            for (int i = 0; i < 8; i++)
            {
                buffer.put(unknown5.get(i));
            }
            buffer.putInt(unknown6);
        }
        catch (BufferOverflowException e)
        {
            return false;
        }

        setBuffer(buffer);

        return true;
    }
}