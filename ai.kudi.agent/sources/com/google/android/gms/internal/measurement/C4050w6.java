package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.w6 */
/* loaded from: classes2.dex */
final class C4050w6<T> implements InterfaceC4018u6<T> {

    /* renamed from: c */
    volatile InterfaceC4018u6<T> f9815c;

    /* renamed from: d */
    volatile boolean f9816d;

    /* renamed from: e */
    T f9817e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4050w6(InterfaceC4018u6<T> interfaceC4018u6) {
        if (interfaceC4018u6 == null) {
            throw null;
        }
        this.f9815c = interfaceC4018u6;
    }

    public final String toString() {
        Object obj = this.f9815c;
        if (obj == null) {
            String valueOf = String.valueOf(this.f9817e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String obj2 = obj.toString();
        StringBuilder sb2 = new StringBuilder(obj2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(obj2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4018u6
    public final T zza() {
        if (!this.f9816d) {
            synchronized (this) {
                if (!this.f9816d) {
                    InterfaceC4018u6<T> interfaceC4018u6 = this.f9815c;
                    interfaceC4018u6.getClass();
                    T zza = interfaceC4018u6.zza();
                    this.f9817e = zza;
                    this.f9816d = true;
                    this.f9815c = null;
                    return zza;
                }
            }
        }
        return this.f9817e;
    }
}
