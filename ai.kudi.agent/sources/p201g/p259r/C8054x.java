package p201g.p259r;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import java.util.List;
import kotlin.C13291q;
import kotlin.C13666w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c0.k.a.f;
import kotlin.e0.d.l;
import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p477j.C11734d;
import kotlin.p476c0.p478k.p479a.AbstractC11745k;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlinx.coroutines.AbstractC13857h0;
import kotlinx.coroutines.C13864i;
import kotlinx.coroutines.InterfaceC13932m0;
import p201g.p259r.AbstractC7938l;
import p201g.p259r.AbstractC8041v0;
/* compiled from: LegacyPagingSource.kt */
/* renamed from: g.r.x */
/* loaded from: classes2.dex */
public final class C8054x<Key, Value> extends AbstractC8041v0<Key, Value> {

    /* renamed from: a */
    private final AbstractC13857h0 f19396a;

    /* renamed from: b */
    private final AbstractC7938l<Key, Value> f19397b;

    /* renamed from: c */
    private int f19398c;

    /* compiled from: LegacyPagingSource.kt */
    @f(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: g.r.x$a */
    /* loaded from: classes2.dex */
    static final class C8055a extends AbstractC11745k implements InterfaceC11771p<InterfaceC13932m0, InterfaceC11714d<? super AbstractC8041v0.AbstractC8048b.C8050b<Key, Value>>, Object> {

        /* renamed from: c */
        int f19399c;

        /* renamed from: d */
        final /* synthetic */ C8054x<Key, Value> f19400d;

        /* renamed from: e */
        final /* synthetic */ AbstractC7938l.C7941c<Key> f19401e;

        /* renamed from: f */
        final /* synthetic */ AbstractC8041v0.AbstractC8042a<Key> f19402f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8055a(C8054x<Key, Value> c8054x, AbstractC7938l.C7941c<Key> c7941c, AbstractC8041v0.AbstractC8042a<Key> abstractC8042a, InterfaceC11714d<? super C8055a> interfaceC11714d) {
            super(2, interfaceC11714d);
            this.f19400d = c8054x;
            this.f19401e = c7941c;
            this.f19402f = abstractC8042a;
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final InterfaceC11714d<C13666w> create(Object obj, InterfaceC11714d<?> interfaceC11714d) {
            return new C8055a(this.f19400d, this.f19401e, this.f19402f, interfaceC11714d);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC13932m0 interfaceC13932m0, Object obj) {
            return invoke(interfaceC13932m0, (InterfaceC11714d) ((InterfaceC11714d) obj));
        }

        public final Object invoke(InterfaceC13932m0 interfaceC13932m0, InterfaceC11714d<? super AbstractC8041v0.AbstractC8048b.C8050b<Key, Value>> interfaceC11714d) {
            return ((C8055a) create(interfaceC13932m0, interfaceC11714d)).invokeSuspend(C13666w.f30112a);
        }

        @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
        public final Object invokeSuspend(Object obj) {
            Object m10387d;
            m10387d = C11734d.m10387d();
            int i = this.f19399c;
            if (i == 0) {
                C13291q.m5357b(obj);
                AbstractC7938l<Key, Value> m16813a = this.f19400d.m16813a();
                AbstractC7938l.C7941c<Key> c7941c = this.f19401e;
                this.f19399c = 1;
                obj = m16813a.m17021b(c7941c, this);
                if (obj == m10387d) {
                    return m10387d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13291q.m5357b(obj);
            }
            AbstractC8041v0.AbstractC8042a<Key> abstractC8042a = this.f19402f;
            AbstractC7938l.C7939a c7939a = (AbstractC7938l.C7939a) obj;
            List<Value> list = c7939a.f19058a;
            return new AbstractC8041v0.AbstractC8048b.C8050b(list, (list.isEmpty() && (abstractC8042a instanceof AbstractC8041v0.AbstractC8042a.C8046c)) ? null : c7939a.m17017d(), (c7939a.f19058a.isEmpty() && (abstractC8042a instanceof AbstractC8041v0.AbstractC8042a.C8043a)) ? null : c7939a.m17018c(), c7939a.m17019b(), c7939a.m17020a());
        }
    }

    /* renamed from: b */
    private final int m16812b(AbstractC8041v0.AbstractC8042a<Key> abstractC8042a) {
        if ((abstractC8042a instanceof AbstractC8041v0.AbstractC8042a.C8047d) && abstractC8042a.m16830b() % 3 == 0) {
            return abstractC8042a.m16830b() / 3;
        }
        return abstractC8042a.m16830b();
    }

    /* renamed from: a */
    public final AbstractC7938l<Key, Value> m16813a() {
        return this.f19397b;
    }

    /* renamed from: c */
    public final void m16811c(int i) {
        int i2 = this.f19398c;
        if (i2 == Integer.MIN_VALUE || i == i2) {
            this.f19398c = i;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.f19398c + '.').toString());
    }

    @Override // p201g.p259r.AbstractC8041v0
    public boolean getJumpingSupported() {
        this.f19397b.m17022a();
        throw null;
    }

    @Override // p201g.p259r.AbstractC8041v0
    public Key getRefreshKey(C8053w0<Key, Value> c8053w0) {
        l.f(c8053w0, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        this.f19397b.m17022a();
        throw null;
    }

    @Override // p201g.p259r.AbstractC8041v0
    public Object load(AbstractC8041v0.AbstractC8042a<Key> abstractC8042a, InterfaceC11714d<? super AbstractC8041v0.AbstractC8048b<Key, Value>> interfaceC11714d) {
        EnumC7830b0 enumC7830b0;
        if (abstractC8042a instanceof AbstractC8041v0.AbstractC8042a.C8047d) {
            enumC7830b0 = EnumC7830b0.REFRESH;
        } else if (abstractC8042a instanceof AbstractC8041v0.AbstractC8042a.C8043a) {
            enumC7830b0 = EnumC7830b0.APPEND;
        } else if (!(abstractC8042a instanceof AbstractC8041v0.AbstractC8042a.C8046c)) {
            throw new NoWhenBranchMatchedException();
        } else {
            enumC7830b0 = EnumC7830b0.PREPEND;
        }
        EnumC7830b0 enumC7830b02 = enumC7830b0;
        if (this.f19398c == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.f19398c = m16812b(abstractC8042a);
        }
        return C13864i.m3566c(this.f19396a, new C8055a(this, new AbstractC7938l.C7941c(enumC7830b02, abstractC8042a.mo16827a(), abstractC8042a.m16830b(), abstractC8042a.m16829c(), this.f19398c), abstractC8042a, null), interfaceC11714d);
    }
}
