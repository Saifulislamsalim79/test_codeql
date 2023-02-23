package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.play.core.assetpacks.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4844c {
    /* renamed from: a */
    public static AbstractC4844c m26133a(long j, Map<String, AbstractC4839b> map) {
        return new C4870h0(j, map);
    }

    /* renamed from: b */
    public static AbstractC4844c m26132b(Bundle bundle, C4939x0 c4939x0) {
        return m26131c(bundle, c4939x0, new ArrayList());
    }

    /* renamed from: c */
    public static AbstractC4844c m26131c(Bundle bundle, C4939x0 c4939x0, List<String> list) {
        return m26130d(bundle, c4939x0, list, C4835a0.f12253a);
    }

    /* renamed from: d */
    private static AbstractC4844c m26130d(Bundle bundle, C4939x0 c4939x0, List<String> list, InterfaceC4942y interfaceC4942y) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AbstractC4839b.m26169a(bundle, str, c4939x0, interfaceC4942y));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = list.get(i2);
            hashMap.put(str2, AbstractC4839b.m26168b(str2, 4, 0, 0L, 0L, 0.0d));
        }
        return m26133a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: e */
    public abstract Map<String, AbstractC4839b> mo26113e();

    /* renamed from: f */
    public abstract long mo26112f();
}
