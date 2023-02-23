package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC3914nc;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.s4 */
/* loaded from: classes2.dex */
final class C4360s4 implements InterfaceC3914nc {

    /* renamed from: a */
    final /* synthetic */ String f10660a;

    /* renamed from: b */
    final /* synthetic */ C4372t4 f10661b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4360s4(C4372t4 c4372t4, String str) {
        this.f10661b = c4372t4;
        this.f10660a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3914nc
    /* renamed from: e */
    public final String mo27973e(String str) {
        Map map;
        map = this.f10661b.f10672d;
        Map map2 = (Map) map.get(this.f10660a);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
