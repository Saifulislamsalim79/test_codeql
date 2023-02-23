package com.google.firebase.p169n;

import android.content.Context;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.C5315w;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.p169n.InterfaceC6555f;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: DefaultHeartBeatInfo.java */
/* renamed from: com.google.firebase.n.d */
/* loaded from: classes2.dex */
public class C6553d implements InterfaceC6555f {

    /* renamed from: b */
    private static final ThreadFactory f15822b = ThreadFactoryC6550a.f15819c;

    /* renamed from: a */
    private InterfaceC6560b<C6557g> f15823a;

    private C6553d(final Context context, Set<InterfaceC6554e> set) {
        this(new C5315w(new InterfaceC6560b() { // from class: com.google.firebase.n.c
            @Override // com.google.firebase.p170o.InterfaceC6560b
            public final Object get() {
                C6557g m21643a;
                m21643a = C6557g.m21643a(context);
                return m21643a;
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f15822b));
    }

    /* renamed from: b */
    public static C5296n<InterfaceC6555f> m21649b() {
        C5296n.C5298b m25229a = C5296n.m25229a(InterfaceC6555f.class);
        m25229a.m25214b(C5313u.m25157j(Context.class));
        m25229a.m25214b(C5313u.m25155l(InterfaceC6554e.class));
        m25229a.m25210f(C6551b.f15820a);
        return m25229a.m25212d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ InterfaceC6555f m21648c(InterfaceC5299o interfaceC5299o) {
        return new C6553d((Context) interfaceC5299o.mo25206a(Context.class), interfaceC5299o.mo25205d(InterfaceC6554e.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static /* synthetic */ Thread m21646e(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // com.google.firebase.p169n.InterfaceC6555f
    /* renamed from: a */
    public InterfaceC6555f.EnumC6556a mo21645a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean m21640d = this.f15823a.get().m21640d(str, currentTimeMillis);
        boolean m21641c = this.f15823a.get().m21641c(currentTimeMillis);
        if (m21640d && m21641c) {
            return InterfaceC6555f.EnumC6556a.COMBINED;
        }
        if (m21641c) {
            return InterfaceC6555f.EnumC6556a.GLOBAL;
        }
        if (m21640d) {
            return InterfaceC6555f.EnumC6556a.SDK;
        }
        return InterfaceC6555f.EnumC6556a.NONE;
    }

    C6553d(InterfaceC6560b<C6557g> interfaceC6560b, Set<InterfaceC6554e> set, Executor executor) {
        this.f15823a = interfaceC6560b;
    }
}
