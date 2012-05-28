/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-05-28
 */

package com.gamerevision.gwlpr.gwprotocol.actions.gameserver.ctos;

import com.realityshard.shardlet.EventAggregator;
import com.realityshard.shardlet.GenericEventAction;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
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
public final class P067_UnknownAction extends GenericEventAction
{

    private byte unknown1;
    private int unknown2;
    private List<Integer> unknown3;
    private int unknown4;
    private List<Integer> unknown5;


    public short getHeader()
    {
        return 67;
    }


    public byte getUnknown1()
    {
        return unknown1;
    }


    public int getUnknown2()
    {
        return unknown2;
    }


    public List<Integer> getUnknown3()
    {
        return unknown3;
    }


    public int getUnknown4()
    {
        return unknown4;
    }


    public List<Integer> getUnknown5()
    {
        return unknown5;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.get();
            unknown2 = buffer.getInt();
            short prefix_unknown3 = buffer.getShort();
            unknown3 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown3; i++)
            {
                unknown3.add(buffer.getInt());
            }
            unknown4 = buffer.getInt();
            short prefix_unknown5 = buffer.getShort();
            unknown5 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown5; i++)
            {
                unknown5.add(buffer.getInt());
            }
        }
        catch (BufferUnderflowException e)
        {
            buffer.position(bufferPosition);
            return false;
        }

        return true;
    }


    @Override
    public void triggerEvent(EventAggregator aggregator)
    {
        aggregator.triggerEvent(this);
    }
}