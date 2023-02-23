package p272h.p286c.p287a.p300b.p307d.p309b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.api.internal.C2766f;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.AbstractC2880i;
import com.google.android.gms.common.internal.C2867e;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
/* renamed from: h.c.a.b.d.b.j */
/* loaded from: classes2.dex */
public final class C8408j extends AbstractC2880i<InterfaceC8404f> {
    public C8408j(Context context, Looper looper, C2867e c2867e, C2766f c2766f, l lVar) {
        super(context, looper, 126, c2867e, c2766f, lVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: D */
    public final String mo15471D() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: E */
    protected final String mo15470E() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c, com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: k */
    public final int mo15469k() {
        return C2838h.f7921a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo15466r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof InterfaceC8404f) {
            return (InterfaceC8404f) queryLocalInterface;
        }
        return new C8403e(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: u */
    public final C2830d[] mo16127u() {
        return C8400b.f20082d;
    }
}
