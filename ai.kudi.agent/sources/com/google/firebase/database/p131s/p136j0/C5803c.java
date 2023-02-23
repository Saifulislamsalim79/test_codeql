package com.google.firebase.database.p131s.p136j0;

import com.google.firebase.database.p131s.p136j0.InterfaceC5805e;
import com.google.firebase.database.p139u.C5921b;
import com.google.firebase.database.p139u.C5938i;
import com.google.firebase.database.p139u.InterfaceC5945n;
/* compiled from: Change.java */
/* renamed from: com.google.firebase.database.s.j0.c */
/* loaded from: classes2.dex */
public class C5803c {

    /* renamed from: a */
    private final InterfaceC5805e.EnumC5806a f14249a;

    /* renamed from: b */
    private final C5938i f14250b;

    /* renamed from: c */
    private final C5938i f14251c;

    /* renamed from: d */
    private final C5921b f14252d;

    private C5803c(InterfaceC5805e.EnumC5806a enumC5806a, C5938i c5938i, C5921b c5921b, C5921b c5921b2, C5938i c5938i2) {
        this.f14249a = enumC5806a;
        this.f14250b = c5938i;
        this.f14252d = c5921b;
        this.f14251c = c5938i2;
    }

    /* renamed from: b */
    public static C5803c m23687b(C5921b c5921b, C5938i c5938i) {
        return new C5803c(InterfaceC5805e.EnumC5806a.CHILD_ADDED, c5938i, c5921b, null, null);
    }

    /* renamed from: c */
    public static C5803c m23686c(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        return m23687b(c5921b, C5938i.m23240e(interfaceC5945n));
    }

    /* renamed from: d */
    public static C5803c m23685d(C5921b c5921b, C5938i c5938i, C5938i c5938i2) {
        return new C5803c(InterfaceC5805e.EnumC5806a.CHILD_CHANGED, c5938i, c5921b, null, c5938i2);
    }

    /* renamed from: e */
    public static C5803c m23684e(C5921b c5921b, InterfaceC5945n interfaceC5945n, InterfaceC5945n interfaceC5945n2) {
        return m23685d(c5921b, C5938i.m23240e(interfaceC5945n), C5938i.m23240e(interfaceC5945n2));
    }

    /* renamed from: f */
    public static C5803c m23683f(C5921b c5921b, C5938i c5938i) {
        return new C5803c(InterfaceC5805e.EnumC5806a.CHILD_MOVED, c5938i, c5921b, null, null);
    }

    /* renamed from: g */
    public static C5803c m23682g(C5921b c5921b, C5938i c5938i) {
        return new C5803c(InterfaceC5805e.EnumC5806a.CHILD_REMOVED, c5938i, c5921b, null, null);
    }

    /* renamed from: h */
    public static C5803c m23681h(C5921b c5921b, InterfaceC5945n interfaceC5945n) {
        return m23682g(c5921b, C5938i.m23240e(interfaceC5945n));
    }

    /* renamed from: m */
    public static C5803c m23676m(C5938i c5938i) {
        return new C5803c(InterfaceC5805e.EnumC5806a.VALUE, c5938i, null, null, null);
    }

    /* renamed from: a */
    public C5803c m23688a(C5921b c5921b) {
        return new C5803c(this.f14249a, this.f14250b, this.f14252d, c5921b, this.f14251c);
    }

    /* renamed from: i */
    public C5921b m23680i() {
        return this.f14252d;
    }

    /* renamed from: j */
    public InterfaceC5805e.EnumC5806a m23679j() {
        return this.f14249a;
    }

    /* renamed from: k */
    public C5938i m23678k() {
        return this.f14250b;
    }

    /* renamed from: l */
    public C5938i m23677l() {
        return this.f14251c;
    }

    public String toString() {
        return "Change: " + this.f14249a + " " + this.f14252d;
    }
}
