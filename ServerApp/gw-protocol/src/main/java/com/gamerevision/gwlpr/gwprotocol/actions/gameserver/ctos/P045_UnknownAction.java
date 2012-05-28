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
public final class P045_UnknownAction extends GenericEventAction
{

    private int unknown1;
    private byte unknown2;
    private List<Integer> unknown3;


    public short getHeader()
    {
        return 45;
    }


    public int getUnknown1()
    {
        return unknown1;
    }


    public byte getUnknown2()
    {
        return unknown2;
    }


    public List<Integer> getUnknown3()
    {
        return unknown3;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.getInt();
            unknown2 = buffer.get();
            short prefix_unknown3 = buffer.getShort();
            unknown3 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown3; i++)
            {
                unknown3.add(buffer.getInt());
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