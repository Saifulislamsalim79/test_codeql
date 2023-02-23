package com.google.android.gms.internal.measurement;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.v6 */
/* loaded from: classes2.dex */
final class C4034v6<T> implements Serializable, InterfaceC4018u6 {

    /* renamed from: c */
    final InterfaceC4018u6<T> f9793c;

    /* renamed from: d */
    volatile transient boolean f9794d;

    /* renamed from: e */
    transient T f9795e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4034v6(InterfaceC4018u6<T> interfaceC4018u6) {
        if (interfaceC4018u6 == null) {
            throw null;
        }
        this.f9793c = interfaceC4018u6;
    }

    public final String toString() {
        Object obj;
        if (this.f9794d) {
            String valueOf = String.valueOf(this.f9795e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f9793c;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4018u6
    public final T zza() {
        if (!this.f9794d) {
            synchronized (this) {
                if (!this.f9794d) {
                    T zza = this.f9793c.zza();
                    this.f9795e = zza;
                    this.f9794d = true;
                    return zza;
                }
            }
        }
        return this.f9795e;
    }
}
