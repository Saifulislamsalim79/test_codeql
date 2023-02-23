package io.grpc.p384h1;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import com.google.common.base.C5051n;
import io.grpc.AbstractC9520g;
import io.grpc.C9504d0;
import io.grpc.C9526h0;
import java.text.MessageFormat;
import java.util.logging.Level;
/* compiled from: ChannelLoggerImpl.java */
/* renamed from: io.grpc.h1.n */
/* loaded from: classes2.dex */
final class C9719n extends AbstractC9520g {

    /* renamed from: a */
    private final C9725o f22815a;

    /* renamed from: b */
    private final InterfaceC9708l2 f22816b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChannelLoggerImpl.java */
    /* renamed from: io.grpc.h1.n$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C9720a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22817a;

        static {
            int[] iArr = new int[AbstractC9520g.EnumC9521a.values().length];
            f22817a = iArr;
            try {
                iArr[AbstractC9520g.EnumC9521a.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22817a[AbstractC9520g.EnumC9521a.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9719n(C9725o c9725o, InterfaceC9708l2 interfaceC9708l2) {
        C5051n.m25779o(c9725o, "tracer");
        this.f22815a = c9725o;
        C5051n.m25779o(interfaceC9708l2, TransactionField.TIME);
        this.f22816b = interfaceC9708l2;
    }

    /* renamed from: c */
    private boolean m14133c(AbstractC9520g.EnumC9521a enumC9521a) {
        return enumC9521a != AbstractC9520g.EnumC9521a.DEBUG && this.f22815a.m14121c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m14132d(C9526h0 c9526h0, AbstractC9520g.EnumC9521a enumC9521a, String str) {
        Level m14130f = m14130f(enumC9521a);
        if (C9725o.f22825e.isLoggable(m14130f)) {
            C9725o.m14120d(c9526h0, m14130f, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m14131e(C9526h0 c9526h0, AbstractC9520g.EnumC9521a enumC9521a, String str, Object... objArr) {
        Level m14130f = m14130f(enumC9521a);
        if (C9725o.f22825e.isLoggable(m14130f)) {
            C9725o.m14120d(c9526h0, m14130f, MessageFormat.format(str, objArr));
        }
    }

    /* renamed from: f */
    private static Level m14130f(AbstractC9520g.EnumC9521a enumC9521a) {
        int i = C9720a.f22817a[enumC9521a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return Level.FINEST;
            }
            return Level.FINER;
        }
        return Level.FINE;
    }

    /* renamed from: g */
    private static C9504d0.EnumC9506b m14129g(AbstractC9520g.EnumC9521a enumC9521a) {
        int i = C9720a.f22817a[enumC9521a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return C9504d0.EnumC9506b.CT_INFO;
            }
            return C9504d0.EnumC9506b.CT_WARNING;
        }
        return C9504d0.EnumC9506b.CT_ERROR;
    }

    /* renamed from: h */
    private void m14128h(AbstractC9520g.EnumC9521a enumC9521a, String str) {
        if (enumC9521a == AbstractC9520g.EnumC9521a.DEBUG) {
            return;
        }
        C9725o c9725o = this.f22815a;
        C9504d0.C9505a c9505a = new C9504d0.C9505a();
        c9505a.m14544b(str);
        c9505a.m14543c(m14129g(enumC9521a));
        c9505a.m14541e(this.f22816b.mo14158a());
        c9725o.m14118f(c9505a.m14545a());
    }

    @Override // io.grpc.AbstractC9520g
    /* renamed from: a */
    public void mo13868a(AbstractC9520g.EnumC9521a enumC9521a, String str) {
        m14132d(this.f22815a.m14122b(), enumC9521a, str);
        if (m14133c(enumC9521a)) {
            m14128h(enumC9521a, str);
        }
    }

    @Override // io.grpc.AbstractC9520g
    /* renamed from: b */
    public void mo13867b(AbstractC9520g.EnumC9521a enumC9521a, String str, Object... objArr) {
        mo13868a(enumC9521a, (m14133c(enumC9521a) || C9725o.f22825e.isLoggable(m14130f(enumC9521a))) ? MessageFormat.format(str, objArr) : null);
    }
}
