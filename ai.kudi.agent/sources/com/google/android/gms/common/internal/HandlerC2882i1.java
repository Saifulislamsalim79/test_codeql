package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.internal.AbstractC2854c;
import p272h.p286c.p287a.p300b.p307d.p312e.HandlerC8431i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.i1 */
/* loaded from: classes2.dex */
public final class HandlerC2882i1 extends HandlerC8431i {

    /* renamed from: a */
    final /* synthetic */ AbstractC2854c f8013a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2882i1(AbstractC2854c abstractC2854c, Looper looper) {
        super(looper);
        this.f8013a = abstractC2854c;
    }

    /* renamed from: a */
    private static final void m31727a(Message message) {
        AbstractC2885j1 abstractC2885j1 = (AbstractC2885j1) message.obj;
        abstractC2885j1.mo31613b();
        abstractC2885j1.m31716e();
    }

    /* renamed from: b */
    private static final boolean m31726b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC2854c.InterfaceC2855a interfaceC2855a;
        AbstractC2854c.InterfaceC2855a interfaceC2855a2;
        C2826b c2826b;
        C2826b c2826b2;
        boolean z;
        if (this.f8013a.f7962w.get() != message.arg1) {
            if (m31726b(message)) {
                m31727a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i != 1 && i != 7 && ((i != 4 || this.f8013a.m31775s()) && message.what != 5)) || this.f8013a.m31788d()) {
            int i2 = message.what;
            if (i2 == 4) {
                this.f8013a.f7959t = new C2826b(message.arg2);
                if (AbstractC2854c.m31782g0(this.f8013a)) {
                    AbstractC2854c abstractC2854c = this.f8013a;
                    z = abstractC2854c.f7960u;
                    if (!z) {
                        abstractC2854c.m31780h0(3, null);
                        return;
                    }
                }
                AbstractC2854c abstractC2854c2 = this.f8013a;
                c2826b2 = abstractC2854c2.f7959t;
                C2826b c2826b3 = c2826b2 != null ? abstractC2854c2.f7959t : new C2826b(8);
                this.f8013a.f7949j.mo31771a(c2826b3);
                this.f8013a.m31809K(c2826b3);
                return;
            } else if (i2 == 5) {
                AbstractC2854c abstractC2854c3 = this.f8013a;
                c2826b = abstractC2854c3.f7959t;
                C2826b c2826b4 = c2826b != null ? abstractC2854c3.f7959t : new C2826b(8);
                this.f8013a.f7949j.mo31771a(c2826b4);
                this.f8013a.m31809K(c2826b4);
                return;
            } else if (i2 == 3) {
                Object obj = message.obj;
                C2826b c2826b5 = new C2826b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
                this.f8013a.f7949j.mo31771a(c2826b5);
                this.f8013a.m31809K(c2826b5);
                return;
            } else if (i2 == 6) {
                this.f8013a.m31780h0(5, null);
                AbstractC2854c abstractC2854c4 = this.f8013a;
                interfaceC2855a = abstractC2854c4.f7954o;
                if (interfaceC2855a != null) {
                    interfaceC2855a2 = abstractC2854c4.f7954o;
                    interfaceC2855a2.mo27916m(message.arg2);
                }
                this.f8013a.m31808L(message.arg2);
                AbstractC2854c.m31784f0(this.f8013a, 5, 1, null);
                return;
            } else if (i2 == 2 && !this.f8013a.isConnected()) {
                m31727a(message);
                return;
            } else if (m31726b(message)) {
                ((AbstractC2885j1) message.obj).m31718c();
                return;
            } else {
                int i3 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                Log.wtf("GmsClient", sb.toString(), new Exception());
                return;
            }
        }
        m31727a(message);
    }
}
