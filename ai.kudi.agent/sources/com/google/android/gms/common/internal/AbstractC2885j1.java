package com.google.android.gms.common.internal;

import android.util.Log;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.internal.j1 */
/* loaded from: classes2.dex */
public abstract class AbstractC2885j1<TListener> {

    /* renamed from: a */
    private TListener f8019a;

    /* renamed from: b */
    private boolean f8020b = false;

    /* renamed from: c */
    final /* synthetic */ AbstractC2854c f8021c;

    public AbstractC2885j1(AbstractC2854c abstractC2854c, TListener tlistener) {
        this.f8021c = abstractC2854c;
        this.f8019a = tlistener;
    }

    /* renamed from: a */
    protected abstract void mo31614a(TListener tlistener);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo31613b();

    /* renamed from: c */
    public final void m31718c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f8019a;
            if (this.f8020b) {
                String obj = toString();
                StringBuilder sb = new StringBuilder(obj.length() + 47);
                sb.append("Callback proxy ");
                sb.append(obj);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                mo31614a(tlistener);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f8020b = true;
        }
        m31716e();
    }

    /* renamed from: d */
    public final void m31717d() {
        synchronized (this) {
            this.f8019a = null;
        }
    }

    /* renamed from: e */
    public final void m31716e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        m31717d();
        arrayList = this.f8021c.f7951l;
        synchronized (arrayList) {
            arrayList2 = this.f8021c.f7951l;
            arrayList2.remove(this);
        }
    }
}
