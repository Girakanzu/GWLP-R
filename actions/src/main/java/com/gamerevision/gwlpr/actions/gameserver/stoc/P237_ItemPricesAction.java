/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-07-19
 */

package com.gamerevision.gwlpr.actions.gameserver.stoc;

import com.realityshard.shardlet.GenericAction;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * This is an automatically generated ShardletAction.
 * It resembles the packet template that has been 
 * parsed from our packet templates xml.
 *
 *
 * @author GWLPR Template Updater
 */
public final class P237_ItemPricesAction extends GenericAction
{

    private int[] prices;


    public short getHeader()
    {
        return 237;
    }


    public void setPrices(int[] newValue)
    {
        prices = newValue;
    }


    private int getSize()
    {
        int size = 4;

        if (prices != null)
        {
            size += 4 * prices.length;
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

            short prefix_prices;
            if (prices == null)
            {
                prefix_prices = 0;
            }
            else
            {
                prefix_prices = (short) prices.length;
            }
            buffer.putShort(prefix_prices);
            
            for (int i = 0; i < prefix_prices; i++)
            {
                buffer.putInt(prices[i]);
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