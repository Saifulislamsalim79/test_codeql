package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Arrays;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.t2 */
/* loaded from: classes2.dex */
final class C3517t2 implements Comparable<C3517t2> {

    /* renamed from: c */
    private final byte[] f8969c;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C3517t2 c3517t2) {
        C3517t2 c3517t22 = c3517t2;
        int length = this.f8969c.length;
        int length2 = c3517t22.f8969c.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f8969c;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = c3517t22.f8969c[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3517t2) {
            return Arrays.equals(this.f8969c, ((C3517t2) obj).f8969c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8969c);
    }

    public final String toString() {
        return C3371nc.m30565a(this.f8969c);
    }
}
