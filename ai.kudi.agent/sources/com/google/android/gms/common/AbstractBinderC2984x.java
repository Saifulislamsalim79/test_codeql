package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC2862c2;
import com.google.android.gms.common.internal.InterfaceC2866d2;
import com.google.android.gms.dynamic.BinderC2989b;
import com.google.android.gms.dynamic.InterfaceC2987a;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.x */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2984x extends AbstractBinderC2862c2 {

    /* renamed from: a */
    private final int f8155a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractBinderC2984x(byte[] bArr) {
        com.google.android.gms.common.internal.s.a(bArr.length == 25);
        this.f8155a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static byte[] m31499o(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2866d2
    /* renamed from: c */
    public final int mo31501c() {
        return this.f8155a;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2866d2
    /* renamed from: d */
    public final InterfaceC2987a mo31500d() {
        return BinderC2989b.m31494p1(mo31498p1());
    }

    public final boolean equals(Object obj) {
        InterfaceC2987a mo31500d;
        if (obj != null && (obj instanceof InterfaceC2866d2)) {
            try {
                InterfaceC2866d2 interfaceC2866d2 = (InterfaceC2866d2) obj;
                if (interfaceC2866d2.mo31501c() == this.f8155a && (mo31500d = interfaceC2866d2.mo31500d()) != null) {
                    return Arrays.equals(mo31498p1(), (byte[]) BinderC2989b.m31495o(mo31500d));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8155a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p1 */
    public abstract byte[] mo31498p1();
}
