/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-05-28
 */

package com.gamerevision.gwlpr.gwprotocol.actions.loginserver.ctos;

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
public final class P031_UnknownAction extends GenericEventAction
{

    private int unknown1;
    private int unknown2;
    private int unknown3;
    private int unknown4;
    private int unknown5;
    private int unknown6;
    private List<Short> unknown7;
    private List<Short> unknown8;
    private List<Short> unknown9;
    private List<Short> unknown10;
    private List<Short> unknown11;
    private List<Short> unknown12;
    private List<Short> unknown13;
    private List<Short> unknown14;
    private List<Short> unknown15;
    private List<Short> unknown16;
    private List<Short> unknown17;
    private List<Short> unknown18;
    private List<Short> unknown19;
    private List<Short> unknown20;
    private List<Short> unknown21;
    private List<Short> unknown22;


    public short getHeader()
    {
        return 31;
    }


    public int getUnknown1()
    {
        return unknown1;
    }


    public int getUnknown2()
    {
        return unknown2;
    }


    public int getUnknown3()
    {
        return unknown3;
    }


    public int getUnknown4()
    {
        return unknown4;
    }


    public int getUnknown5()
    {
        return unknown5;
    }


    public int getUnknown6()
    {
        return unknown6;
    }


    public List<Short> getUnknown7()
    {
        return unknown7;
    }


    public List<Short> getUnknown8()
    {
        return unknown8;
    }


    public List<Short> getUnknown9()
    {
        return unknown9;
    }


    public List<Short> getUnknown10()
    {
        return unknown10;
    }


    public List<Short> getUnknown11()
    {
        return unknown11;
    }


    public List<Short> getUnknown12()
    {
        return unknown12;
    }


    public List<Short> getUnknown13()
    {
        return unknown13;
    }


    public List<Short> getUnknown14()
    {
        return unknown14;
    }


    public List<Short> getUnknown15()
    {
        return unknown15;
    }


    public List<Short> getUnknown16()
    {
        return unknown16;
    }


    public List<Short> getUnknown17()
    {
        return unknown17;
    }


    public List<Short> getUnknown18()
    {
        return unknown18;
    }


    public List<Short> getUnknown19()
    {
        return unknown19;
    }


    public List<Short> getUnknown20()
    {
        return unknown20;
    }


    public List<Short> getUnknown21()
    {
        return unknown21;
    }


    public List<Short> getUnknown22()
    {
        return unknown22;
    }


    @Override
    public boolean deserialize()
    {
        ByteBuffer buffer = getBuffer();
        int bufferPosition = buffer.position();

        try
        {
            unknown1 = buffer.getInt();
            unknown2 = buffer.getInt();
            unknown3 = buffer.getInt();
            unknown4 = buffer.getInt();
            unknown5 = buffer.getInt();
            unknown6 = buffer.getInt();
            short prefix_unknown7 = buffer.getShort();
            unknown7 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown7; i++)
            {
                unknown7.add(buffer.getShort());
            }
            short prefix_unknown8 = buffer.getShort();
            unknown8 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown8; i++)
            {
                unknown8.add(buffer.getShort());
            }
            short prefix_unknown9 = buffer.getShort();
            unknown9 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown9; i++)
            {
                unknown9.add(buffer.getShort());
            }
            short prefix_unknown10 = buffer.getShort();
            unknown10 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown10; i++)
            {
                unknown10.add(buffer.getShort());
            }
            short prefix_unknown11 = buffer.getShort();
            unknown11 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown11; i++)
            {
                unknown11.add(buffer.getShort());
            }
            short prefix_unknown12 = buffer.getShort();
            unknown12 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown12; i++)
            {
                unknown12.add(buffer.getShort());
            }
            short prefix_unknown13 = buffer.getShort();
            unknown13 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown13; i++)
            {
                unknown13.add(buffer.getShort());
            }
            short prefix_unknown14 = buffer.getShort();
            unknown14 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown14; i++)
            {
                unknown14.add(buffer.getShort());
            }
            short prefix_unknown15 = buffer.getShort();
            unknown15 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown15; i++)
            {
                unknown15.add(buffer.getShort());
            }
            short prefix_unknown16 = buffer.getShort();
            unknown16 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown16; i++)
            {
                unknown16.add(buffer.getShort());
            }
            short prefix_unknown17 = buffer.getShort();
            unknown17 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown17; i++)
            {
                unknown17.add(buffer.getShort());
            }
            short prefix_unknown18 = buffer.getShort();
            unknown18 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown18; i++)
            {
                unknown18.add(buffer.getShort());
            }
            short prefix_unknown19 = buffer.getShort();
            unknown19 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown19; i++)
            {
                unknown19.add(buffer.getShort());
            }
            short prefix_unknown20 = buffer.getShort();
            unknown20 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown20; i++)
            {
                unknown20.add(buffer.getShort());
            }
            short prefix_unknown21 = buffer.getShort();
            unknown21 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown21; i++)
            {
                unknown21.add(buffer.getShort());
            }
            short prefix_unknown22 = buffer.getShort();
            unknown22 = new ArrayList<>();
            
            for (int i = 0; i < prefix_unknown22; i++)
            {
                unknown22.add(buffer.getShort());
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