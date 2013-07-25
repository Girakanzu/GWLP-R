/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package gwlpr.actions.loginserver.stoc;

import realityshard.shardlet.utils.GenericAction;
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
public final class P022_AccountGuiInfoAction extends GenericAction
{

    private int loginCount;
    private byte[] settings;


    public short getHeader()
    {
        return 22;
    }


    public void setLoginCount(int newValue)
    {
        loginCount = newValue;
    }


    public void setSettings(byte[] newValue)
    {
        settings = newValue;
    }


    private int getSize()
    {
        int size = 8;

        if (settings != null)
        {
            size += 1 * settings.length;
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

            buffer.putInt(loginCount);
            short prefix_settings;
            if (settings == null)
            {
                prefix_settings = 0;
            }
            else
            {
                prefix_settings = (short) settings.length;
            }
            buffer.putShort(prefix_settings);
            
            for (int i = 0; i < prefix_settings; i++)
            {
                buffer.put(settings[i]);
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