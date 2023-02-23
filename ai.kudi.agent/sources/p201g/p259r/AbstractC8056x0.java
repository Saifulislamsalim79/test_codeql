package p201g.p259r;

import kotlin.p476c0.InterfaceC11714d;
/* compiled from: RemoteMediator.kt */
/* renamed from: g.r.x0 */
/* loaded from: classes2.dex */
public abstract class AbstractC8056x0<Key, Value> {

    /* compiled from: RemoteMediator.kt */
    /* renamed from: g.r.x0$a */
    /* loaded from: classes2.dex */
    public enum EnumC8057a {
        LAUNCH_INITIAL_REFRESH,
        SKIP_INITIAL_REFRESH
    }

    /* compiled from: RemoteMediator.kt */
    /* renamed from: g.r.x0$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC8058b {

        /* compiled from: RemoteMediator.kt */
        /* renamed from: g.r.x0$b$a */
        /* loaded from: classes2.dex */
        public static final class C8059a extends AbstractC8058b {

            /* renamed from: a */
            private final Throwable f19406a;

            /* renamed from: a */
            public final Throwable m16807a() {
                return this.f19406a;
            }
        }

        /* compiled from: RemoteMediator.kt */
        /* renamed from: g.r.x0$b$b */
        /* loaded from: classes2.dex */
        public static final class C8060b extends AbstractC8058b {

            /* renamed from: a */
            private final boolean f19407a;

            /* renamed from: a */
            public final boolean m16806a() {
                return this.f19407a;
            }
        }

        private AbstractC8058b() {
        }
    }

    /* renamed from: a */
    public abstract Object m16810a(InterfaceC11714d<? super EnumC8057a> interfaceC11714d);

    /* renamed from: b */
    public abstract Object m16809b(EnumC7830b0 enumC7830b0, C8053w0<Key, Value> c8053w0, InterfaceC11714d<? super AbstractC8058b> interfaceC11714d);
}
