package p201g.p259r;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C13287o;
import kotlin.C13664u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13703i;
import kotlin.p557z.C13736w;
import p201g.p259r.AbstractC8061y;
/* compiled from: RemoteMediatorAccessor.kt */
/* renamed from: g.r.a */
/* loaded from: classes2.dex */
final class C7820a<Key, Value> {

    /* renamed from: a */
    private final EnumC7821a[] f18681a;

    /* renamed from: b */
    private final AbstractC8061y.C8062a[] f18682b;

    /* renamed from: c */
    private final C13703i<C7822b<Key, Value>> f18683c;

    /* compiled from: RemoteMediatorAccessor.kt */
    /* renamed from: g.r.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC7821a {
        UNBLOCKED,
        COMPLETED,
        REQUIRES_REFRESH
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    /* renamed from: g.r.a$b */
    /* loaded from: classes2.dex */
    public static final class C7822b<Key, Value> {

        /* renamed from: a */
        private final EnumC7830b0 f18688a;

        /* renamed from: b */
        private C8053w0<Key, Value> f18689b;

        public C7822b(EnumC7830b0 enumC7830b0, C8053w0<Key, Value> c8053w0) {
            l.f(enumC7830b0, "loadType");
            l.f(c8053w0, "pagingState");
            this.f18688a = enumC7830b0;
            this.f18689b = c8053w0;
        }

        /* renamed from: a */
        public final EnumC7830b0 m17226a() {
            return this.f18688a;
        }

        /* renamed from: b */
        public final C8053w0<Key, Value> m17225b() {
            return this.f18689b;
        }

