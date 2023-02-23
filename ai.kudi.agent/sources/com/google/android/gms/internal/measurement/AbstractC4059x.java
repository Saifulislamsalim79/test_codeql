package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.x */
/* loaded from: classes2.dex */
public abstract class AbstractC4059x {

    /* renamed from: a */
    final List<EnumC3902n0> f9831a = new ArrayList();

    /* renamed from: a */
    public abstract q mo28588a(String str, C3968r4 c3968r4, List<q> list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final q m28671b(String str) {
        if (this.f9831a.contains(C3969r5.m29040e(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
