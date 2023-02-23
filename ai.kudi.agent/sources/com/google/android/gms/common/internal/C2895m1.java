package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.internal.AbstractC2854c;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.m1 */
/* loaded from: classes2.dex */
public final class C2895m1 extends AbstractC2930w0 {

    /* renamed from: g */
    public final IBinder f8032g;

    /* renamed from: h */
    final /* synthetic */ AbstractC2854c f8033h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2895m1(AbstractC2854c abstractC2854c, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC2854c, i, bundle);
        this.f8033h = abstractC2854c;
        this.f8032g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2930w0
    /* renamed from: f */
    protected final void mo31612f(C2826b c2826b) {
        if (this.f8033h.f7955p != null) {
            this.f8033h.f7955p.mo27915n(c2826b);
        }
        this.f8033h.m31809K(c2826b);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2930w0
    /* renamed from: g */
    protected final boolean mo31611g() {
        AbstractC2854c.InterfaceC2855a interfaceC2855a;
        AbstractC2854c.InterfaceC2855a interfaceC2855a2;
        try {
            IBinder iBinder = this.f8032g;
            s.j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f8033h.mo15471D().equals(interfaceDescriptor)) {
                String mo15471D = this.f8033h.mo15471D();
                StringBuilder sb = new StringBuilder(String.valueOf(mo15471D).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(mo15471D);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.w("GmsClient", sb.toString());
                return false;
            }
            IInterface mo15466r = this.f8033h.mo15466r(this.f8032g);
            if (mo15466r == null || !(AbstractC2854c.m31784f0(this.f8033h, 2, 4, mo15466r) || AbstractC2854c.m31784f0(this.f8033h, 3, 4, mo15466r))) {
                return false;
            }
            this.f8033h.f7959t = null;
            Bundle m31774w = this.f8033h.m31774w();
            AbstractC2854c abstractC2854c = this.f8033h;
            interfaceC2855a = abstractC2854c.f7954o;
            if (interfaceC2855a != null) {
                interfaceC2855a2 = abstractC2854c.f7954o;
                interfaceC2855a2.mo27914o(m31774w);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
