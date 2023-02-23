package kotlin.p493j0.p494o.p495c.p497p0.p544m;

import kotlin.e0.d.g;
import kotlin.e0.d.l;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.j0.o.c.p0.m.c */
/* loaded from: classes3.dex */
public abstract class AbstractC13144c {

    /* renamed from: a */
    private final boolean f29224a;

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.c$a */
    /* loaded from: classes3.dex */
    public static final class C13145a extends AbstractC13144c {

        /* renamed from: b */
        public static final C13145a f29225b = new C13145a();

        private C13145a() {
            super(false, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.c$b */
    /* loaded from: classes3.dex */
    public static final class C13146b extends AbstractC13144c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13146b(String str) {
            super(false, null);
            l.f(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.j0.o.c.p0.m.c$c */
    /* loaded from: classes3.dex */
    public static final class C13147c extends AbstractC13144c {

        /* renamed from: b */
        public static final C13147c f29226b = new C13147c();

        private C13147c() {
            super(true, null);
        }
    }

    private AbstractC13144c(boolean z) {
        this.f29224a = z;
    }

    public /* synthetic */ AbstractC13144c(boolean z, g gVar) {
        this(z);
    }

    /* renamed from: a */
    public final boolean m5733a() {
        return this.f29224a;
    }
}
