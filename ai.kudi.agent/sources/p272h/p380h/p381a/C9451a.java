package p272h.p380h.p381a;

import java.io.UnsupportedEncodingException;
import p576m.C14347f;
/* compiled from: Credentials.java */
/* renamed from: h.h.a.a */
/* loaded from: classes2.dex */
public final class C9451a {
    /* renamed from: a */
    public static String m14703a(String str, String str2) {
        try {
            String mo1961a = C14347f.m2034r((str + ":" + str2).getBytes("ISO-8859-1")).mo1961a();
            return "Basic " + mo1961a;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
