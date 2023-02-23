package p272h.p286c.p287a.p288a.p289i;

import java.util.Arrays;
import p272h.p286c.p287a.p288a.C8236b;
/* compiled from: EncodedPayload.java */
/* renamed from: h.c.a.a.i.i */
/* loaded from: classes2.dex */
public final class C8341i {

    /* renamed from: a */
    private final C8236b f19995a;

    /* renamed from: b */
    private final byte[] f19996b;

    public C8341i(C8236b c8236b, byte[] bArr) {
        if (c8236b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr != null) {
            this.f19995a = c8236b;
            this.f19996b = bArr;
            return;
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: a */
    public byte[] m16287a() {
        return this.f19996b;
    }

    /* renamed from: b */
    public C8236b m16286b() {
        return this.f19995a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8341i) {
            C8341i c8341i = (C8341i) obj;
            if (this.f19995a.equals(c8341i.f19995a)) {
                return Arrays.equals(this.f19996b, c8341i.f19996b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19995a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19996b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f19995a + ", bytes=[...]}";
    }
}
