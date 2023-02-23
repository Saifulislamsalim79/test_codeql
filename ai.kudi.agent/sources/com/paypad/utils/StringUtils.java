package com.paypad.utils;
/* loaded from: classes2.dex */
public class StringUtils {
    public static final String padLeft(String str, int i, char c) {
        StringBuffer stringBuffer = new StringBuffer(str);
        while (stringBuffer.length() < i) {
            stringBuffer.insert(0, c);
        }
        return stringBuffer.toString();
    }

    public static final String padRight(String str, int i, char c) {
        StringBuffer stringBuffer = new StringBuffer(str);
        while (stringBuffer.length() < i) {
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }
}
