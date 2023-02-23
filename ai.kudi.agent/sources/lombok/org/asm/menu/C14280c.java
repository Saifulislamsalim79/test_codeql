package lombok.org.asm.menu;

import kotlin.p476c0.InterfaceC11714d;
import kotlin.p476c0.p478k.p479a.AbstractC11738d;
@kotlin.c0.k.a.f(c = "com.smartlook.coroutines.channels.AbstractChannel", f = "AbstractChannel.kt", l = {624}, m = "receiveOrClosed-RfXmiIo")
/* renamed from: lombok.org.asm.menu.c */
/* loaded from: classes.dex */
public final class C14280c extends AbstractC11738d {

    /* renamed from: a */
    public java.lang.Object f31425a;

    /* renamed from: b */
    public java.lang.Object f31426b;

    /* renamed from: d */
    public int f31427d;

    /* renamed from: e */
    public /* synthetic */ java.lang.Object f31428e;

    /* renamed from: l */
    public final /* synthetic */ AbstractC14287i f31429l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14280c(AbstractC14287i abstractC14287i, InterfaceC11714d interfaceC11714d) {
        super(interfaceC11714d);
        this.f31429l = abstractC14287i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p476c0.p478k.p479a.AbstractC11735a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f31428e = obj;
        int $i0 = this.f31427d;
        this.f31427d = $i0 | Integer.MIN_VALUE;
        AbstractC14287i $r2 = this.f31429l;
        C14280c r3 = this;
        java.lang.Object $r1 = $r2.m2213a(r3);
        return $r1;
    }
}
