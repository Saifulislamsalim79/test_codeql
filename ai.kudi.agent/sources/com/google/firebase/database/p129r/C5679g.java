package com.google.firebase.database.p129r;

import java.util.Collections;
import java.util.List;
/* compiled from: CompoundHash.java */
/* renamed from: com.google.firebase.database.r.g */
/* loaded from: classes2.dex */
public class C5679g {

    /* renamed from: a */
    private final List<List<String>> f13947a;

    /* renamed from: b */
    private final List<String> f13948b;

    public C5679g(List<List<String>> list, List<String> list2) {
        if (list.size() == list2.size() - 1) {
            this.f13947a = list;
            this.f13948b = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    /* renamed from: a */
    public List<String> m24190a() {
        return Collections.unmodifiableList(this.f13948b);
    }

    /* renamed from: b */
    public List<List<String>> m24189b() {
        return Collections.unmodifiableList(this.f13947a);
    }
}
