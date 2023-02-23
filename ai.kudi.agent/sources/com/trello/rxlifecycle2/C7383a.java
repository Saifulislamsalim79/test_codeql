package com.trello.rxlifecycle2;

import io.reactivex.exceptions.C11118a;
import p425j.p444e.p450e0.InterfaceC11291f;
import p425j.p444e.p450e0.InterfaceC11292g;
/* compiled from: Functions.java */
/* renamed from: com.trello.rxlifecycle2.a */
/* loaded from: classes2.dex */
final class C7383a {

    /* renamed from: a */
    static final InterfaceC11291f<Throwable, Boolean> f17538a = new C7384a();

    /* renamed from: b */
    static final InterfaceC11292g<Boolean> f17539b = new C7385b();

    /* compiled from: Functions.java */
    /* renamed from: com.trello.rxlifecycle2.a$a */
    /* loaded from: classes2.dex */
    static class C7384a implements InterfaceC11291f<Throwable, Boolean> {
        C7384a() {
        }

        @Override // p425j.p444e.p450e0.InterfaceC11291f
        /* renamed from: b */
        public Boolean mo10663a(Throwable th) throws Exception {
            if (th instanceof OutsideLifecycleException) {
                return Boolean.TRUE;
            }
            C11118a.m11647a(th);
            throw null;
        }
    }

    /* compiled from: Functions.java */
    /* renamed from: com.trello.rxlifecycle2.a$b */
    /* loaded from: classes2.dex */
    static class C7385b implements InterfaceC11292g<Boolean> {
        C7385b() {
        }

        @Override // p425j.p444e.p450e0.InterfaceC11292g
        /* renamed from: a */
        public boolean mo10557c(Boolean bool) throws Exception {
            return bool.booleanValue();
        }
    }
}
