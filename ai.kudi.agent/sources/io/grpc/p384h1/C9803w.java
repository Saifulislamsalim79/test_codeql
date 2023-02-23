package io.grpc.p384h1;

import com.google.common.base.C5051n;
import io.grpc.EnumC10039q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConnectivityStateManager.java */
/* renamed from: io.grpc.h1.w */
/* loaded from: classes2.dex */
public final class C9803w {

    /* renamed from: a */
    private ArrayList<C9804a> f23022a = new ArrayList<>();

    /* renamed from: b */
    private volatile EnumC10039q f23023b = EnumC10039q.IDLE;

    /* compiled from: ConnectivityStateManager.java */
    /* renamed from: io.grpc.h1.w$a */
    /* loaded from: classes2.dex */
    private static final class C9804a {

        /* renamed from: a */
        final Runnable f23024a;

        /* renamed from: b */
        final Executor f23025b;

        /* renamed from: a */
        void m13951a() {
            this.f23025b.execute(this.f23024a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m13952a(EnumC10039q enumC10039q) {
        C5051n.m25779o(enumC10039q, "newState");
        if (this.f23023b == enumC10039q || this.f23023b == EnumC10039q.SHUTDOWN) {
            return;
        }
        this.f23023b = enumC10039q;
        if (this.f23022a.isEmpty()) {
            return;
        }
        ArrayList<C9804a> arrayList = this.f23022a;
        this.f23022a = new ArrayList<>();
        Iterator<C9804a> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m13951a();
        }
    }
}
