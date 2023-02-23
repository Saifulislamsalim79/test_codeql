package com.google.android.datatransport.cct;
/* compiled from: StringMerger.java */
/* renamed from: com.google.android.datatransport.cct.e */
/* loaded from: classes2.dex */
public final class C2587e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m32567a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