        /* renamed from: c */
        public final void m17224c(C8053w0<Key, Value> c8053w0) {
            l.f(c8053w0, "<set-?>");
            this.f18689b = c8053w0;
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    /* renamed from: g.r.a$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7823c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18690a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f18691b;

        static {
            int[] iArr = new int[EnumC7821a.values().length];
            iArr[EnumC7821a.COMPLETED.ordinal()] = 1;
            iArr[EnumC7821a.REQUIRES_REFRESH.ordinal()] = 2;
            iArr[EnumC7821a.UNBLOCKED.ordinal()] = 3;
            f18690a = iArr;
            int[] iArr2 = new int[EnumC7830b0.values().length];
            iArr2[EnumC7830b0.REFRESH.ordinal()] = 1;
            f18691b = iArr2;
        }
    }

    /* compiled from: RemoteMediatorAccessor.kt */
    /* renamed from: g.r.a$d */
    /* loaded from: classes2.dex */
    static final class C7824d extends AbstractC11802m implements InterfaceC11767l<C7822b<Key, Value>, Boolean> {

        /* renamed from: c */
        final /* synthetic */ EnumC7830b0 f18692c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7824d(EnumC7830b0 enumC7830b0) {
            super(1);
            this.f18692c = enumC7830b0;
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        /* renamed from: a */
        public final Boolean invoke(C7822b<Key, Value> c7822b) {
            l.f(c7822b, "it");
            return Boolean.valueOf(c7822b.m17226a() == this.f18692c);
        }
    }

    public C7820a() {
        int length = EnumC7830b0.values().length;
        EnumC7821a[] enumC7821aArr = new EnumC7821a[length];
        for (int i = 0; i < length; i++) {
            enumC7821aArr[i] = EnumC7821a.UNBLOCKED;
        }
        this.f18681a = enumC7821aArr;
        int length2 = EnumC7830b0.values().length;
        AbstractC8061y.C8062a[] c8062aArr = new AbstractC8061y.C8062a[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            c8062aArr[i2] = null;
        }
        this.f18682b = c8062aArr;
        this.f18683c = new C13703i<>();
    }

    /* renamed from: f */
    private final AbstractC8061y m17232f(EnumC7830b0 enumC7830b0) {
        boolean z;
        EnumC7821a enumC7821a = this.f18681a[enumC7830b0.ordinal()];
        C13703i<C7822b<Key, Value>> c13703i = this.f18683c;
        boolean z2 = false;
        if (!(c13703i instanceof Collection) || !c13703i.isEmpty()) {
            Iterator<C7822b<Key, Value>> it = c13703i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next().m17226a() == enumC7830b0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z2 && enumC7821a != EnumC7821a.REQUIRES_REFRESH) {
            return AbstractC8061y.C8063b.f19410b;
        }
        AbstractC8061y.C8062a c8062a = this.f18682b[enumC7830b0.ordinal()];
        if (c8062a == null) {
            int i = C7823c.f18690a[enumC7821a.ordinal()];
            if (i == 1) {
                if (C7823c.f18691b[enumC7830b0.ordinal()] == 1) {
                    return AbstractC8061y.C8064c.f19411b.m16800b();
                }
                return AbstractC8061y.C8064c.f19411b.m16801a();
            } else if (i != 2) {
                if (i == 3) {
                    return AbstractC8061y.C8064c.f19411b.m16800b();
                }
                throw new NoWhenBranchMatchedException();
            } else {
                return AbstractC8061y.C8064c.f19411b.m16800b();
            }
        }
        return c8062a;
    }

    /* renamed from: a */
    public final boolean m17237a(EnumC7830b0 enumC7830b0, C8053w0<Key, Value> c8053w0) {
        C7822b<Key, Value> c7822b;
        boolean z;
        l.f(enumC7830b0, "loadType");
        l.f(c8053w0, "pagingState");
        Iterator<C7822b<Key, Value>> it = this.f18683c.iterator();
        while (true) {
            if (!it.hasNext()) {
                c7822b = null;
                break;
            }
            c7822b = it.next();
            if (c7822b.m17226a() == enumC7830b0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C7822b<Key, Value> c7822b2 = c7822b;
        if (c7822b2 != null) {
            c7822b2.m17224c(c8053w0);
            return false;
        }
        EnumC7821a enumC7821a = this.f18681a[enumC7830b0.ordinal()];
        if (enumC7821a == EnumC7821a.REQUIRES_REFRESH && enumC7830b0 != EnumC7830b0.REFRESH) {
            this.f18683c.add(new C7822b<>(enumC7830b0, c8053w0));
            return false;
        } else if (enumC7821a == EnumC7821a.UNBLOCKED || enumC7830b0 == EnumC7830b0.REFRESH) {
            EnumC7830b0 enumC7830b02 = EnumC7830b0.REFRESH;
            if (enumC7830b0 == enumC7830b02) {
                m17228j(enumC7830b02, null);
            }
            if (this.f18682b[enumC7830b0.ordinal()] == null) {
                return this.f18683c.add(new C7822b<>(enumC7830b0, c8053w0));
            }
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final void m17236b() {
        int length = this.f18682b.length - 1;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f18682b[i] = null;
            if (i2 > length) {
                return;
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public final void m17235c(EnumC7830b0 enumC7830b0) {
        l.f(enumC7830b0, "loadType");
        C13736w.m3846z(this.f18683c, new C7824d(enumC7830b0));
    }

    /* renamed from: d */
    public final void m17234d() {
        this.f18683c.clear();
    }

    /* renamed from: e */
    public final C7825a0 m17233e() {
        return new C7825a0(m17232f(EnumC7830b0.REFRESH), m17232f(EnumC7830b0.PREPEND), m17232f(EnumC7830b0.APPEND));
    }

    /* renamed from: g */
    public final C13287o<EnumC7830b0, C8053w0<Key, Value>> m17231g() {
        C7822b<Key, Value> c7822b;
        boolean z;
        Iterator<C7822b<Key, Value>> it = this.f18683c.iterator();
        while (true) {
            if (!it.hasNext()) {
                c7822b = null;
                break;
            }
            c7822b = it.next();
            C7822b<Key, Value> c7822b2 = c7822b;
            if (c7822b2.m17226a() == EnumC7830b0.REFRESH || this.f18681a[c7822b2.m17226a().ordinal()] != EnumC7821a.UNBLOCKED) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        C7822b<Key, Value> c7822b3 = c7822b;
        if (c7822b3 == null) {
            return null;
        }
        return C13664u.m4227a(c7822b3.m17226a(), c7822b3.m17225b());
    }

    /* renamed from: h */
    public final C8053w0<Key, Value> m17230h() {
        C7822b<Key, Value> c7822b;
        boolean z;
        Iterator<C7822b<Key, Value>> it = this.f18683c.iterator();
        while (true) {
            if (!it.hasNext()) {
                c7822b = null;
                break;
            }
            c7822b = it.next();
            if (c7822b.m17226a() == EnumC7830b0.REFRESH) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C7822b<Key, Value> c7822b2 = c7822b;
        if (c7822b2 == null) {
            return null;
        }
        return c7822b2.m17225b();
    }

    /* renamed from: i */
    public final void m17229i(EnumC7830b0 enumC7830b0, EnumC7821a enumC7821a) {
        l.f(enumC7830b0, "loadType");
        l.f(enumC7821a, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        this.f18681a[enumC7830b0.ordinal()] = enumC7821a;
    }

    /* renamed from: j */
    public final void m17228j(EnumC7830b0 enumC7830b0, AbstractC8061y.C8062a c8062a) {
        l.f(enumC7830b0, "loadType");
        this.f18682b[enumC7830b0.ordinal()] = c8062a;
    }
}
