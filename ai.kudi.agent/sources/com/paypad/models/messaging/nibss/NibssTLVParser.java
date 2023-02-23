package com.paypad.models.messaging.nibss;

import java.util.Dictionary;
import java.util.Hashtable;
/* loaded from: classes2.dex */
public class NibssTLVParser {
    private int LENGTH_CHARS;
    private int TAG_LENGTH;
    private Dictionary<String, String> data = new Hashtable();
    public String tlvString;

    public NibssTLVParser(int i, int i2) {
        this.TAG_LENGTH = i;
        this.LENGTH_CHARS = i2;
    }

    public void parse() {
        char[] charArray = this.tlvString.toCharArray();
        int i = 0;
        while (i < charArray.length) {
            char[] cArr = new char[this.TAG_LENGTH];
            char[] cArr2 = new char[this.LENGTH_CHARS];
            int i2 = 0;
            while (i2 <= this.TAG_LENGTH) {
                cArr[i2] = charArray[i];
                i2++;
            }
            while (i2 <= this.LENGTH_CHARS) {
                cArr2[i2 - this.TAG_LENGTH] = charArray[i];
                i2++;
            }
            while (i2 <= Integer.parseInt(cArr2.toString())) {
                i++;
            }
        }
    }

    public void setString(String str) {
        this.tlvString = str;
    }
}
