package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: GsonBuilder.java */
/* renamed from: com.google.gson.g */
/* loaded from: classes2.dex */
public final class C6791g {

    /* renamed from: h */
    private String f16338h;

    /* renamed from: a */
    private Excluder f16331a = Excluder.f16348y;

    /* renamed from: b */
    private EnumC6906r f16332b = EnumC6906r.f16554c;

    /* renamed from: c */
    private InterfaceC6783e f16333c = EnumC6776d.f16310c;

    /* renamed from: d */
    private final Map<Type, InterfaceC6792h<?>> f16334d = new HashMap();

    /* renamed from: e */
    private final List<InterfaceC6915t> f16335e = new ArrayList();

    /* renamed from: f */
    private final List<InterfaceC6915t> f16336f = new ArrayList();

    /* renamed from: g */
    private boolean f16337g = false;

    /* renamed from: i */
    private int f16339i = 2;

    /* renamed from: j */
    private int f16340j = 2;

    /* renamed from: k */
    private boolean f16341k = false;

    /* renamed from: l */
    private boolean f16342l = false;

    /* renamed from: m */
    private boolean f16343m = true;

    /* renamed from: n */
    private boolean f16344n = false;

    /* renamed from: o */
    private boolean f16345o = false;

    /* renamed from: p */
    private boolean f16346p = false;

    /* renamed from: a */
    private void m20734a(String str, int i, int i2, List<InterfaceC6915t> list) {
        C6773a c6773a;
        C6773a c6773a2;
        C6773a c6773a3;
        if (str != null && !"".equals(str.trim())) {
            c6773a = new C6773a(Date.class, str);
            c6773a2 = new C6773a(Timestamp.class, str);
            c6773a3 = new C6773a(java.sql.Date.class, str);
        } else if (i == 2 || i2 == 2) {
            return;
        } else {
            C6773a c6773a4 = new C6773a(Date.class, i, i2);
            C6773a c6773a5 = new C6773a(Timestamp.class, i, i2);
            C6773a c6773a6 = new C6773a(java.sql.Date.class, i, i2);
            c6773a = c6773a4;
            c6773a2 = c6773a5;
            c6773a3 = c6773a6;
        }
        list.add(TypeAdapters.m20671a(Date.class, c6773a));
        list.add(TypeAdapters.m20671a(Timestamp.class, c6773a2));
        list.add(TypeAdapters.m20671a(java.sql.Date.class, c6773a3));
    }

    /* renamed from: b */
    public C6784f m20733b() {
        List<InterfaceC6915t> arrayList = new ArrayList<>(this.f16335e.size() + this.f16336f.size() + 3);
        arrayList.addAll(this.f16335e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f16336f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        m20734a(this.f16338h, this.f16339i, this.f16340j, arrayList);
        return new C6784f(this.f16331a, this.f16333c, this.f16334d, this.f16337g, this.f16341k, this.f16345o, this.f16343m, this.f16344n, this.f16346p, this.f16342l, this.f16332b, this.f16338h, this.f16339i, this.f16340j, this.f16335e, this.f16336f, arrayList);
    }

    /* renamed from: c */
    public C6791g m20732c() {
        this.f16346p = true;
        return this;
    }
}
