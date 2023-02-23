package p272h.p286c.p287a.p300b.p320f.p321b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.p097a.C2695a;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.C2838h;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.internal.AbstractC2854c;
import com.google.android.gms.common.internal.AbstractC2880i;
import com.google.android.gms.common.internal.C2867e;
import com.google.android.gms.common.internal.C2914s0;
import com.google.android.gms.common.internal.s;
import p272h.p286c.p287a.p300b.p320f.InterfaceC9224g;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.b.a */
/* loaded from: classes2.dex */
public class C9207a extends AbstractC2880i<C9213g> implements InterfaceC9224g {

    /* renamed from: E */
    public static final /* synthetic */ int f21603E = 0;

    /* renamed from: A */
    private final boolean f21604A;

    /* renamed from: B */
    private final C2867e f21605B;

    /* renamed from: C */
    private final Bundle f21606C;

    /* renamed from: D */
    private final Integer f21607D;

    public C9207a(Context context, Looper looper, boolean z, C2867e c2867e, Bundle bundle, AbstractC2743d.a aVar, AbstractC2743d.b bVar) {
        super(context, looper, 44, c2867e, aVar, bVar);
        this.f21604A = true;
        this.f21605B = c2867e;
        this.f21606C = bundle;
        this.f21607D = c2867e.m31757g();
    }

    /* renamed from: k0 */
    public static Bundle m15468k0(C2867e c2867e) {
        c2867e.m31758f();
        Integer m31757g = c2867e.m31757g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c2867e.m31763a());
        if (m31757g != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m31757g.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: D */
    public final String mo15471D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: E */
    protected final String mo15470E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p272h.p286c.p287a.p300b.p320f.InterfaceC9224g
    /* renamed from: j */
    public final void mo15458j(InterfaceC9212f interfaceC9212f) {
        s.k(interfaceC9212f, "Expecting a valid ISignInCallbacks");
        try {
            Account m31762b = this.f21605B.m31762b();
            GoogleSignInAccount m32149b = "<<default account>>".equals(m31762b.name) ? C2695a.m32150a(m31773x()).m32149b() : null;
            Integer num = this.f21607D;
            s.j(num);
            ((C9213g) m31814C()).m15462p1(new C9216j(1, new C2914s0(m31762b, num.intValue(), m32149b)), interfaceC9212f);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC9212f.mo15463J(new C9218l(1, new C2826b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c, com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: k */
    public final int mo15469k() {
        return C2838h.f7921a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC2854c, com.google.android.gms.common.api.C2730a.InterfaceC2739f
    /* renamed from: n */
    public final boolean mo15467n() {
        return this.f21604A;
    }

    @Override // p272h.p286c.p287a.p300b.p320f.InterfaceC9224g
    /* renamed from: o */
    public final void mo15457o() {
        m31783g(new AbstractC2854c.C2858d());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo15466r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C9213g ? (C9213g) queryLocalInterface : new C9213g(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2854c
    /* renamed from: z */
    public final Bundle mo15465z() {
        if (!m31773x().getPackageName().equals(this.f21605B.m31760d())) {
            this.f21606C.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f21605B.m31760d());
        }
        return this.f21606C;
    }
}
