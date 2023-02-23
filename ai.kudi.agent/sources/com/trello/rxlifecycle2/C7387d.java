package com.trello.rxlifecycle2;

import com.trello.rxlifecycle2.p193f.C7391a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.p450e0.InterfaceC11288b;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
/* compiled from: RxLifecycle.java */
/* renamed from: com.trello.rxlifecycle2.d */
/* loaded from: classes2.dex */
public class C7387d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxLifecycle.java */
    /* renamed from: com.trello.rxlifecycle2.d$a */
    /* loaded from: classes2.dex */
    public static class C7388a implements InterfaceC11292g<R> {

        /* renamed from: c */
        final /* synthetic */ Object f17541c;

        C7388a(Object obj) {
            this.f17541c = obj;
        }

        @Override // p425j.p444e.p450e0.InterfaceC11292g
        /* renamed from: c */
        public boolean mo10557c(R r) throws Exception {
            return r.equals(this.f17541c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RxLifecycle.java */
    /* renamed from: com.trello.rxlifecycle2.d$b */
    /* loaded from: classes2.dex */
    public static class C7389b implements InterfaceC11288b<R, R, Boolean> {
        C7389b() {
        }

        @Override // p425j.p444e.p450e0.InterfaceC11288b
        /* renamed from: b */
        public Boolean mo11200a(R r, R r2) throws Exception {
            return Boolean.valueOf(r2.equals(r));
        }
    }

    /* renamed from: a */
    public static <T, R> C7386c<T> m18823a(AbstractC11688p<R> abstractC11688p) {
        return new C7386c<>(abstractC11688p);
    }

    /* renamed from: b */
    public static <T, R> C7386c<T> m18822b(AbstractC11688p<R> abstractC11688p, InterfaceC11291f<R, R> interfaceC11291f) {
        C7391a.m18816a(abstractC11688p, "lifecycle == null");
        C7391a.m18816a(interfaceC11291f, "correspondingEvents == null");
        return m18823a(m18820d(abstractC11688p.m10521Y(), interfaceC11291f));
    }

    /* renamed from: c */
    public static <T, R> C7386c<T> m18821c(AbstractC11688p<R> abstractC11688p, R r) {
        C7391a.m18816a(abstractC11688p, "lifecycle == null");
        C7391a.m18816a(r, "event == null");
        return m18823a(m18819e(abstractC11688p, r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private static <R> AbstractC11688p<Boolean> m18820d(AbstractC11688p<R> abstractC11688p, InterfaceC11291f<R, R> interfaceC11291f) {
        return AbstractC11688p.m10510i(abstractC11688p.m10507j0(1L).m10531O(interfaceC11291f), abstractC11688p.m10518b0(1L), new C7389b()).m10526T(C7383a.f17538a).m10482z(C7383a.f17539b);
    }

    /* renamed from: e */
    private static <R> AbstractC11688p<R> m18819e(AbstractC11688p<R> abstractC11688p, R r) {
        return abstractC11688p.m10482z(new C7388a(r));
    }
}
