package p201g.p259r;

import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.e0.d.l;
import p201g.p259r.AbstractC8061y;
/* compiled from: MutableLoadStateCollection.kt */
/* renamed from: g.r.e0 */
/* loaded from: classes2.dex */
public final class C7865e0 {

    /* renamed from: a */
    private AbstractC8061y f18842a = AbstractC8061y.C8064c.f19411b.m16800b();

    /* renamed from: b */
    private AbstractC8061y f18843b = AbstractC8061y.C8064c.f19411b.m16800b();

    /* renamed from: c */
    private AbstractC8061y f18844c = AbstractC8061y.C8064c.f19411b.m16800b();

    /* compiled from: MutableLoadStateCollection.kt */
    /* renamed from: g.r.e0$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7866a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18845a;

        static {
            int[] iArr = new int[EnumC7830b0.values().length];
            iArr[EnumC7830b0.REFRESH.ordinal()] = 1;
            iArr[EnumC7830b0.APPEND.ordinal()] = 2;
            iArr[EnumC7830b0.PREPEND.ordinal()] = 3;
            f18845a = iArr;
        }
    }

    /* renamed from: a */
    public final AbstractC8061y m17127a(EnumC7830b0 enumC7830b0) {
        l.f(enumC7830b0, "loadType");
        int i = C7866a.f18845a[enumC7830b0.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.f18843b;
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.f18844c;
        }
        return this.f18842a;
    }

    /* renamed from: b */
    public final void m17126b(C7825a0 c7825a0) {
        l.f(c7825a0, "states");
        this.f18842a = c7825a0.m17216g();
        this.f18844c = c7825a0.m17218e();
        this.f18843b = c7825a0.m17217f();
    }

    /* renamed from: c */
    public final void m17125c(EnumC7830b0 enumC7830b0, AbstractC8061y abstractC8061y) {
        l.f(enumC7830b0, "type");
        l.f(abstractC8061y, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        int i = C7866a.f18845a[enumC7830b0.ordinal()];
        if (i == 1) {
            this.f18842a = abstractC8061y;
        } else if (i == 2) {
            this.f18844c = abstractC8061y;
        } else if (i != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            this.f18843b = abstractC8061y;
        }
    }

    /* renamed from: d */
    public final C7825a0 m17124d() {
        return new C7825a0(this.f18842a, this.f18843b, this.f18844c);
    }
}
