package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.internal.AbstractC2854c;
import com.google.android.gms.common.p101n.C2951a;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.v8 */
/* loaded from: classes2.dex */
public final class ServiceConnectionC4399v8 implements ServiceConnection, AbstractC2854c.InterfaceC2855a, AbstractC2854c.InterfaceC2856b {

    /* renamed from: a */
    private volatile boolean f10740a;

    /* renamed from: b */
    private volatile C4288m3 f10741b;

    /* renamed from: c */
    final /* synthetic */ C4410w8 f10742c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC4399v8(C4410w8 c4410w8) {
        this.f10742c = c4410w8;
    }

    /* renamed from: b */
    public final void m27919b(Intent intent) {
        ServiceConnectionC4399v8 serviceConnectionC4399v8;
        this.f10742c.h();
        Context f = ((v5) this.f10742c).a.f();
        C2951a m31567b = C2951a.m31567b();
        synchronized (this) {
            if (this.f10740a) {
                ((v5) this.f10742c).a.b().v().m28014a("Connection attempt already in progress");
                return;
            }
            ((v5) this.f10742c).a.b().v().m28014a("Using local app measurement service");
            this.f10740a = true;
            serviceConnectionC4399v8 = this.f10742c.f10771c;
            m31567b.m31568a(f, intent, serviceConnectionC4399v8, 129);
        }
    }

    /* renamed from: c */
    public final void m27918c() {
        this.f10742c.h();
        Context f = ((v5) this.f10742c).a.f();
        synchronized (this) {
            if (this.f10740a) {
                ((v5) this.f10742c).a.b().v().m28014a("Connection attempt already in progress");
            } else if (this.f10741b != null && (this.f10741b.m31788d() || this.f10741b.isConnected())) {
                ((v5) this.f10742c).a.b().v().m28014a("Already awaiting connection attempt");
            } else {
                this.f10741b = new C4288m3(f, Looper.getMainLooper(), this, this);
                ((v5) this.f10742c).a.b().v().m28014a("Connecting to remote service");
                this.f10740a = true;
                com.google.android.gms.common.internal.s.j(this.f10741b);
                this.f10741b.m31777p();
            }
        }
    }

    /* renamed from: d */
    public final void m27917d() {
        if (this.f10741b != null && (this.f10741b.isConnected() || this.f10741b.m31788d())) {
            this.f10741b.disconnect();
        }
        this.f10741b = null;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c.InterfaceC2855a
    /* renamed from: m */
    public final void mo27916m(int i) {
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onConnectionSuspended");
        ((v5) this.f10742c).a.b().q().m28014a("Service connection suspended");
        ((v5) this.f10742c).a.a().m27810z(new RunnableC4376t8(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c.InterfaceC2856b
    /* renamed from: n */
    public final void mo27915n(C2826b c2826b) {
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onConnectionFailed");
        q3 E = ((v5) this.f10742c).a.E();
        if (E != null) {
            E.w().m28013b("Service connection failed", c2826b);
        }
        synchronized (this) {
            this.f10740a = false;
            this.f10741b = null;
        }
        ((v5) this.f10742c).a.a().m27810z(new RunnableC4388u8(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c.InterfaceC2855a
    /* renamed from: o */
    public final void mo27914o(Bundle bundle) {
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.s.j(this.f10741b);
                ((v5) this.f10742c).a.a().m27810z(new RunnableC4364s8(this, this.f10741b.m31814C()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f10741b = null;
                this.f10740a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC4399v8 serviceConnectionC4399v8;
        InterfaceC4219g3 c4185d3;
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f10740a = false;
                ((v5) this.f10742c).a.b().r().m28014a("Service connected with null binder");
                return;
            }
            InterfaceC4219g3 interfaceC4219g3 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC4219g3) {
                        c4185d3 = (InterfaceC4219g3) queryLocalInterface;
                    } else {
                        c4185d3 = new C4185d3(iBinder);
                    }
                    interfaceC4219g3 = c4185d3;
                    ((v5) this.f10742c).a.b().v().m28014a("Bound to IMeasurementService interface");
                } else {
                    ((v5) this.f10742c).a.b().r().m28013b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                ((v5) this.f10742c).a.b().r().m28014a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC4219g3 == null) {
                this.f10740a = false;
                try {
                    C2951a m31567b = C2951a.m31567b();
                    Context f = ((v5) this.f10742c).a.f();
                    serviceConnectionC4399v8 = this.f10742c.f10771c;
                    m31567b.m31566c(f, serviceConnectionC4399v8);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                ((v5) this.f10742c).a.a().m27810z(new RunnableC4340q8(this, interfaceC4219g3));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.s.e("MeasurementServiceConnection.onServiceDisconnected");
        ((v5) this.f10742c).a.b().q().m28014a("Service disconnected");
        ((v5) this.f10742c).a.a().m27810z(new RunnableC4352r8(this, componentName));
    }
}
