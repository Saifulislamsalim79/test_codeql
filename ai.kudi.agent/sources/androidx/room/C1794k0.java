package androidx.room;

import androidx.room.AbstractC1802o0;
import java.util.concurrent.Executor;
import p201g.p262t.p263a.InterfaceC8094h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QueryInterceptorOpenHelperFactory.java */
/* renamed from: androidx.room.k0 */
/* loaded from: classes2.dex */
public final class C1794k0 implements InterfaceC8094h.InterfaceC8098c {

    /* renamed from: a */
    private final InterfaceC8094h.InterfaceC8098c f5469a;

    /* renamed from: b */
    private final AbstractC1802o0.InterfaceC1808f f5470b;

    /* renamed from: c */
    private final Executor f5471c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1794k0(InterfaceC8094h.InterfaceC8098c interfaceC8098c, AbstractC1802o0.InterfaceC1808f interfaceC1808f, Executor executor) {
        this.f5469a = interfaceC8098c;
        this.f5470b = interfaceC1808f;
        this.f5471c = executor;
    }

    @Override // p201g.p262t.p263a.InterfaceC8094h.InterfaceC8098c
    /* renamed from: a */
    public InterfaceC8094h mo16742a(InterfaceC8094h.C8096b c8096b) {
        return new C1792j0(this.f5469a.mo16742a(c8096b), this.f5470b, this.f5471c);
    }
}
