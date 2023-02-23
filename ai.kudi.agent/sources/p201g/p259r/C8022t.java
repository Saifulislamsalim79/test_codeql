package p201g.p259r;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlinx.coroutines.channels.EnumC13778e;
import kotlinx.coroutines.p559q2.C14030x;
import kotlinx.coroutines.p559q2.InterfaceC13964d;
import kotlinx.coroutines.p559q2.InterfaceC14021r;
import p201g.p259r.AbstractC7982n1;
/* compiled from: HintHandler.kt */
/* renamed from: g.r.t */
/* loaded from: classes2.dex */
public final class C8022t {

    /* renamed from: a */
    private final C8024b f19324a = new C8024b(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HintHandler.kt */
    /* renamed from: g.r.t$a */
    /* loaded from: classes2.dex */
    public final class C8023a {

        /* renamed from: a */
        private AbstractC7982n1 f19325a;

        /* renamed from: b */
        private final InterfaceC14021r<AbstractC7982n1> f19326b;

        public C8023a(C8022t c8022t) {
            l.f(c8022t, "this$0");
            this.f19326b = C14030x.m3215b(1, 0, EnumC13778e.DROP_OLDEST, 2, null);
        }

        /* renamed from: a */
        public final InterfaceC13964d<AbstractC7982n1> m16884a() {
            return this.f19326b;
        }

        /* renamed from: b */
        public final AbstractC7982n1 m16883b() {
            return this.f19325a;
        }

        /* renamed from: c */
        public final void m16882c(AbstractC7982n1 abstractC7982n1) {
            this.f19325a = abstractC7982n1;
            if (abstractC7982n1 != null) {
                this.f19326b.mo3231f(abstractC7982n1);
            }
        }
    }

    /* compiled from: HintHandler.kt */
    /* renamed from: g.r.t$b */
    /* loaded from: classes2.dex */
    private final class C8024b {

        /* renamed from: a */
        private final C8023a f19327a;

        /* renamed from: b */
        private final C8023a f19328b;

        /* renamed from: c */
        private AbstractC7982n1.C7983a f19329c;

        /* renamed from: d */
        private final ReentrantLock f19330d;

        /* renamed from: e */
        final /* synthetic */ C8022t f19331e;

        public C8024b(C8022t c8022t) {
            l.f(c8022t, "this$0");
            this.f19331e = c8022t;
            this.f19327a = new C8023a(this.f19331e);
            this.f19328b = new C8023a(this.f19331e);
            this.f19330d = new ReentrantLock();
        }

        /* renamed from: a */
        public final InterfaceC13964d<AbstractC7982n1> m16881a() {
            return this.f19328b.m16884a();
        }

        /* renamed from: b */
        public final AbstractC7982n1.C7983a m16880b() {
            return this.f19329c;
        }

        /* renamed from: c */
        public final InterfaceC13964d<AbstractC7982n1> m16879c() {
            return this.f19327a.m16884a();
        }

        /* renamed from: d */
        public final void m16878d(AbstractC7982n1.C7983a c7983a, InterfaceC11771p<? super C8023a, ? super C8023a, C13666w> interfaceC11771p) {
            l.f(interfaceC11771p, "block");
            ReentrantLock reentrantLock = this.f19330d;
            reentrantLock.lock();
            if (c7983a != null) {
                try {
                    this.f19329c = c7983a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC11771p.invoke(this.f19327a, this.f19328b);
            C13666w c13666w = C13666w.f30112a;
        }
    }

    /* compiled from: HintHandler.kt */
    /* renamed from: g.r.t$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8025c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19332a;

        static {
            int[] iArr = new int[EnumC7830b0.values().length];
            iArr[EnumC7830b0.PREPEND.ordinal()] = 1;
            iArr[EnumC7830b0.APPEND.ordinal()] = 2;
            f19332a = iArr;
        }
    }

    /* compiled from: HintHandler.kt */
    /* renamed from: g.r.t$d */
    /* loaded from: classes2.dex */
    static final class C8026d extends AbstractC11802m implements InterfaceC11771p<C8023a, C8023a, C13666w> {

        /* renamed from: c */
        final /* synthetic */ EnumC7830b0 f19333c;

        /* renamed from: d */
        final /* synthetic */ AbstractC7982n1 f19334d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8026d(EnumC7830b0 enumC7830b0, AbstractC7982n1 abstractC7982n1) {
            super(2);
            this.f19333c = enumC7830b0;
            this.f19334d = abstractC7982n1;
        }

        /* renamed from: a */
        public final void m16877a(C8023a c8023a, C8023a c8023a2) {
            l.f(c8023a, "prependHint");
            l.f(c8023a2, "appendHint");
            if (this.f19333c == EnumC7830b0.PREPEND) {
                c8023a.m16882c(this.f19334d);
            } else {
                c8023a2.m16882c(this.f19334d);
            }
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(C8023a c8023a, C8023a c8023a2) {
            m16877a(c8023a, c8023a2);
            return C13666w.f30112a;
        }
    }

    /* compiled from: HintHandler.kt */
    /* renamed from: g.r.t$e */
    /* loaded from: classes2.dex */
    static final class C8027e extends AbstractC11802m implements InterfaceC11771p<C8023a, C8023a, C13666w> {

        /* renamed from: c */
        final /* synthetic */ AbstractC7982n1 f19335c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8027e(AbstractC7982n1 abstractC7982n1) {
            super(2);
            this.f19335c = abstractC7982n1;
        }

        /* renamed from: a */
        public final void m16876a(C8023a c8023a, C8023a c8023a2) {
            l.f(c8023a, "prependHint");
            l.f(c8023a2, "appendHint");
            if (C8035u.m16839a(this.f19335c, c8023a.m16883b(), EnumC7830b0.PREPEND)) {
                c8023a.m16882c(this.f19335c);
            }
            if (C8035u.m16839a(this.f19335c, c8023a2.m16883b(), EnumC7830b0.APPEND)) {
                c8023a2.m16882c(this.f19335c);
            }
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(C8023a c8023a, C8023a c8023a2) {
            m16876a(c8023a, c8023a2);
            return C13666w.f30112a;
        }
    }

    /* renamed from: a */
    public final void m16888a(EnumC7830b0 enumC7830b0, AbstractC7982n1 abstractC7982n1) {
        l.f(enumC7830b0, "loadType");
        l.f(abstractC7982n1, "viewportHint");
        if (enumC7830b0 == EnumC7830b0.PREPEND || enumC7830b0 == EnumC7830b0.APPEND) {
            this.f19324a.m16878d(null, new C8026d(enumC7830b0, abstractC7982n1));
            return;
        }
        throw new IllegalArgumentException(l.m("invalid load type for reset: ", enumC7830b0).toString());
    }

    /* renamed from: b */
    public final AbstractC7982n1.C7983a m16887b() {
        return this.f19324a.m16880b();
    }

    /* renamed from: c */
    public final InterfaceC13964d<AbstractC7982n1> m16886c(EnumC7830b0 enumC7830b0) {
        l.f(enumC7830b0, "loadType");
        int i = C8025c.f19332a[enumC7830b0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.f19324a.m16881a();
            }
            throw new IllegalArgumentException("invalid load type for hints");
        }
        return this.f19324a.m16879c();
    }

    /* renamed from: d */
    public final void m16885d(AbstractC7982n1 abstractC7982n1) {
        l.f(abstractC7982n1, "viewportHint");
        this.f19324a.m16878d(abstractC7982n1 instanceof AbstractC7982n1.C7983a ? (AbstractC7982n1.C7983a) abstractC7982n1 : null, new C8027e(abstractC7982n1));
    }
}
