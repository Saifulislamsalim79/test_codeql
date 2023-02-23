package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.p160p.AbstractC6447d;
import com.google.firebase.installations.p162r.C6464b;
import com.google.firebase.installations.p162r.InterfaceC6463a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* compiled from: Utils.java */
/* renamed from: com.google.firebase.installations.n */
/* loaded from: classes2.dex */
public final class C6439n {

    /* renamed from: b */
    public static final long f15545b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f15546c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C6439n f15547d;

    /* renamed from: a */
    private final InterfaceC6463a f15548a;

    private C6439n(InterfaceC6463a interfaceC6463a) {
        this.f15548a = interfaceC6463a;
    }

    /* renamed from: c */
    public static C6439n m22033c() {
        return m22032d(C6464b.m21941a());
    }

    /* renamed from: d */
    public static C6439n m22032d(InterfaceC6463a interfaceC6463a) {
        if (f15547d == null) {
            f15547d = new C6439n(interfaceC6463a);
        }
        return f15547d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m22029g(String str) {
        return f15546c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m22028h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m22035a() {
        return this.f15548a.currentTimeMillis();
    }

    /* renamed from: b */
    public long m22034b() {
        return TimeUnit.MILLISECONDS.toSeconds(m22035a());
    }

    /* renamed from: e */
    public long m22031e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m22030f(AbstractC6447d abstractC6447d) {
        return TextUtils.isEmpty(abstractC6447d.mo22013b()) || abstractC6447d.mo22007h() + abstractC6447d.mo22012c() < m22034b() + f15545b;
    }
}
