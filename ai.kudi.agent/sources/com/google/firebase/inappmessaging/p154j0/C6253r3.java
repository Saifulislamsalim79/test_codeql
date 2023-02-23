package com.google.firebase.inappmessaging.p154j0;

import p272h.p286c.p355d.p356a.p357a.p358a.C9370c;
import p272h.p286c.p355d.p356a.p357a.p358a.p359e.C9388e;
/* compiled from: TestDeviceHelper.java */
/* renamed from: com.google.firebase.inappmessaging.j0.r3 */
/* loaded from: classes2.dex */
public class C6253r3 {

    /* renamed from: a */
    private final C6248q3 f15174a;

    /* renamed from: d */
    private int f15177d = 0;

    /* renamed from: c */
    private boolean f15176c = m22474d();

    /* renamed from: b */
    private boolean f15175b = m22473e();

    public C6253r3(C6248q3 c6248q3) {
        this.f15174a = c6248q3;
    }

    /* renamed from: d */
    private boolean m22474d() {
        return this.f15174a.m22486a("fresh_install", true);
    }

    /* renamed from: e */
    private boolean m22473e() {
        return this.f15174a.m22486a("test_device", false);
    }

    /* renamed from: f */
    private void m22472f(boolean z) {
        this.f15176c = z;
        this.f15174a.m22481f("fresh_install", z);
    }

    /* renamed from: g */
    private void m22471g(boolean z) {
        this.f15175b = z;
        this.f15174a.m22481f("test_device", z);
    }

    /* renamed from: h */
    private void m22470h() {
        if (this.f15176c) {
            int i = this.f15177d + 1;
            this.f15177d = i;
            if (i >= 5) {
                m22472f(false);
            }
        }
    }

    /* renamed from: a */
    public boolean m22477a() {
        return this.f15176c;
    }

    /* renamed from: b */
    public boolean m22476b() {
        return this.f15175b;
    }

    /* renamed from: c */
    public void m22475c(C9388e c9388e) {
        if (this.f15175b) {
            return;
        }
        m22470h();
        for (C9370c c9370c : c9388e.m14869V()) {
            if (c9370c.m14933V()) {
                m22471g(true);
                C6163c3.m22619c("Setting this device as a test device");
                return;
            }
        }
    }
}
