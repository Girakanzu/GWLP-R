/**
 * For copyright information see the LICENSE document.
 */

/**
 * Auto-generated by PacketCodeGen, on 2012-09-28
 */

package gwlpr.actions.gameserver.stoc;

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
public final class P175_AddMissionObjectiveAction extends GenericAction
{

    private int section;
    private int type;
    private char[] objective;


    public short getHeader()
    {
        return 175;
    }


    public void setSection(int newValue)
    {
        section = newValue;
    }


    public void setType(int newValue)
    {
        type = newValue;
    }


    public void setObjective(char[] newValue)
    {
        objective = newValue;
    }


    private int getSize()
    {
        int size = 12;

        if (objective != null)
        {
            size += 2 * objective.length;
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

            buffer.putInt(section);
            buffer.putInt(type);
            short prefix_objective;
            if (objective == null)
            {
                prefix_objective = 0;
            }
            else
            {
                prefix_objective = (short) objective.length;
            }
            buffer.putShort(prefix_objective);
            
            for (int i = 0; i < prefix_objective; i++)
            {
                buffer.putChar(objective[i]);
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