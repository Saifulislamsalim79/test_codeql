package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.internal.p104firebaseauthapi.AbstractC3402oh;
import com.google.android.gms.tasks.j;
import java.util.concurrent.Future;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.rh */
/* loaded from: classes2.dex */
public abstract class AbstractC3480rh<T extends AbstractC3402oh> {

    /* renamed from: a */
    private C3376nh<T> f8916a;

    /* renamed from: a */
    public final <ResultT, A extends C2730a.InterfaceC2732b> j<ResultT> m30377a(InterfaceC3454qh<A, ResultT> interfaceC3454qh) {
        return m30375c().f8758a.f(interfaceC3454qh.zza());
    }

    /* renamed from: b */
    public final <ResultT, A extends C2730a.InterfaceC2732b> j<ResultT> m30376b(InterfaceC3454qh<A, ResultT> interfaceC3454qh) {
        return m30375c().f8758a.g(interfaceC3454qh.zza());
    }

    /* renamed from: c */
    public final C3376nh<T> m30375c() {
        C3376nh<T> c3376nh;
        synchronized (this) {
            if (this.f8916a == null) {
                try {
                    this.f8916a = mo29955d().get();
                } catch (Exception e) {
                    String valueOf = String.valueOf(e.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to the GoogleApi: ".concat(valueOf) : new String("There was an error while initializing the connection to the GoogleApi: "));
                }
            }
            c3376nh = this.f8916a;
        }
        return c3376nh;
    }

    /* renamed from: d */
    abstract Future<C3376nh<T>> mo29955d();
}
