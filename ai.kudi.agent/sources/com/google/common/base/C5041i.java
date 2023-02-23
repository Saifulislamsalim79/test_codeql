package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;
/* compiled from: Joiner.java */
/* renamed from: com.google.common.base.i */
/* loaded from: classes2.dex */
public class C5041i {

    /* renamed from: a */
    private final String f12689a;

    private C5041i(String str) {
        C5051n.m25780n(str);
        this.f12689a = str;
    }

    /* renamed from: e */
    public static C5041i m25816e(char c) {
        return new C5041i(String.valueOf(c));
    }

    /* renamed from: a */
    public <A extends Appendable> A m25820a(A a, Iterator<?> it) throws IOException {
        C5051n.m25780n(a);
        if (it.hasNext()) {
            a.append(m25815f(it.next()));
            while (it.hasNext()) {
                a.append(this.f12689a);
                a.append(m25815f(it.next()));
            }
        }
        return a;
    }

    /* renamed from: b */
    public final StringBuilder m25819b(StringBuilder sb, Iterator<?> it) {
        try {
            m25820a(sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final String m25818c(Iterable<?> iterable) {
        return m25817d(iterable.iterator());
    }

    /* renamed from: d */
    public final String m25817d(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        m25819b(sb, it);
        return sb.toString();
    }

    /* renamed from: f */
    CharSequence m25815f(Object obj) {
        C5051n.m25780n(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
