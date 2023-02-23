package com.google.firebase.database.p131s.p133h0;

import com.google.firebase.database.p131s.C5737e;
import com.google.firebase.database.p131s.C5830l;
import com.google.firebase.database.p131s.C5895z;
import com.google.firebase.database.p131s.p134i0.C5795m;
import com.google.firebase.database.p131s.p136j0.C5801a;
import com.google.firebase.database.p131s.p136j0.C5814i;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5936g;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.InterfaceC5945n;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
/* compiled from: NoopPersistenceManager.java */
/* renamed from: com.google.firebase.database.s.h0.d */
/* loaded from: classes2.dex */
public class C5757d implements InterfaceC5758e {

    /* renamed from: a */
    private boolean f14178a = false;

    /* renamed from: p */
    private void m23889p() {
        C5795m.m23744g(this.f14178a, "Transaction expected to already be in progress.");
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: a */
    public void mo23888a(long j) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: b */
    public void mo23887b(C5830l c5830l, InterfaceC5945n interfaceC5945n, long j) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: c */
    public void mo23886c(C5830l c5830l, C5737e c5737e, long j) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: d */
    public List<C5895z> mo23885d() {
        return Collections.emptyList();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: e */
    public void mo23884e(C5814i c5814i, Set<C5921b> set, Set<C5921b> set2) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: f */
    public void mo23883f(C5814i c5814i, Set<C5921b> set) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: g */
    public void mo23882g(C5814i c5814i) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: h */
    public void mo23881h(C5814i c5814i) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: i */
    public void mo23880i(C5814i c5814i) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: j */
    public <T> T mo23879j(Callable<T> callable) {
        C5795m.m23744g(!this.f14178a, "runInTransaction called when an existing transaction is already in progress.");
        this.f14178a = true;
        try {
            return callable.call();
        } finally {
        }
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: k */
    public void mo23878k(C5814i c5814i, InterfaceC5945n interfaceC5945n) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: l */
    public void mo23877l(C5830l c5830l, InterfaceC5945n interfaceC5945n) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: m */
    public void mo23876m(C5830l c5830l, C5737e c5737e) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: n */
    public void mo23875n(C5830l c5830l, C5737e c5737e) {
        m23889p();
    }

    @Override // com.google.firebase.database.p131s.p133h0.InterfaceC5758e
    /* renamed from: o */
    public C5801a mo23874o(C5814i c5814i) {
        return new C5801a(C5938i.m23239f(C5936g.m23249P(), c5814i.m23645c()), false, false);
    }
}
