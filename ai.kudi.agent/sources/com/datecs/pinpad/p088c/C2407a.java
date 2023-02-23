package com.datecs.pinpad.p088c;
/* compiled from: EMVApplication.java */
/* renamed from: com.datecs.pinpad.c.a */
/* loaded from: classes2.dex */
public class C2407a {

    /* renamed from: a */
    private final byte[] f6916a;

    /* renamed from: b */
    private final byte[] f6917b;

    /* renamed from: c */
    private final int f6918c;

    public C2407a(byte[] bArr, byte[] bArr2, int i) {
        this.f6916a = bArr;
        this.f6917b = bArr2;
        this.f6918c = i;
    }

    /* renamed from: a */
    public byte[] m32973a() {
        return this.f6916a;
    }

    /* renamed from: b */
    public byte[] m32972b() {
        return this.f6917b;
    }

    /* renamed from: c */
    public String m32971c() {
        return new String(this.f6917b);
    }

    /* renamed from: d */
    public int m32970d() {
        return this.f6918c;
    }

    public C2407a(byte[] bArr, String str, int i) {
        this(bArr, str.getBytes(), i);
    }
}
