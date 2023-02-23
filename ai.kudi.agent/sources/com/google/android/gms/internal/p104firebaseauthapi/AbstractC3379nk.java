package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.s;
import com.google.firebase.C5988g;
import com.google.firebase.auth.AbstractC5197c;
import com.google.firebase.auth.AbstractC5203f;
import com.google.firebase.auth.AbstractC5270r;
import com.google.firebase.auth.internal.InterfaceC5235m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.nk */
/* loaded from: classes2.dex */
public abstract class AbstractC3379nk<ResultT, CallbackT> implements InterfaceC3454qh<InterfaceC3083cj, ResultT> {

    /* renamed from: a */
    protected final int f8760a;

    /* renamed from: c */
    protected C5988g f8762c;

    /* renamed from: d */
    protected AbstractC5203f f8763d;

    /* renamed from: e */
    protected CallbackT f8764e;

    /* renamed from: f */
    protected InterfaceC5235m f8765f;

    /* renamed from: h */
    protected Executor f8767h;

    /* renamed from: i */
    protected C3140em f8768i;

    /* renamed from: j */
    protected C3640xl f8769j;

    /* renamed from: k */
    protected C3274jl f8770k;

    /* renamed from: l */
    protected C3459qm f8771l;

    /* renamed from: m */
    protected String f8772m;

    /* renamed from: n */
    protected String f8773n;

    /* renamed from: o */
    protected AbstractC5197c f8774o;

    /* renamed from: p */
    protected String f8775p;

    /* renamed from: q */
    protected String f8776q;

    /* renamed from: r */
    protected C3504sf f8777r;

    /* renamed from: s */
    private boolean f8778s;

    /* renamed from: t */
    ResultT f8779t;

    /* renamed from: u */
    protected C3353mk f8780u;

    /* renamed from: b */
    final BinderC3300kk f8761b = new BinderC3300kk(this);

    /* renamed from: g */
    protected final List<AbstractC5270r> f8766g = new ArrayList();

    public AbstractC3379nk(int i) {
        this.f8760a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ void m30542f(AbstractC3379nk abstractC3379nk) {
        abstractC3379nk.mo29957a();
        s.n(abstractC3379nk.f8778s, "no success or failure set on method implementation");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* synthetic */ void m30541g(AbstractC3379nk abstractC3379nk, Status status) {
        InterfaceC5235m interfaceC5235m = abstractC3379nk.f8765f;
        if (interfaceC5235m != null) {
            interfaceC5235m.mo25258b(status);
        }
    }

    /* renamed from: a */
    public abstract void mo29957a();

    /* renamed from: b */
    public final AbstractC3379nk<ResultT, CallbackT> m30546b(CallbackT callbackt) {
        s.k(callbackt, "external callback cannot be null");
        this.f8764e = callbackt;
        return this;
    }

    /* renamed from: c */
    public final AbstractC3379nk<ResultT, CallbackT> m30545c(InterfaceC5235m interfaceC5235m) {
        s.k(interfaceC5235m, "external failure callback cannot be null");
        this.f8765f = interfaceC5235m;
        return this;
    }

    /* renamed from: d */
    public final AbstractC3379nk<ResultT, CallbackT> m30544d(C5988g c5988g) {
        s.k(c5988g, "firebaseApp cannot be null");
        this.f8762c = c5988g;
        return this;
    }

    /* renamed from: e */
    public final AbstractC3379nk<ResultT, CallbackT> m30543e(AbstractC5203f abstractC5203f) {
        s.k(abstractC5203f, "firebaseUser cannot be null");
        this.f8763d = abstractC5203f;
        return this;
    }

    /* renamed from: h */
    public final void m30540h(Status status) {
        this.f8778s = true;
        this.f8780u.m30658a(null, status);
    }

    /* renamed from: i */
    public final void m30539i(ResultT resultt) {
        this.f8778s = true;
        this.f8779t = resultt;
        this.f8780u.m30658a(resultt, null);
    }
}
