package p201g.p259r;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: LoadState.kt */
/* renamed from: g.r.y */
/* loaded from: classes2.dex */
public abstract class AbstractC8061y {

    /* renamed from: a */
    private final boolean f19408a;

    /* compiled from: LoadState.kt */
    /* renamed from: g.r.y$a */
    /* loaded from: classes2.dex */
    public static final class C8062a extends AbstractC8061y {

        /* renamed from: b */
        private final Throwable f19409b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8062a(Throwable th) {
            super(false, null);
            l.f(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            this.f19409b = th;
        }

        /* renamed from: b */
        public final Throwable m16804b() {
            return this.f19409b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C8062a) {
                C8062a c8062a = (C8062a) obj;
                if (m16805a() == c8062a.m16805a() && l.b(this.f19409b, c8062a.f19409b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return b.a(m16805a()) + this.f19409b.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + m16805a() + ", error=" + this.f19409b + ')';
        }
    }

    /* compiled from: LoadState.kt */
    /* renamed from: g.r.y$b */
    /* loaded from: classes2.dex */
    public static final class C8063b extends AbstractC8061y {

        /* renamed from: b */
        public static final C8063b f19410b = new C8063b();

        private C8063b() {
            super(false, null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C8063b) && m16805a() == ((C8063b) obj).m16805a();
        }

        public int hashCode() {
            return b.a(m16805a());
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + m16805a() + ')';
        }
    }

    /* compiled from: LoadState.kt */
    /* renamed from: g.r.y$c */
    /* loaded from: classes2.dex */
    public static final class C8064c extends AbstractC8061y {

        /* renamed from: b */
        public static final C8065a f19411b = new C8065a(null);

        /* renamed from: c */
        private static final C8064c f19412c = new C8064c(true);

        /* renamed from: d */
        private static final C8064c f19413d = new C8064c(false);

        /* compiled from: LoadState.kt */
        /* renamed from: g.r.y$c$a */
        /* loaded from: classes2.dex */
        public static final class C8065a {
            private C8065a() {
            }

            public /* synthetic */ C8065a(g gVar) {
                this();
            }

            /* renamed from: a */
            public final C8064c m16801a() {
                return C8064c.f19412c;
            }

            /* renamed from: b */
            public final C8064c m16800b() {
                return C8064c.f19413d;
            }
        }

        public C8064c(boolean z) {
            super(z, null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof C8064c) && m16805a() == ((C8064c) obj).m16805a();
        }

        public int hashCode() {
            return b.a(m16805a());
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + m16805a() + ')';
        }
    }

    private AbstractC8061y(boolean z) {
        this.f19408a = z;
    }

    public /* synthetic */ AbstractC8061y(boolean z, g gVar) {
        this(z);
    }

    /* renamed from: a */
    public final boolean m16805a() {
        return this.f19408a;
    }
}
