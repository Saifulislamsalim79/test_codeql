package com.google.android.gms.internal.p104firebaseauthapi;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.api.internal.C2766f;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.AbstractC2880i;
import com.google.android.gms.common.internal.C2867e;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.p099l.C2946a;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.dj */
/* loaded from: classes2.dex */
public final class C3110dj extends AbstractC2880i<InterfaceC3482rj> implements InterfaceC3083cj {

    /* renamed from: C */
    private static final C2946a f8394C = new C2946a("FirebaseAuth", "FirebaseAuth:");

    /* renamed from: A */
    private final Context f8395A;

    /* renamed from: B */
    private final C3612wj f8396B;

    public C3110dj(Context context, Looper looper, C2867e c2867e, C3612wj c3612wj, C2766f c2766f, l lVar) {
        super(context, looper, 112, c2867e, c2766f, lVar);
        s.j(context);
        this.f8395A = context;
        this.f8396B = c3612wj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: D */
    public final String mo15471D() {
        return "com.google.firebase.auth.api.internal.IFirebaseAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: E */
    protected final String mo15470E() {
        return "com.google.firebase.auth.api.gms.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: F */
    protected final String mo31240F() {
        if (this.f8396B.f8801c) {
            f8394C.m31581e("Preparing to create service connection to fallback implementation", new Object[0]);
            return this.f8395A.getPackageName();
        }
        f8394C.m31581e("Preparing to create service connection to gms implementation", new Object[0]);
        return "com.google.android.gms";
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3083cj
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ InterfaceC3482rj mo31239e() throws DeadObjectException {
        return (InterfaceC3482rj) super.m31814C();
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c, com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: i */
    public final boolean mo31238i() {
        return DynamiteModule.m31493a(this.f8395A, ModuleDescriptor.MODULE_ID) == 0;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c, com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: k */
    public final int mo15469k() {
        return C2838h.f7921a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ IInterface mo15466r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.auth.api.internal.IFirebaseAuthService");
        if (queryLocalInterface instanceof InterfaceC3482rj) {
            return (InterfaceC3482rj) queryLocalInterface;
        }
        return new C3404oj(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: u */
    public final C2830d[] mo16127u() {
        return C3441q4.f8882d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: z */
    public final Bundle mo15465z() {
        Bundle mo15465z = super.mo15465z();
        if (mo15465z == null) {
            mo15465z = new Bundle();
        }
        C3612wj c3612wj = this.f8396B;
        if (c3612wj != null) {
            mo15465z.putString("com.google.firebase.auth.API_KEY", c3612wj.m30079d());
        }
        mo15465z.putString("com.google.firebase.auth.LIBRARY_VERSION", C3057bk.m31378c());
        return mo15465z;
    }
}
