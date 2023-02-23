package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C2830d;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.C2730a.InterfaceC2734d;
import com.google.android.gms.common.api.internal.C2766f;
import com.google.android.gms.common.internal.AbstractC2854c;
import com.google.android.gms.common.internal.C2867e;
import com.google.android.gms.common.internal.InterfaceC2889l;
import com.google.android.gms.common.internal.s;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes2.dex */
public final class C2730a<O extends InterfaceC2734d> {

    /* renamed from: a */
    private final AbstractC2731a<?, O> f7701a;

    /* renamed from: b */
    private final C2740g<?> f7702b;

    /* renamed from: c */
    private final String f7703c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC2731a<T extends InterfaceC2739f, O> extends AbstractC2738e<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo15459a(Context context, Looper looper, C2867e c2867e, O o, AbstractC2743d.a aVar, AbstractC2743d.b bVar) {
            return mo16142b(context, looper, c2867e, o, aVar, bVar);
        }

        /* renamed from: b */
        public T mo16142b(Context context, Looper looper, C2867e c2867e, O o, C2766f c2766f, com.google.android.gms.common.api.internal.l lVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2732b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$c */
    /* loaded from: classes2.dex */
    public static class C2733c<C extends InterfaceC2732b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC2734d {

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC2735a extends InterfaceC2734d {
            /* renamed from: b */
            Account m32089b();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* loaded from: classes2.dex */
        public interface InterfaceC2736b extends InterfaceC2734d {
            /* renamed from: a */
            GoogleSignInAccount m32088a();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* loaded from: classes2.dex */
        public static final class C2737c implements InterfaceC2734d {
            private C2737c() {
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$e */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC2738e<T extends InterfaceC2732b, O> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$f */
    /* loaded from: classes2.dex */
    public interface InterfaceC2739f extends InterfaceC2732b {
        /* renamed from: a */
        Set<Scope> mo31732a();

        /* renamed from: b */
        void mo31968b(InterfaceC2889l interfaceC2889l, Set<Scope> set);

        /* renamed from: c */
        void mo31967c(String str);

        /* renamed from: d */
        boolean mo31966d();

        void disconnect();

        /* renamed from: f */
        String mo31965f();

        /* renamed from: g */
        void mo31964g(AbstractC2854c.InterfaceC2857c interfaceC2857c);

        /* renamed from: h */
        void mo31963h(AbstractC2854c.InterfaceC2859e interfaceC2859e);

        /* renamed from: i */
        boolean mo31238i();

        boolean isConnected();

        /* renamed from: k */
        int mo15469k();

        /* renamed from: l */
        C2830d[] mo31962l();

        /* renamed from: m */
        String mo31961m();

        /* renamed from: n */
        boolean mo15467n();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$g */
    /* loaded from: classes2.dex */
    public static final class C2740g<C extends InterfaceC2739f> extends C2733c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends InterfaceC2739f> C2730a(String str, AbstractC2731a<C, O> abstractC2731a, C2740g<C> c2740g) {
        s.k(abstractC2731a, "Cannot construct an Api with a null ClientBuilder");
        s.k(c2740g, "Cannot construct an Api with a null ClientKey");
        this.f7703c = str;
        this.f7701a = abstractC2731a;
        this.f7702b = c2740g;
    }

    /* renamed from: a */
    public final AbstractC2731a<?, O> m32092a() {
        return this.f7701a;
    }

    /* renamed from: b */
    public final C2733c<?> m32091b() {
        return this.f7702b;
    }

    /* renamed from: c */
    public final String m32090c() {
        return this.f7703c;
    }
}
