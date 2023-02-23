package androidx.media;

import android.text.TextUtils;
import p201g.p227h.p237k.C7670c;
/* compiled from: MediaSessionManagerImplBase.java */
/* renamed from: androidx.media.e */
/* loaded from: classes2.dex */
class C1597e implements InterfaceC1595c {

    /* renamed from: a */
    private String f4819a;

    /* renamed from: b */
    private int f4820b;

    /* renamed from: c */
    private int f4821c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1597e(String str, int i, int i2) {
        this.f4819a = str;
        this.f4820b = i;
        this.f4821c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1597e) {
            C1597e c1597e = (C1597e) obj;
            return TextUtils.equals(this.f4819a, c1597e.f4819a) && this.f4820b == c1597e.f4820b && this.f4821c == c1597e.f4821c;
        }
        return false;
    }

    public int hashCode() {
        return C7670c.m17874b(this.f4819a, Integer.valueOf(this.f4820b), Integer.valueOf(this.f4821c));
    }
}
