package com.lang.text;

import com.github.unidbg.utils.Inspector;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class test {
    public static void main(String[] args) throws DecoderException {
        byte[] data = Hex.decodeHex("37ff000026f40100084c00004687000025704001583e000094eb0200140000009d469901222d0b00d52f01000c0000002a020000a02c00009d0c0000".toCharArray());
        Inspector.inspect(data, "testHex");
    }
}

