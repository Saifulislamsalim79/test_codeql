package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C3701a4;
import com.google.android.gms.internal.measurement.C3718b4;
import com.google.android.gms.internal.measurement.C3734c4;
import com.google.android.gms.internal.measurement.C3750d4;
import com.google.android.gms.internal.measurement.C3930oc;
import com.google.android.gms.internal.measurement.C4016u4;
import com.google.android.gms.internal.measurement.C4032v4;
import com.google.android.gms.internal.measurement.C4048w4;
import com.google.android.gms.internal.measurement.C4064x4;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p201g.p218e.C7521a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.ra */
/* loaded from: classes2.dex */
public final class C4354ra {

    /* renamed from: a */
    private String f10648a;

    /* renamed from: b */
    private boolean f10649b;

    /* renamed from: c */
    private C4032v4 f10650c;

    /* renamed from: d */
    private BitSet f10651d;

    /* renamed from: e */
    private BitSet f10652e;

    /* renamed from: f */
    private Map<Integer, Long> f10653f;

    /* renamed from: g */
    private Map<Integer, List<Long>> f10654g;

    /* renamed from: h */
    final /* synthetic */ C4423xa f10655h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4354ra(C4423xa c4423xa, String str, C4342qa c4342qa) {
        this.f10655h = c4423xa;
        this.f10648a = str;
        this.f10649b = true;
        this.f10651d = new BitSet();
        this.f10652e = new BitSet();
        this.f10653f = new C7521a();
        this.f10654g = new C7521a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ BitSet m27982b(C4354ra c4354ra) {
        return c4354ra.f10651d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3718b4 m27983a(int i) {
        ArrayList arrayList;
        List list;
        C3701a4 m29802x = C3718b4.m29802x();
        m29802x.m29851r(i);
        m29802x.m29849t(this.f10649b);
        C4032v4 c4032v4 = this.f10650c;
        if (c4032v4 != null) {
            m29802x.m29848u(c4032v4);
        }
        C4016u4 m28798B = C4032v4.m28798B();
        m28798B.m28886s(C4192da.m28294J(this.f10651d));
        m28798B.m28884u(C4192da.m28294J(this.f10652e));
        Map<Integer, Long> map = this.f10653f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f10653f.keySet()) {
                int intValue = num.intValue();
                Long l = this.f10653f.get(Integer.valueOf(intValue));
                if (l != null) {
                    C3734c4 m29679y = C3750d4.m29679y();
                    m29679y.m29721s(intValue);
                    m29679y.m29722r(l.longValue());
                    arrayList2.add(m29679y.m29456k());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            m28798B.m28887r(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.f10654g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f10654g.keySet()) {
                C4048w4 m28661z = C4064x4.m28661z();
                m28661z.m28697s(num2.intValue());
                List<Long> list2 = this.f10654g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    m28661z.m28698r(list2);
                }
                arrayList3.add((C4064x4) m28661z.m29456k());
            }
            list = arrayList3;
        }
        m28798B.m28885t(list);
        m29802x.m29850s(m28798B);
        return m29802x.m29456k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m27981c(AbstractC4401va abstractC4401va) {
        int mo27847a = abstractC4401va.mo27847a();
        Boolean bool = abstractC4401va.f10746c;
        if (bool != null) {
            this.f10652e.set(mo27847a, bool.booleanValue());
        }
        Boolean bool2 = abstractC4401va.f10747d;
        if (bool2 != null) {
            this.f10651d.set(mo27847a, bool2.booleanValue());
        }
        if (abstractC4401va.f10748e != null) {
            Map<Integer, Long> map = this.f10653f;
            Integer valueOf = Integer.valueOf(mo27847a);
            Long l = map.get(valueOf);
            long longValue = abstractC4401va.f10748e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f10653f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (abstractC4401va.f10749f != null) {
            Map<Integer, List<Long>> map2 = this.f10654g;
            Integer valueOf2 = Integer.valueOf(mo27847a);
            List<Long> list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList<>();
                this.f10654g.put(valueOf2, list);
            }
            if (abstractC4401va.mo27845c()) {
                list.clear();
            }
            C3930oc.m29235b();
            if (((v5) this.f10655h).a.z().B(this.f10648a, C4173c3.f10114Z) && abstractC4401va.mo27846b()) {
                list.clear();
            }
            C3930oc.m29235b();
            if (((v5) this.f10655h).a.z().B(this.f10648a, C4173c3.f10114Z)) {
                Long valueOf3 = Long.valueOf(abstractC4401va.f10749f.longValue() / 1000);
                if (list.contains(valueOf3)) {
                    return;
                }
                list.add(valueOf3);
                return;
            }
            list.add(Long.valueOf(abstractC4401va.f10749f.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4354ra(C4423xa c4423xa, String str, C4032v4 c4032v4, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C4342qa c4342qa) {
        this.f10655h = c4423xa;
        this.f10648a = str;
        this.f10651d = bitSet;
        this.f10652e = bitSet2;
        this.f10653f = map;
        this.f10654g = new C7521a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f10654g.put(num, arrayList);
        }
        this.f10649b = false;
        this.f10650c = c4032v4;
    }
}
