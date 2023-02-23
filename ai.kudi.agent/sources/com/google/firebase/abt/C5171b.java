package com.google.firebase.abt;

import android.content.Context;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: FirebaseABTesting.java */
/* renamed from: com.google.firebase.abt.b */
/* loaded from: classes2.dex */
public class C5171b {

    /* renamed from: a */
    private final InterfaceC6560b<InterfaceC5174a> f12885a;

    /* renamed from: b */
    private final String f12886b;

    /* renamed from: c */
    private Integer f12887c = null;

    public C5171b(Context context, InterfaceC6560b<InterfaceC5174a> interfaceC6560b, String str) {
        this.f12885a = interfaceC6560b;
        this.f12886b = str;
    }

    /* renamed from: a */
    private void m25467a(InterfaceC5174a.C5177c c5177c) {
        this.f12885a.get().mo22588b(c5177c);
    }

    /* renamed from: b */
    private void m25466b(List<C5170a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(m25464d());
        int m25461g = m25461g();
        for (C5170a c5170a : list) {
            while (arrayDeque.size() >= m25461g) {
                m25459i(((InterfaceC5174a.C5177c) arrayDeque.pollFirst()).f12895b);
            }
            InterfaceC5174a.C5177c m25471d = c5170a.m25471d(this.f12886b);
            m25467a(m25471d);
            arrayDeque.offer(m25471d);
        }
    }

    /* renamed from: c */
    private static List<C5170a> m25465c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(C5170a.m25474a(map));
        }
        return arrayList;
    }

    /* renamed from: d */
    private List<InterfaceC5174a.C5177c> m25464d() {
        return this.f12885a.get().mo22585e(this.f12886b, "");
    }

    /* renamed from: e */
    private ArrayList<C5170a> m25463e(List<C5170a> list, Set<String> set) {
        ArrayList<C5170a> arrayList = new ArrayList<>();
        for (C5170a c5170a : list) {
            if (!set.contains(c5170a.m25473b())) {
                arrayList.add(c5170a);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private ArrayList<InterfaceC5174a.C5177c> m25462f(List<InterfaceC5174a.C5177c> list, Set<String> set) {
        ArrayList<InterfaceC5174a.C5177c> arrayList = new ArrayList<>();
        for (InterfaceC5174a.C5177c c5177c : list) {
            if (!set.contains(c5177c.f12895b)) {
                arrayList.add(c5177c);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private int m25461g() {
        if (this.f12887c == null) {
            this.f12887c = Integer.valueOf(this.f12885a.get().mo22586d(this.f12886b));
        }
        return this.f12887c.intValue();
    }

    /* renamed from: i */
    private void m25459i(String str) {
        this.f12885a.get().clearConditionalUserProperty(str, null, null);
    }

    /* renamed from: j */
    private void m25458j(Collection<InterfaceC5174a.C5177c> collection) {
        for (InterfaceC5174a.C5177c c5177c : collection) {
            m25459i(c5177c.f12895b);
        }
    }

    /* renamed from: l */
    private void m25456l(List<C5170a> list) throws AbtException {
        if (list.isEmpty()) {
            m25460h();
            return;
        }
        HashSet hashSet = new HashSet();
        for (C5170a c5170a : list) {
            hashSet.add(c5170a.m25473b());
        }
        List<InterfaceC5174a.C5177c> m25464d = m25464d();
        HashSet hashSet2 = new HashSet();
        for (InterfaceC5174a.C5177c c5177c : m25464d) {
            hashSet2.add(c5177c.f12895b);
        }
        m25458j(m25462f(m25464d, hashSet));
        m25466b(m25463e(list, hashSet2));
    }

    /* renamed from: n */
    private void m25454n() throws AbtException {
        if (this.f12885a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    /* renamed from: h */
    public void m25460h() throws AbtException {
        m25454n();
        m25458j(m25464d());
    }

    /* renamed from: k */
    public void m25457k(List<Map<String, String>> list) throws AbtException {
        m25454n();
        if (list != null) {
            m25456l(m25465c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    /* renamed from: m */
    public void m25455m(C5170a c5170a) throws AbtException {
        m25454n();
        C5170a.m25469f(c5170a);
        ArrayList arrayList = new ArrayList();
        Map<String, String> m25470e = c5170a.m25470e();
        m25470e.remove("triggerEvent");
        arrayList.add(C5170a.m25474a(m25470e));
        m25466b(arrayList);
    }
}
