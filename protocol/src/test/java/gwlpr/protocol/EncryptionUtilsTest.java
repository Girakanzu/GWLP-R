/**
 * For copyright information see the LICENSE document.
 */

package gwlpr.protocol;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import gwlpr.protocol.handshake.EncryptionUtils;


/**
 *
 * @author _rusty
 */
public class EncryptionUtilsTest 
{
    
    private static short[] expectedPupKey = new short[] {    
        0xC3, 0xA2, 0x0C, 0xE0, 0x72, 0x21, 0xAE, 0xF5,
        0xAE, 0x1A, 0x36, 0xD5, 0x35, 0x23, 0xC3, 0x0D, 
        0x74, 0x21, 0x15, 0x06, 0x63, 0x8F, 0x38, 0x6B,
        0x83, 0x7E, 0x6A, 0x3C, 0xFE, 0x51, 0xD0, 0x13,
        0x69, 0x40, 0xE9, 0x3E, 0x49, 0x80, 0x37, 0x8B, 
        0xF4, 0x88, 0x86, 0x48, 0x59, 0x64, 0x86, 0x3D, 
        0x43, 0xD0, 0x7A, 0x59, 0xE5, 0x58, 0x91, 0x24, 
        0x8D, 0x23, 0x2C, 0x4C, 0x28, 0x8F, 0xAF, 0xA1 };

    
    @Test
    public void testPublicKey()
    {
        byte[] pubKey = EncryptionUtils.generateServerPublicKey();
        
        assertThat(pubKey, equalTo(getByteArray(expectedPupKey)));
    }
    
    
    
    private static short[] input1 = new short[] { 
        0x1B, 0x67, 0xFF, 0xB6, 0x12, 0x94, 0x49, 0x9B, 
        0x5D, 0x12, 0x72, 0x0E, 0x11, 0xAA, 0x43, 0x08,
        0x8E, 0x26, 0xB3, 0x66 }; 
    
    private static short[] expectedHash1 = new short[] { 
        0x4B, 0xB9, 0x73, 0xCD, 0xCA, 0x6E, 0x46, 0x3A, 
        0x6C, 0x21, 0x3E, 0x99, 0x2E, 0x4B, 0x4A, 0x0B, 
        0x42, 0x13, 0xEC, 0xD6 }; 
    
    private static short[] input2 = new short[] { 
        0xD3, 0x65, 0x9F, 0x05, 0xB8, 0x79, 0x07, 0x5B,
        0xCB, 0x25, 0x95, 0x51, 0x1B, 0x53, 0x56, 0x19, 
        0xEB, 0x24, 0xA8, 0x45 }; 
    
    private static short[] expectedHash2 = new short[] { 
        0x03, 0xB8, 0x13, 0x1C, 0x70, 0x54, 0x04, 0xFA, 
        0x3A, 0xDE, 0x5B, 0x79, 0xEA, 0x14, 0x7F, 0x92, 
        0x67, 0x40, 0x64, 0xE1 };
    
    
    @Test
    public void testHashing()
    {
        byte[] hash1 = EncryptionUtils.hash(getByteArray(input1));
        
        assertThat(hash1, equalTo(getByteArray(expectedHash1)));
        
        byte[] hash2 = EncryptionUtils.hash(getByteArray(input2));
        
        assertThat(hash2, equalTo(getByteArray(expectedHash2)));
    }
    
    
    private byte[] getByteArray(short[] a)
    {
        byte[] result = new byte[a.length];
        
        for (int i = 0; i < a.length; i++) {
            result[i] = (byte)a[i];
        }
        
        return result;
    }
}